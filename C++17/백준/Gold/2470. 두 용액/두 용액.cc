#include<stdio.h>
#include<algorithm>
using namespace std;
int n[100001], t=2100000000, d1, d2;
int chk(int x, int y) {return x<y;}
int main()
{
	int loop, r1, r2;
	scanf("%d", &loop);
	for(int i=1;i<=loop;i++) scanf("%d", &n[i]);
	sort(n+1, n+loop+1, chk);

	for(int i=1;i<=loop;i++)
	{
		int mid, le=i+1, ri=loop, key2=-n[i];
		while(true)
		{
			if(le>ri) break;
			mid=(le+ri)/2;
			if(n[mid]==key2) 
			{
				printf("%d %d", n[i], key2); 
				exit(0);
			}
			if(key2>n[mid]) le=mid+1;
			else ri=mid-1;
		}
		r1=n[i]+n[le];
		if(r1<0) r1*=-1;
		if(le<=loop && t>r1)
		{
			t=r1;
			d1=n[i];
			d2=n[le];
		}
		r2=n[i]+n[ri];
		if(r2<0) r2*=-1;
		if(ri>i && t>r2)
		{
			t=r2;
			d1=n[i];
			d2=n[ri];
		}
	}

	printf("%d %d", d1, d2);
	return 0;
}