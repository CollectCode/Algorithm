#include<stdio.h>
#include<algorithm>
#define RANGE 110
using namespace std;
int road[RANGE][RANGE],cha[RANGE][RANGE],xp[4]={1,-1,0,0},yp[4]={0,0,1,-1};
pair<int,int>loc[RANGE*RANGE];
int main()
{
	int x,y,bt=0,top=0,a,b;
	scanf("%d%d",&x,&y);
	for(int i=1;i<=x;i++) for(int j=1;j<=y;j++) scanf("%1d",&road[i][j]);
	loc[top].first=1;
	loc[top++].second=1;
	cha[1][1]=1;
	while(bt!=top)
	{
		a=loc[bt].first;
		b=loc[bt].second;
		road[a][b]=0;
		if(a==x&&b==y) break;
		for(int i=0;i<4;i++)
		{
			if(a+xp[i]>0&&b+yp[i]>0&&a+xp[i]<=x&&b+yp[i]<=y&&road[a+xp[i]][b+yp[i]]==1&&cha[a+xp[i]][b+yp[i]]==0)
			{
				loc[top].first=a+xp[i];
				loc[top++].second=b+yp[i];
				cha[a+xp[i]][b+yp[i]]=cha[a][b]+1;
			}
		}
		bt++;
	}
	printf("%d\n",cha[x][y]);
	return 0;
}