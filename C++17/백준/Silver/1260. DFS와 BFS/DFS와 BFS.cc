#include<stdio.h>
#include<vector>
#include<algorithm>
using namespace std;
vector<int> map[1010];
int jung,gan,fir,bt=-1,top=-1,q[10000],chk[1010];
void dfs(int x)
{
	printf("%d ",x);
	chk[x]=1;
	for(int i=0;i<map[x].size();i++)
	{
		int a=map[x].at(i);
		if(chk[a]==0) dfs(a);
	}
}
void bfs(int y)
{
	q[++top]=fir;
	printf("%d ",q[top]);
	chk[y]=1;
	while(top!=bt)
	{
		int a=q[++bt];
		for(int i=0;i<map[a].size();i++)
		{
			int b=map[a].at(i);
			if(chk[b]==0)
			{
				chk[b]=1;
				q[++top]=b;
				printf("%d ",b);
			}
		}
	}
}
int main()
{
	scanf("%d%d%d",&jung,&gan,&fir);
	for(int i=0;i<gan;i++) 
	{
		int num1,num2;
		scanf("%d%d",&num1,&num2);
		map[num1].push_back(num2);
		map[num2].push_back(num1);
	}
	for(int i=1;i<=jung;i++) sort(map[i].begin(),map[i].end());
	dfs(fir);
	for(int i=0;i<1010;i++) chk[i]=0;
	printf("\n");
	bfs(fir);
	
	return 0;
}