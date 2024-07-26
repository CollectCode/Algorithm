#include<stdio.h>
char total[100], oper[100];
int main()
{
	int top=-1;
	scanf("%s", total);

	for(int i=0;total[i]!=0;i++)
	{
		if(total[i]>='A' && total[i]<='Z') 	printf("%c", total[i]);
		else if(top==-1 || total[i]=='(') 	oper[++top]=total[i];
		else if(total[i]==')')
		{
			while(true)
			{
				if(oper[top]=='(') break;
				printf("%c", oper[top--]);
			}
			top--;
		}
		else if(total[i]=='*' || total[i]=='/')
		{
			while(true)
			{
				if(top==-1 || oper[top]=='(' || oper[top]=='+' || oper[top]=='-') break;
				printf("%c", oper[top--]);
			}
			oper[++top]=total[i];
		}
		else if(total[i]=='+' || total[i]=='-')
		{
			while(true)
			{
				if(top==-1 || oper[top]=='(') break;
				printf("%c", oper[top--]);
			}
			oper[++top]=total[i];
		}
	}

	while(true)
	{
		if(top==-1) break;
		printf("%c", oper[top--]);
	}

	return 0;
}