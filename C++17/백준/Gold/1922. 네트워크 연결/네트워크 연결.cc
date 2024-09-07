#include<stdio.h>
#include<algorithm>
#define RANGE 1010
int N,M,a,b,c,chk[RANGE],map[RANGE][RANGE],temp[RANGE],result=0,index=0,end=0;
void dfs(int x)
{
	if(end==N) return;
	chk[x]=1;
	int min=99999;
	for(int i=1;i<=N;i++) if(chk[i]==0&&map[x][i]<=temp[i]) temp[i]=map[x][i];
	for(int i=1;i<=N;i++) 
	{
		if(chk[i]==0&&temp[i]<=min) 
		{
			min=temp[i]; 
			index=i;
		}
	}
	end+=1;
	dfs(index);
}
int main()
{
	scanf("%d%d",&N,&M);
	for(int i=1;i<=N;i++) for(int j=1;j<=N;j++) map[i][j]=99999;
	for(int i=1;i<=N;i++) temp[i]=99999;
	for(int i=0;i<M;i++)
	{
		scanf("%d%d%d",&a,&b,&c);
		map[a][b]=c;
		map[b][a]=c;
	}
	dfs(1);
	for(int i=2;i<=N;i++) result+=temp[i];
	printf("%d",result);

	return 0;
}