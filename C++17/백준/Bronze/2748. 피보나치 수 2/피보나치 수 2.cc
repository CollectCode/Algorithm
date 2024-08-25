#include<stdio.h>
long long m[100];
int num;
void process(long long f,long long s,int i)
{
	if(i<2) return;
	if(i-1==num) return;
	m[i]=f+s;
	return process(s,m[i],i+1);
}
int main()
{
	scanf("%d",&num);
	m[1]=1;
	m[2]=1;
	process(0,1,2);
	printf("%lld",m[num]);
	return 0;
}