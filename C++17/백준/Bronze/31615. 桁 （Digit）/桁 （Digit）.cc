#include<stdio.h>
int main()
{
	int a,b,c,cnt=0;
	scanf("%d%d",&a,&b);
	c=a+b;
	while(1)
	{
		if(c==0) break;
		c/=10;
		cnt++;
	}
	printf("%d", cnt);
	return 0;
}