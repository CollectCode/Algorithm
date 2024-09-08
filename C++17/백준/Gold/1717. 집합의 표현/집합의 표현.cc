#include<stdio.h>
#include<algorithm>
#define RANGE 1000100
int par[RANGE];
int findpar(int x)
{
	if(par[x]==x) return x;
	par[x]=findpar(par[x]);
	return par[x];
}
int main()
{
	int d,op;
	scanf("%d%d",&d,&op);
	for(int i=0;i<RANGE;i++) par[i]=i;
	for(int i=0;i<op;i++)
	{
		int order,fi,se;
		scanf("%d%d%d",&order,&fi,&se);
		if(order==0) 
		{
			if(findpar(par[fi])!=findpar(par[se])) 
			{
				par[findpar(par[se])]=findpar(par[fi]);
			}
		} else {
			if(findpar(par[fi])!=findpar(par[se])) printf("NO\n");
			else printf("YES\n");
		}
	}
	return 0;
}