#include<stdio.h>
#include<algorithm>
#define RANGE 102
using namespace std;
pair<int,int> score[RANGE];
pair<int,int> score2[RANGE];
int chk(pair<int,int> x,pair<int,int> y){return x.second>y.second;}
int main()
{
	int n,m;
	scanf("%d%d",&n,&m);
	for(int i=1;i<=n;i++)
	{
		int g;
		scanf("%d",&g);
		for(int j=1;j<=n;j++) if(score[j].second>=g) score[j].second++;
		score[i].first=i;
		score[i].second=g;
	}
	sort(score+1, score+n+1, chk);

	for(int i=1;i<=n;i++)
	{
		if(score[i].second<=m)			
		{
			int g;
			scanf("%d",&g);
			for(int j=1;j<=n;j++) if(score2[j].second>=g) score2[j].second++;
			score2[i].first=score[i].first;
			score2[i].second=g;
		}
	}
	
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(score2[j].second==i)
			{
				printf("%d\n",score2[j].first);
				break;
			}
		}
	}
	return 0;
}