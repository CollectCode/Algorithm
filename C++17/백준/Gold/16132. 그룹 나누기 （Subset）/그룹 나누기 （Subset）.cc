#include<stdio.h>
#include<algorithm>
#define RANGE 100000
using namespace std;
long long int in[RANGE]={1},e=0;
int main()
{
	int num,sum=0;
	scanf("%d",&num);
	sum=(num*(num+1))/2;
	if(sum%2==1) 
	{
		printf("0"); 
		exit(0);
	}

	for(int i=1;i<=num;i++)
	{
		for(int j=i+e;j>=1;j--)
		{
			if(j==i+e) e=j;
			if(j-i>=0) in[j]=in[j]+in[j-i];
		}
	}
	printf("%lld",in[sum/2]/2);
	return 0;
}