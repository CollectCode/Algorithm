#include<stdio.h>
#include<algorithm>
#define RANGE 10010
using namespace std;
int money[RANGE];
int main()
{
	int loop, max=0, m, le, ri, mid;
	scanf("%d", &loop);
	for(int i=0;i<loop;i++)
	{
		scanf("%d", &money[i]);
		if(money[i]>max) max=money[i];
	}
	scanf("%d", &m);

	le=0;
	ri=max;

	while(true)
	{
		int sum=0;
		mid=(le+ri)/2;
		if(le>ri) break;
		for(int i=0;i<loop;i++) 
		{
			if(money[i]>=mid) sum+=mid;
			else sum+=money[i];
		}
		if(sum==m) break;
		if(sum<m) le=mid+1;
		else ri=mid-1;
	}
	
	printf("%d", mid);

	return 0;
}