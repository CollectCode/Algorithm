#include<stdio.h>
int main()
{
	int num,a;
	scanf("%d",&num);
	a=num*2-1;
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<a;j++)
		{
			if(i<num) {
				if(j>=i&&j<a-i) printf("*");
				else if(j<a-i) printf(" ");
			} else {
				if(j>a-i-2&&j<=i) printf("*");
				else if(j<=i-1)printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}