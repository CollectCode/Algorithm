#include<stdio.h>
#include<algorithm>
#define RANGE 16
using namespace std;
int cnt=0,qu;
int s[RANGE*2],le[RANGE*2],ri[RANGE*2];
void chk(int x,int q)
{
	if(q==qu)
	{
		cnt++;
		return;
	}
	for(int i=0;i<qu;i++)
	{
		if(!(s[i]+le[x+i]+ri[qu+(x-i)]))
		{
			s[i]=le[x+i]=ri[qu+(x-i)]=1;
			chk(x+1,q+1);
			s[i]=le[x+i]=ri[qu+(x-i)]=0;
		}
	}
}
int main()
{
	scanf("%d",&qu);
	chk(0,0);
	printf("%d",cnt);
	return 0;
}