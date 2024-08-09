#include<stdio.h>
int sta[1000001];
int main()
{
	int loop, st=-1;
	scanf("%d", &loop);
	for(int i=0;i<loop;i++)
	{
		int mode;
		scanf("%d", &mode);
		if(mode==1) 
		{
			int t;
			scanf("%d", &t); 
			sta[++st]= t;
		}
		if(mode==2) 
			if(st<0)
				printf("-1\n");
			else
				printf("%d\n", sta[st--]);
		if(mode==3) printf("%d\n", st+1);
		if(mode==4) 
			if(st==-1)
				printf("1\n");
			else
				printf("0\n");
		if(mode==5) 
			if(st<0)
				printf("-1\n");				
			else
				printf("%d\n", sta[st]);
	}

	return 0;
}