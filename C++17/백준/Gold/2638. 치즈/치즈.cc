#include<stdio.h>
#include<algorithm>
#define RANGE 110
using namespace std;
int map[RANGE][RANGE],dab[RANGE][RANGE],x,y,bt=-1,top=-1,xp[4]={1,-1,0,0},yp[4]={0,0,1,-1},cnt=0,a,b;
pair<int,int>loc[RANGE*RANGE];
void chk(int btt, int tp, int q, int w)
{
	loc[++tp].first=1;
	loc[tp].second=1;
	map[1][1]=-1;
	while(btt!=tp)
	{
		a=loc[++btt].first;
		b=loc[btt].second;
		for(int i=0;i<4;i++)
		{
			if(a+xp[i]>0&&b+yp[i]>0&&a+xp[i]<=q&&b+yp[i]<=w)
			{
				if(map[a+xp[i]][b+yp[i]]==0)
				{
					loc[++tp].first=a+xp[i];
					loc[tp].second=b+yp[i];
					map[a+xp[i]][b+yp[i]]=-1;
				}
				else if(map[a+xp[i]][b+yp[i]]==1) dab[a+xp[i]][b+yp[i]]++;
			}
		}
	}
}
int main()
{
	int sum=1;
	scanf("%d%d",&x,&y);
	for(int i=1;i<=x;i++) for(int j=1;j<=y;j++) scanf("%d",&map[i][j]);
	while(sum!=0)
	{
		cnt++;
		sum=0;
		chk(bt,top,x,y);
		for(int i=1;i<=x;i++) for(int j=1;j<=y;j++) if(dab[i][j]>=2) map[i][j]=0;
		for(int i=1;i<=x;i++) for(int j=1;j<=y;j++) if(map[i][j]==-1) map[i][j]=0;
		for(int i=1;i<=x;i++) for(int j=1;j<=y;j++) dab[i][j]=0;
		
		for(int i=1;i<=x;i++) for(int j=1;j<=y;j++) sum+=map[i][j];
	}

	printf("%d",cnt);
	return 0;
}