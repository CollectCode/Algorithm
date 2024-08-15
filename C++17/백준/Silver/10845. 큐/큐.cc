#include<stdio.h>
#include<cstring>
#define RANGE 10010
using namespace std;
int qu[RANGE];
char order[10];
int main()
{
	int loop, bo=0, top=0;
	scanf("%d", &loop);
	for(int i=0;i<loop;i++)
	{
		scanf("%s", order);
		if(!strcmp(order, "push"))
		{
			int num;
			scanf("%d", &num);
			qu[top++]=num;
		}
		if(!strcmp(order, "pop"))
		{
			if(bo==top) printf("-1\n");
			else printf("%d\n", qu[bo++]);
		}
		if(!strcmp(order, "size")) printf("%d\n", top-bo);
		if(!strcmp(order, "empty"))
		{
			if(bo==top) printf("1\n");
			else printf("0\n");
		}
		if(!strcmp(order, "front"))
		{
			if(bo==top) printf("-1\n");
			else printf("%d\n", qu[bo]);
		}
		if(!strcmp(order, "back"))
		{
			if(bo==top) printf("-1\n");
			else printf("%d\n", qu[top-1]);
		}
	}
	return 0;
}