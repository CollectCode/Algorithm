#include<stdio.h>
int stair[302],sok[302],gun[302],max=0;
int main()
{
	int a,b,loop,x,y;
	scanf("%d",&loop);
	scanf("%d%d",&x,&y);
	sok[0]=x;
	gun[0]=x;
	sok[1]=x+y;
	if(x>y) gun[1]=x;
	else gun[1]=y;
	for(int i=2;i<loop;i++) scanf("%d",&stair[i]);
	for(int i=2;i<loop;i++) 
	{
		a=sok[i-2];
		b=gun[i-2];
		sok[i]=gun[i-1]+stair[i];
		if(a>b)
		{
			int t=a;
			a=b;
			b=t;
		}
		gun[i]=b+stair[i];
	}
	if(sok[loop-1]>gun[loop-1]) printf("%d",sok[loop-1]);
	else printf("%d",gun[loop-1]);
	return 0;
}