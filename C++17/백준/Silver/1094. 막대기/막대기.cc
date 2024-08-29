#include<stdio.h>
int main()
{
	int sum=0,num,cnt=1,de=64;
	scanf("%d",&num);
	while(true)
	{
		if(sum+de==num||de==0) break;
		if(num>sum+de) 
		{
			sum+=de;
			cnt++;
		}
		de/=2;
	}
	printf("%d",cnt);
	return 0;
}