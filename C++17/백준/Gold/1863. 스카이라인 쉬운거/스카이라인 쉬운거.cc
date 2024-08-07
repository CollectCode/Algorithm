#include<stdio.h>
#include<algorithm>
using namespace std;
pair<int,int>info[50001];
int he[1000001];
int main()
{
	int loop, st, tmp=0, result=0;
	scanf("%d", &loop);
	st=loop;
	for(int i=0;i<loop;i++) scanf("%d%d", &info[i].first, &info[i].second);
	while(true)
	{
		if(st==0) 
		{
			result+=tmp;
			break;
		}
		if(info[st].second==info[st-1].second) st--;
		if(info[st].second<info[st-1].second)
		{
			he[tmp++]=info[st-1].second;
			st--;
			continue;
		}
		if(info[st].second>info[st-1].second)
		{
			int a=1;
			for(int i=0;i<tmp;i++) 
			{
				if(info[st-1].second<he[i]) he[i]=0;
				if(info[st-1].second==he[i]) a=0;
			}
			if(a==1) he[tmp++]=info[st-1].second;
			st--;
		}
	}
	printf("%d", result);

	return 0;
}