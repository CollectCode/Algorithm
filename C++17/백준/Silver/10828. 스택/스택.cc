#include<stdio.h>
#include<string.h>
int sta[10010];
int main()
	{
	int num, st=-1;
	scanf("%d", &num);

	for(int i=0;i<num;i++)
	{
		char order[10];
		int numb;
		scanf("%s", order);
	
		if(!strcmp(order, "push"))
		{
			scanf("%d", &numb);
			st++;
			sta[st]=numb;
		}
		if(!strcmp(order, "pop"))
		{
			if(st<=-1) 
			{
				printf("-1\n");
				continue;
			}
			printf("%d\n", sta[st]);
			sta[st]=0;
			st--;
		}
		if(!strcmp(order, "size"))
		{
			int count=0;
			for(int j=0;sta[j]!=0;j++) count++;
			printf("%d\n", count);
			continue;
		}
		if(!strcmp(order, "empty"))
		{
			if(st<=-1) 
			{
				printf("1\n");
				continue;
			}
			printf("0\n");
		}
		if(!strcmp(order, "top"))
		{
			if(st<=-1) 
			{
				printf("-1\n");
				continue;
			}
			printf("%d\n", sta[st]);
		}
	}
}