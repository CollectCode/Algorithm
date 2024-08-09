#include<stdio.h>
int loop;
long long chk(long long x)
{
	long long i;
	if(x<=2) return x;
	for(i=3;i*i<=x;i+=2) if(x%i==0) return 0;
	return i;
}
int main()
{ 
	scanf("%d", &loop);
	for(int i=0;i<loop;i++)
	{
		long long t;
		scanf("%lld", &t);
		if(t<3) 
		{
			printf("2\n");
			continue;
		}
		if(t%2==0) t++;
		for(long long j=t;j<t*2;j+=2) 
		{
			if(chk(j)) 
			{
				printf("%lld\n", j);
				break;
			}
		}
	}

	return 0;
}