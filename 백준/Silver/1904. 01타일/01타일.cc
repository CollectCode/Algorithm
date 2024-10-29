#include<stdio.h>
#include<algorithm>
using namespace std;
int dp[1000010] = {0,1,2,3,5,8};
int main()
{
    int n;
    scanf("%d",&n);
    for(int i=6;i<=1000000;i++) dp[i]=(dp[i-2]+dp[i-1])%15746;
    printf("%d",dp[n]);
    return 0;
}