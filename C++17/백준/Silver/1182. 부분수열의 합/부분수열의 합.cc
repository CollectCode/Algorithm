#include<stdio.h>
#include<algorithm>
#define RANGE 30
int nums[RANGE],de,loop,cnt=0;
void working(int i,int sum,int l)
{
	if(i==l) return;
	if(sum+nums[i]==de) cnt++;
	working(i+1,sum+nums[i],loop);
	working(i+1,sum,loop);
} 
int main()
{
	scanf("%d%d",&loop,&de);
	for(int i=0;i<loop;i++) scanf("%d",&nums[i]);
	working(0,0,loop);
	printf("%d",cnt);
	return 0;
}