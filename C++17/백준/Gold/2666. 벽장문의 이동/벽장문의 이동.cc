#include<stdio.h>
#define RANGE 21
int use[RANGE],min=10000000,loop;
void process(int x,int y,int i,int c)
{
	if(i==loop)
	{
		if(min>c) min=c;
		return;
	}
	if(use[i]>=x&&use[i]<=y) 
	{
		process(use[i],y,i+1,c+(use[i]-x));
		process(x,use[i],i+1,c+(y-use[i]));
	}
	if(use[i]<x) process(use[i],y,i+1,c+(x-use[i]));
	if(use[i]>y) process(x,use[i],i+1,c+(use[i])-y);
}
int main()
{
	int d,a,b;
	scanf("%d%d%d%d",&d,&a,&b,&loop);
	if(a>b)
	{
		int t=a;
		a=b;
		b=t;
	}
	for(int i=0;i<loop;i++) scanf("%d",&use[i]);
	process(a,b,0,0);
	printf("%d",min);
	return 0;
}