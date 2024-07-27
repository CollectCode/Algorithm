#include<stdio.h>
char oper[300300];
int sta[100300], list[100300];
int main()
{
	int num, st=-1, li=1, op=0;
	scanf("%d", &num);
	for(int i=1;i<=num;i++) scanf("%d", &list[i]);

	for(int i=1;i<=num;i++)
	{
		sta[++st]=i;
		oper[op++]='+';
		while(sta[st]==list[li] && st>-1)
		{
			oper[op++]='-';
			st--;
			li++;
		}
	}
	if(st!=-1)
	{
		printf("NO");
	} else	{
		for(int i=0;oper[i]!=0;i++) printf("%c\n", oper[i]);
	}

	return 0;
}