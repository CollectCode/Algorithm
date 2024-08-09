#include<stdio.h>
int chae[1000001];
int main()
{
	chae[1]=1;
	for(int i=4;i<1000001;i+=2) chae[i]=1;
	for(int i=3;i*i<1000001;i+=2)
		for(int j=i*2;j<1000001;j+=i)
			if(chae[j]==0) chae[j]=1;
	while(true)
	{
		int a, result=0;
		scanf("%d", &a);
		if(a==0) break;
		for(int i=a+1;i<=2*a;i++) 
		if(chae[i]==0) 
			result++;
		printf("%d\n", result);
	}

	return 0;
}