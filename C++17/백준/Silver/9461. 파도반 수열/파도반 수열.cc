#include<stdio.h>
#include<algorithm>
using namespace std;
long long int dp[1000010] = {0,1,1,1,2,2,3,4,5,7,9};
int main()
{
	int loop;
	scanf("%d",&loop);
	for(int i=11;i<=100;i++){dp[i]=dp[i-2]+dp[i-3];}
	for(int i=0;i<loop;i++)
	{
		int t;
		scanf("%d",&t);
		printf("%lld\n",dp[t]);
	}
	return 0;
}