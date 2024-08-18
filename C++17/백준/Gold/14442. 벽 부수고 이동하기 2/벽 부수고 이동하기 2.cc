#include<stdio.h>
#include<algorithm>
#define RANGE 1010
using namespace std;
int map[RANGE][RANGE],cha[11][RANGE][RANGE],q,w,e,result=-1;
int xp[4]={1,-1,0,0};
int yp[4]={0,0,1,-1};
struct lo
{
	int a,b,c;
}loc[RANGE*RANGE*11];
int main()
{
	int n,m,k,bt=-1,top=-1;
	scanf("%d%d%d",&n,&m,&k);
	for(int i=1;i<=n;i++) for(int j=1;j<=m;j++) scanf("%1d",&map[i][j]);
	loc[++top].a=1;
	loc[top].b=1;
	loc[top].c=0;
	cha[0][1][1]=1;
	while(bt!=top)
	{
		q=loc[++bt].a;
		w=loc[bt].b;
		e=loc[bt].c;
		if(q==n&&w==m) 
		{
			result=cha[e][q][w]; 
			break;
		}
		for(int i=0;i<4;i++)
		{
			if(q+xp[i]>0&&w+yp[i]>0&&q+xp[i]<=n&&w+yp[i]<=m)
			{
				if(cha[e][q+xp[i]][w+yp[i]]==0&&map[q+xp[i]][w+yp[i]]==0)
				{
					loc[++top].a=q+xp[i];
					loc[top].b=w+yp[i];
					loc[top].c=e;
					cha[e][q+xp[i]][w+yp[i]]=cha[e][q][w]+1;
				} 
				if(cha[e+1][q+xp[i]][w+yp[i]]==0&&map[q+xp[i]][w+yp[i]]==1&&e+1<=k)
				{
					loc[++top].a=q+xp[i];
					loc[top].b=w+yp[i];
					loc[top].c=e+1;
					cha[e+1][q+xp[i]][w+yp[i]]=cha[e][q][w]+1;
				}
			}
		}
	}
	printf("%d",result);
	return 0;
}