#include<stdio.h>
#include<stdlib.h>
char vp[51], b[2][10]={"YES", "NO"};
int main()
{
	int k, num, sw;
	scanf("%d", &num);
	for(int j=0;j<num;j++)
	{
		scanf("%s", vp);
		k=-1;
		sw=0;
		for(int i=0;vp[i]!=0;i++)
		{
			if(vp[i]=='(') k+=1;
			else k-=1;
			if(k<-1) sw=1;
		}
		if(k>-1) sw=1;
		printf("%s\n", b[sw]);
	}

	return 0;
}