#include<stdio.h>
int fibo[50]={0,1,1},loop,r[50]={1,0},o[50]={0,1};
int process2(int y)
{
	if(y==0) return 1;
	if(y==1) return 0;
	if(r[y]==0)r[y]=process2(y-1)+process2(y-2);
	return r[y];
}
int process3(int z)
{
	if(z==0) return 0;
	if(z==1) return 1;
	if(o[z]==0) o[z]=process3(z-1)+process3(z-2);
	return o[z];
}
int main()
{
	scanf("%d",&loop);
	for(int i=0;i<loop;i++)
	{
		int num;
		scanf("%d",&num);
		process2(num);
		process3(num);
		printf("%d %d\n",r[num],o[num]);
	}
	return 0;
}