#include<stdio.h>
#include<algorithm>
#include<vector>
#define RANGE 1001
using namespace std;
int chk[RANGE],q[RANGE],ba=0,bt=-1,top=-1,cnt=0;
vector<int> singer[RANGE];
int main()
{
	int a,b;
	scanf("%d%d",&a,&b);
	for(int i=0;i<b;i++)
	{
		int num1;
		scanf("%d",&num1);
		for(int j=1;j<=num1;j++)
		{
			int num2;
			scanf("%d",&num2);
			if(ba>0) 
			{
				singer[ba].push_back(num2);
				chk[num2]++;
			}
			ba=num2;
		}
		ba=0;
	}
	for(int i=1;i<=a;i++) 
	{
		if(chk[i]==0) 
		{
			cnt++;
			q[++top]=i;
		}
	}
	while(1)
	{
		if(bt==a) break;
		int c=q[++bt];
		for(int i=0;i<singer[c].size();i++)
		{
			chk[singer[c][i]]--;
			if(chk[singer[c][i]]==0)
			{
				cnt++;
				q[++top]=singer[c][i];
			}
		}
	}
	
	if(cnt!=a) printf("0");
	else for(int i=0;i<a;i++) printf("%d\n",q[i]);
	return 0;
}