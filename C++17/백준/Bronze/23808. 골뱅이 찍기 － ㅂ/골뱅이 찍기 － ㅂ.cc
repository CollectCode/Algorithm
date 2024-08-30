#include<stdio.h>
int main()
{
	int num;
	scanf("%d",&num);
	for(int i=0;i<num*5;i++)
	{
		for(int j=0;j<num*5;j++)
		{
			if((j<num||j>=num*4)||((i/num)+1)%2==1&&i/num!=0) printf("@");
			else printf(" ");
		}
		printf("\n");
	}
	
	return 0;
}