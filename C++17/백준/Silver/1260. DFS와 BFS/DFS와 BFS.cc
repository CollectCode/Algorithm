#include<stdio.h>
#define RANGE 1001
int q[RANGE],hang[RANGE][RANGE],chk[RANGE],re[RANGE],index=0,jung,gan,fir;
void process(int start,int y)
{
	if(start>jung||y>jung) return;
	if(hang[start][y]==1&&chk[y]==1) 
	{
		chk[y]=0;
		re[index++]=y;
		process(y,1);
	}
	process(start,y+1);
}
int main()
{
	int bt=-1,top=-1,a;
	scanf("%d%d%d",&jung,&gan,&fir);
	for(int i=1;i<=jung;i++) chk[i]=1;
	for(int i=1;i<=gan;i++)
	{
		int x,y;
		scanf("%d%d",&x,&y);
		hang[x][y]=1;
		hang[y][x]=1;
	}
	chk[fir]=0;
	re[index++]=fir;
	process(fir,1);
	for(int i=1;i<=jung;i++) chk[i]=1;
	for(int i=0;i<index;i++) printf("%d ",re[i]);
	q[++top]=fir;
	chk[fir]=0;
	printf("\n%d ",fir);
	while(top!=bt)
	{
		a=q[++bt];
		for(int i=1;i<=jung;i++)
		{
			if(hang[q[bt]][i]==1&&chk[i]==1)
			{
				chk[i]=0;
				q[++top]=i;
				printf("%d ",i);
			}
		}
	}
	return 0;
}