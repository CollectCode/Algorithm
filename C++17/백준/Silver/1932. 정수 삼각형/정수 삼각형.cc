#include<stdio.h>
#define RANGE 510
int tri[RANGE][RANGE];

int main()
{
	int n,max=0;
	scanf("%d",&n);
	for(int i=1;i<=n;i++) 
	{
		for(int j=1;j<=i;j++) 
		{
			int t,a,b;	
			scanf("%d",&t);
			a=tri[i-1][j]+t;
			b=tri[i-1][j-1]+t;
			if(i==1) tri[i][j]=t;
			else {
				if(a>b) tri[i][j]=a;
				else tri[i][j]=b;
			}
		}
	}
	for(int i=0;i<=n;i++) if(tri[n][i]>max) max=tri[n][i];
	printf("%d",max);
	return 0;
}