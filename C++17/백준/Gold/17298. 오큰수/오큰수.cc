#include<stdio.h>
int sta[1000000][2], a[1000000], result[1000000];
int main()
{
	int size, st=-1;
	scanf("%d", &size);

	for(int i=0;i<size;i++) scanf("%d", &a[i]);
	for(int i=0;i<size;i++)
	{
		if(sta[st][0]<a[i] && st>-1)
		{
			while(true)
			{
				if(st==-1 || sta[st][0]>=a[i]) break;
				result[sta[st][1]]=a[i];
				st--;
			}
		}
		sta[++st][0]=a[i];
		sta[st][1]=i;
	}

	for(int i=0;i<size;i++)
	{
		if(result[i]==0) printf("-1 ");
		else printf("%d ", result[i]);
	}

	return 0;
}