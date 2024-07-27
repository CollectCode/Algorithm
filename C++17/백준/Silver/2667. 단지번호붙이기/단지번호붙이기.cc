#include<stdio.h>
int home[30][30], result[10000], res=0;
void find(int x, int y)
{
	home[x][y]=0;
	res+=1;
	result[res]+=1;
	if(home[x+1][y]==1)	find(x+1, y);	
	if(home[x-1][y]==1) find(x-1, y);	
	if(home[x][y+1]==1) find(x, y+1);	
	if(home[x][y-1]==1) find(x, y-1);	
}
int main()
{
	int size, dan=0;
	scanf("%d", &size);
	for(int i=1;i<=size;i++)
	{
		for(int j=1;j<=size;j++)
		{
			scanf("%1d", &home[i][j]);
		}
	}

	for (int i=1;i<=size;i++)
	{
		for (int j=1;j<=size;j++)
		{
			res=0;
			if(home[i][j]==1)
			{
				find(i, j);
				dan++;
			}
		}
	}

	printf("%d\n", dan);
	for(int i=dan;i>=1;i--)
	{
		int dab=0;
		for(int j=1;result[j]!=0;j++)
		{
			if(result[j]==i) 
			{
				dab++;
				result[j]--;
			}
		}
		printf("%d\n", dab);
	}

	return 0;
}