#include<stdio.h>
#include<algorithm>
using namespace std;
int dynamic[100][100][100];
int main()
{
	int a,b,c;
	for(int i=0;i<=20;i++)	
	{
		for(int j=0;j<=20;j++)
		{
			for(int k=0;k<=20;k++)
			{
				if(i==0 || j==0 || k==0) dynamic[i][j][k]=1;
				else if(i>0 && j>0 && k>0)	
				{
					if(i<j && j<k) dynamic[i][j][k]=dynamic[i][j][k-1]+dynamic[i][j-1][k-1]-dynamic[i][j-1][k];
					else dynamic[i][j][k]=dynamic[i-1][j][k]+dynamic[i-1][j-1][k]+dynamic[i-1][j][k-1]-dynamic[i-1][j-1][k-1];
				}
			}
		}
	}
	while(1)
	{
		int t1,t2,t3;
		scanf("%d%d%d",&a,&b,&c);
		t1=a;
		t2=b;
		t3=c;
		if(a==-1 && b==-1 && c==-1) break;
		if(a<=0 || b<=0 || c<=0) 
		{
			printf("w(%d, %d, %d) = 1\n",a,b,c);
			continue;
		}
		if(a>20 || b>20 || c>20) 
		{
			a=20;
			b=20;
			c=20;
			printf("w(%d, %d, %d) = %d\n",t1,t2,t3,dynamic[a][b][c]);
			continue;
		}
		printf("w(%d, %d, %d) = %d\n",a,b,c,dynamic[a][b][c]);
	}
	return 0;
}