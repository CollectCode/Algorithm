#include<stdio.h>
int hang[110], yol[110];
int main()
{
	int ga, se, cut, tga=1, tse=1, max1=0, max2=0;
	scanf("%d%d", &se, &ga);
	scanf("%d", &cut);

	for(int i=0;i<cut;i++)
	{
		int select;
		scanf("%d", &select);
		if(select==0) scanf("%d", &hang[tga++]);
		else if(select==1) scanf("%d", &yol[tse++]);
	}

	hang[tga]=ga;
	yol[tse]=se;

	for(int i=0;i<tga;i++)
	{
		for(int j=0;j<tga;j++)
		{
			int tmp;
			if(hang[i] < hang[j])
			{
				tmp = hang[i];
				hang[i] = hang[j];
				hang[j] = tmp;
			}
		}
	}

	for(int i=0;i<tse;i++)
	{
		for(int j=0;j<tse;j++)
		{
			int tmp;
			if(yol[i] < yol[j])
			{
				tmp = yol[i];
				yol[i] = yol[j];
				yol[j] = tmp;
			}
		}
	}
	
	for(int i=cut+1;i>=1;i--)
	{
		int tm1 = hang[i]-hang[i-1];
		int tm2 = yol[i]-yol[i-1];
		if(max1<tm1) max1=tm1;
		if(max2<tm2) max2=tm2;
	}
	int result = max1*max2;
	printf("%d", result);

	return 0;
}