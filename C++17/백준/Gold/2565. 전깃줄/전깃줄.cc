#include<stdio.h>
#include<algorithm>
using namespace std;
pair<int,int> e[101];
int leng[101];
int main()
{
	int loop,minus=0,maximum=0;
	scanf("%d",&loop);
	for(int i=0;i<loop;i++)
	{
		int t1,t2;
		scanf("%d%d",&t1,&t2);
		e[i].first=t1;
		e[i].second=t2;
	}

	for(int i=0;i<loop;i++) leng[i]=1;
	sort(e, e+loop);

	for(int i=1;i<loop;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(e[i].second>e[j].second && leng[i]<=leng[j]+1) leng[i]=leng[j]+1;
		}
		if(maximum<leng[i]) maximum=leng[i];
	}

	if(loop==1) printf("1");
	else printf("%d",loop-maximum);
	return 0;
}