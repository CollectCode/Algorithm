#include<stdio.h>
int main()
{
	int nbox,nbook,sbox=0,sbook=0;
	scanf("%d%d",&nbox,&nbook);
	for(int i=0;i<nbox;i++)
	{
		int t;
		scanf("%d",&t);
		sbox+=t;
	}
	for(int i=0;i<nbook;i++)
	{
		int t;
		scanf("%d",&t);
		sbook+=t;
	}
	printf("%d",sbox-sbook);
	return 0;
}