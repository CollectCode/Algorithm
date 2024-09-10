#include<stdio.h>
int main()
{
	int num;
	scanf("%d",&num);
	for(int i=1;i<=num*2-1;i++)
	{
		for(int j=1;j<=num;j++)
		{
			if(i<=num)
			{
				if(j<=i) printf("*");
			} else	{
				if(j<num*2-i+1) printf("*");
			}
		}
		printf("\n");
	}
	return 0;
}