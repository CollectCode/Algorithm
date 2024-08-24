#include<stdio.h>
#include<algorithm>
#define RANGE 20
int nums[RANGE],oper[4],min=1000000100,max=-1200000000,loop,x,y,z,w;
void process(int p,int m,int u,int d,int i,int sum)
{
	if(loop==i)
	{
		if(sum<min) min=sum;
		if(sum>max) max=sum;
		return;
	}
	if(p>0) process(p-1,m,u,d,i+1,sum+nums[i]);
	if(m>0) process(p,m-1,u,d,i+1,sum-nums[i]);
	if(u>0) process(p,m,u-1,d,i+1,sum*nums[i]);
	if(d>0) process(p,m,u,d-1,i+1,sum/nums[i]);
}
int main()
{
	scanf("%d",&loop);
	for(int i=0;i<loop;i++) scanf("%d",&nums[i]);
	scanf("%d%d%d%d",&x,&y,&z,&w);
	process(x,y,z,w,1,nums[0]);
	printf("%d\n%d",max,min);
	return 0;
}