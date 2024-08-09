#include<stdio.h>
int chae[1000001], min, max;
int main()
{
	chae[1]=1;
	for(int i=4;i<1000001;i+=2) chae[i]=1;
	for(int i=3;i*i<1000001;i+=2)
		for(int j=i*2;j<1000001;j+=i)
			if(chae[j]==0) chae[j]=1;

	scanf("%d%d", &min, &max);
	
	for(int i=min;i<=max;i++) if(chae[i]==0) printf("%d\n", i);

	return 0;
}