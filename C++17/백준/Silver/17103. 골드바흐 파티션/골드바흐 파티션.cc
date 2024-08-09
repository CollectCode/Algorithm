#include<stdio.h>
int chae[1000001], t;
int main()
{
	chae[1]=1;
	for(int i=4;i<1000001;i+=2) chae[i]=1;
	for(int i=3;i*i<1000001;i+=2)
		for(int j=i*2;j<1000001;j+=i)
			if(chae[j]==0) chae[j]=1;

	scanf("%d", &t);
	for(int i=0;i<t;i++)
	{
		int gold, result=0;
		scanf("%d", &gold);
		if(gold==4) result++;
		for(int j=3;j<=gold/2;j+=2) if(chae[gold-j]==0 && chae[j]==0) result++;
		printf("%d\n", result);
	}
	return 0;
}