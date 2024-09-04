#include<stdio.h>
int main()
{
	int num;
	scanf("%d",&num);
	for(int i=0;i<num;i++)
	{
		for(int j=0;j<(num*2-1)-i;j++)
		{
			if(i==0||j>=i&&j<=(num*2-2)-i) printf("*");
			else printf(" ");
		}
		printf("\n");
	}
	return 0;
}