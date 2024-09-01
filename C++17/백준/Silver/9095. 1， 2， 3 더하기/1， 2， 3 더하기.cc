#include<stdio.h>
int nums[21]={1,1,2},num;
int main()
{
	for(int i=3;i<20;i++) for(int j=1;j<=3;j++)	nums[i]+=nums[i-j];	
	scanf("%d",&num);
	for(int i=0;i<num;i++) 
	{
		int t;
		scanf("%d",&t);
		printf("%d\n",nums[t]);	
	}
	return 0;
}