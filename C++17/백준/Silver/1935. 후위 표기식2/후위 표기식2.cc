#include<stdio.h>
char str[100];
double sta[30];
double t[30];
int main()
{
	double num;
	int st=-1;
	scanf("%lf", &num);
	scanf("%s", str);

	for(int i=0;i<num;i++)
	{
		scanf("%lf", &t[i]);
	}

	for(int i=0;str[i]!=0;i++)
	{
		if(str[i]>='A' && str[i]<='Z') 
		{
			st++;
			sta[st]=t[str[i]-'A'];
		}
		if(str[i]=='*') 
		{
			sta[st-1]*=sta[st];
			sta[st]=0;
			st--;
		}
		if(str[i]=='/') 
		{
			sta[st-1]/=sta[st];
			sta[st]=0;
			st--;
		}
		if(str[i]=='-') 
		{
			sta[st-1]-=sta[st];
			sta[st]=0;
			st--;
		}
		if(str[i]=='+') 
		{
			sta[st-1]+=sta[st];
			sta[st]=0;
			st--;
		}
	}
	
	printf("%.2lf", sta[0]);
	return 0;
}