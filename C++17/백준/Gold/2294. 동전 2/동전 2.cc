#include<stdio.h>
#define RANGE 100001
int coins[RANGE];
int main()
{
	int i,j,type,value;
	scanf("%d%d",&type,&value);
	for(int i=1;i<=RANGE;i++) coins[i]=-1;
	for(i=0;i<type;i++)
	{
		int c;
		scanf("%d",&c);
		for(j=c;j<=value;j++) if(coins[j-c]!=-1) if(coins[j]==-1||coins[j]>coins[j-c]+1) coins[j]=coins[j-c]+1;
	}
	printf("%d",coins[value]);
	return 0;
}