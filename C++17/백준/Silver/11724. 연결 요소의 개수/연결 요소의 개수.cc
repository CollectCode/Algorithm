#include<stdio.h>
#include<vector>
#include<algorithm>
#define RANGE 1001000
using namespace std;
int jung,gan,q[RANGE],chk[RANGE],cnt=0;
vector<int> map[RANGE];
void dfs(int x)
{
	for(int i=0;i<map[x].size();i++)
	{
		int a=map[x].at(i);
		if(chk[a]==0)
		{
			chk[a]=1;
			dfs(a);
		}
	}
}
int main()
{
	scanf("%d%d",&jung,&gan);
	for(int i=0;i<gan;i++)
	{
		int num1,num2;
		scanf("%d%d",&num1,&num2);
		map[num1].push_back(num2);
		map[num2].push_back(num1);
	}
	for(int i=1;i<=gan;i++) sort(map[i].begin(),map[i].end());
	for(int i=1;i<=jung;i++) 
	{
		if(chk[i]==0) 
		{
			dfs(i);
			cnt++;
		}
	}
	printf("%d", cnt);
	return 0;
}