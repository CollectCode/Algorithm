#include<stdio.h>
int dp[100001];
int main()
{
	int nums, loop;
	scanf("%d%d",&nums,&loop);
	for(int i=1;i<=nums;i++) 
	{
		int t1;
		scanf("%d",&t1);
		dp[i]=t1+dp[i-1];
	}

	for(int i=1;i<=loop;i++)
	{
		int r1,r2;
		scanf("%d%d",&r1,&r2);
		printf("%d\n", dp[r2]-dp[r1-1]);
	}
	return 0;
}