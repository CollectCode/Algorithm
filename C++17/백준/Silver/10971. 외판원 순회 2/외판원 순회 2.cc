#include<stdio.h>
#include<algorithm>
#define RANGE 11
int chk[RANGE],num,mine=1000000001,map[RANGE][RANGE];
void dfs(int x,int jung,int sum)
{
	int i;
	if(mine<=sum) return;
	if(jung==num-1) 
	{
		if(map[x][1]>0&&sum+map[x][1]<mine) mine=sum+map[x][1];
		return;
	}
	for(i=1;i<=num;i++) 
	{
		if(chk[i]==0&&map[x][i]>0) 
		{
			chk[i]=1;
			dfs(i,jung+1,sum+map[x][i]);
			chk[i]=0;
		}
	}
}
int main()
{
	int i,j;
	scanf("%d",&num);
	for(i=1;i<=num;i++) for(j=1;j<=num;j++) scanf("%d",&map[i][j]);
	chk[1]=1;
	dfs(1,0,0);
	printf("%d",mine);
	return 0;
}