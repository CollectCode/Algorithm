#include<stdio.h>
#include<iostream>
int dp[100010], result[100010], max=-200000000;
int main()
{
	int nums, seq;
	scanf("%d%d",&nums,&seq);
	for(int i=0;i<nums;i++)	{scanf("%d",&dp[i]);}
	for(int i=0;i<seq;i++) {result[0]+=dp[i];}
	if(result[0]>max) max=result[0];
	for(int i=1;i+seq<=nums;i++)
	{
		result[i]=result[i-1]-dp[i-1]+dp[i+seq-1];
		if(result[i]>max) max=result[i];
	}
	printf("%d",max);
	return 0;
}