#include<stdio.h>
#include<algorithm>
#define RANGE 2000100
using namespace std;
int d[RANGE];
int main()
{
	int loop,bt=RANGE/2,top=RANGE/2-1,order;
	scanf("%d",&loop);
	for(int i=0;i<loop;i++)
	{
		scanf("%d",&order);
		if(order==1) scanf("%d",&d[--bt]);
		if(order==2) scanf("%d",&d[++top]);
		if(order==3) 
		{
			if(top>=bt) printf("%d\n",d[bt++]);
			else printf("-1\n");
		}
		if(order==4) 
		{
			if(top>=bt) printf("%d\n",d[top--]);
			else printf("-1\n");
		}
		if(order==5)
		{
			if(top>=bt) printf("%d\n",top-(bt-1));
			else printf("0\n");
		}
		if(order==6)
		{
			if(top<bt) printf("1\n");
			else printf("0\n");
		}
		if(order==7)
		{
			if(top>=bt) printf("%d\n",d[bt]);
			else printf("-1\n");
		}
		if(order==8)
		{
			if(top>=bt) printf("%d\n",d[top]);
			else printf("-1\n");
		}
	}

	return 0;
}