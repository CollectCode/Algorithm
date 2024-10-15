#include<stdio.h>
#include<algorithm>
using namespace std;
int nums[1001];
int main()
{
	int loop;
	scanf("%d",&loop);
	for(int i=0;i<loop;i++)
	{
		int t1,t2;
		scanf("%d%d",&t1,&t2);
		nums[i]=t1*t2;
	}
	sort(nums, nums+loop);
	printf("%d",nums[loop-1]);
	return 0;
}