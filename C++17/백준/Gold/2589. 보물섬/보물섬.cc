#include<stdio.h>
#include<algorithm>
#define RANGE 60
using namespace std;
char land[RANGE][RANGE];
int map[RANGE][RANGE],q[RANGE*RANGE],dab[RANGE][RANGE],xp[4]={1,-1,0,0},yp[4]={0,0,1,-1};
pair<int,int>loc[RANGE*RANGE];
int main()
{
	int x,y,bt=-1,top=-1,a,b,result=0;
	scanf("%d%d",&x,&y);
	for(int i=0;i<x;i++) scanf("%s",&land[i]);
	for(int i=0;i<x;i++) for(int j=0;j<y;j++) if(land[i][j]=='L') map[i][j]=1;
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<y;j++)
		{
			if(map[i][j])
			{
				bt=-1;
				top=-1;
				loc[++top].first=i;
				loc[top].second=j;
				dab[i][j]=1;
				while(bt!=top)
				{
					a=loc[++bt].first;
					b=loc[bt].second;
					if(dab[a][b]>result) result=dab[a][b];
					for(int k=0;k<4;k++)
					{
						if(a+xp[k]>=0&&b+yp[k]>=0&&a+xp[k]<x&&b+yp[k]<y&&map[a+xp[k]][b+yp[k]]==1&&dab[a+xp[k]][b+yp[k]]==0)
						{
							loc[++top].first=a+xp[k];
							loc[top].second=b+yp[k];
							dab[a+xp[k]][b+yp[k]]=dab[a][b]+1;
						}
					}
				}
			}
			for(int k=0;k<x;k++) for(int l=0;l<y;l++) dab[k][l]=0;
		}
	}
	printf("%d",result-1);
	
	return 0;
}