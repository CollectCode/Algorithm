#include<stdio.h>
#include<stdlib.h>
int pan[30][30], cnt=0;
void omok(int x, int y, int v, int w, int num, int fx, int fy)
{
	if(pan[x][y]==num)
	{
		cnt+=1;
		if(cnt==5)
		{
			if(pan[x+v][y+w]==num || pan[fx-v][fy-w]==num)  return;
			printf("%d\n", num);
			printf("%d %d", fx, fy);
			exit(0);
		}
		omok(x+v, y+w, v, w, num, fx, fy);
	} else	{
		cnt=0;
		return;
	}
}
int main()
{

	for (int i=1;i<=19;i++)
	{
		for(int j=1;j<=19;j++)
		{
			scanf("%d", &pan[i][j]);
		}
	}
	
	for (int i=1;i<=19;i++)
	{
		for(int j=1;j<=19;j++)
		{
			if(pan[i][j]==1)
			{
				omok(i, j, -1, 1, 1, i, j);
				omok(i, j, 0, 1, 1, i, j);
				omok(i, j, 1, 1, 1, i, j);
				omok(i, j, 1, 0, 1, i, j);
			}
			if(pan[i][j]==2)
			{
				omok(i, j, -1, 1, 2, i, j);
				omok(i, j, 0, 1, 2, i, j);
				omok(i, j, 1, 1, 2, i, j);
				omok(i, j, 1, 0, 2, i, j);
			}
		}
	}
	printf("0");

	return 0;
}
