#include<stdio.h>
double list[21]={0,1};
int main()
{
	int num;
	scanf("%d",&num);
	for(int i=2;i<=20;i++) list[i]=list[i-1]*i;
	for(int i=0;i<num;i++)
	{
		double t1,t2,r1=1,r2=1,r3=1;
		scanf("%lf%lf",&t1,&t2);
		for(int j=t2-t1;j>=1;j--) r1*=j;
		for(int k=t2;k>=1;k--) r2*=k;
		for(int l=t1;l>=1;l--) r3*=l;
		printf("%.0lf\n",(r2/r1)/r3);
	}
return 0;
}