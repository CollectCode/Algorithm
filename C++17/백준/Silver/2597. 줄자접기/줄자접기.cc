#include<stdio.h>
#include<algorithm>
using namespace std;
double a[6];
int main()
{
	double rcm, lcm=0, c, mid, cm;
	scanf("%lf", &cm);
	rcm=cm;
	for(int i=0;i<6;i+=2) scanf("%lf%lf", &a[i], &a[i+1]);
	for(int i=0;i<6;i+=2)
	{
		if(a[i]==a[i+1]) continue;
		mid=(a[i]+a[i+1])/2;
		if(mid-lcm>rcm-mid)
		{
			rcm=mid;
			for(int j=i+2;j<6;j++) 
				if(a[j]>mid) a[j]=mid-(a[j]-mid);
		}
		else
		{
			lcm=mid;
			for(int j=i+2;j<6;j++) 
				if(a[j]<mid) a[j]=mid+(mid-a[j]);
		}
	}

	printf("%.1lf", rcm-lcm);
	return 0;
}