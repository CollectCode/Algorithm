#include<stdio.h>
#include<algorithm>
using namespace std;
int song[50001];
int chk(int l, int r, int num)
{
	int mid;
	while(true)
	{
		mid=(l+r)/2;
		if(l>r) return l;
		if(song[mid]==num) return mid;
		if(song[mid]>num) r=mid-1;
		else if(song[mid]<num) l=mid+1;
	}
}

int main()
{
	int ak, qu;
	scanf("%d%d", &ak, &qu);
	song[0]=-1;
	for(int i=1;i<=ak;i++)
	{
		int t;
		scanf("%d", &t);
		song[i]=t+song[i-1];
	}

	for(int i=1;i<=qu;i++)
	{
		int tmp;
		scanf("%d", &tmp);
		printf("%d\n", chk(1, ak, tmp));
	}

	return 0;
}