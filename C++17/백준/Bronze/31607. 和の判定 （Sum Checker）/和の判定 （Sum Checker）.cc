#include<stdio.h>
int main()
{
	int a,b,c;
	scanf("%d%d%d",&a,&b,&c);
	if(a==b+c) printf("1");
	else if(b==a+c) printf("1");
	else if(c==b+a) printf("1");
	else printf("0");
	return 0;
}