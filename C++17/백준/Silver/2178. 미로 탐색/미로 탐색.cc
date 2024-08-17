#include<stdio.h>
#include<algorithm>
#define RANGE 110
using namespace std;
int road[RANGE][RANGE],cha[RANGE][RANGE],xp[4]={1,-1,0,0},yp[4]={0,0,1,-1};
pair<int,int>loc[RANGE*RANGE];
int main()
{
	int x,y,bt=-1,top=-1,a,b;
	scanf("%d%d",&x,&y);
	for(int i=1;i<=x;i++) for(int j=1;j<=y;j++) scanf("%1d",&road[i][j]);
	loc[++top].first=1;
	loc[top].second=1;
	road[1][1]=0;
	while(bt!=top)
	{
		a=loc[++bt].first;
		b=loc[bt].second;
		for(int i=0;i<4;i++)
		{
			if(a+xp[i]>0&&b+yp[i]>0&&a+xp[i]<=x&&b+yp[i]<=y&&road[a+xp[i]][b+yp[i]]==1&&cha[a+xp[i]][b+yp[i]]==0)
			{
				loc[++top].first=a+xp[i];
				loc[top].second=b+yp[i];
				cha[a+xp[i]][b+yp[i]]=cha[a][b]+1;
			}
		}
	}
	printf("%d",cha[x][y]+1);
	return 0;
}