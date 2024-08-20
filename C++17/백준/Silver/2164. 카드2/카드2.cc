#include<stdio.h>
#include<algorithm>
#define RANGE 1000010
using namespace std;
int cards[RANGE];
int main()
{
	int bt=-1,top=-1,num;
	scanf("%d",&num);
	for(int i=1;i<=num;i++) cards[++top]=i;
	
	while(bt!=top)
	{
		bt++;
		cards[++top]=cards[++bt];	
	}

	printf("%d",cards[bt-1]);
	return 0;
}