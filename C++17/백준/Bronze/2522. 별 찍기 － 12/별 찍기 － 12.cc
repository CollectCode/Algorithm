#include<stdio.h>
int main()
{
	int num;
	scanf("%d",&num);
	for(int i=0;i<2*num-1;i++)
	{
		for(int j=0;j<num;j++)
		{
			if(i<num)
			{
				if(j>=num-(i+1)) printf("*");
				else printf(" ");
			} else	{
				if(j>i-num) printf("*");
				else printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}