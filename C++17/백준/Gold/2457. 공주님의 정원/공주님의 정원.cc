#include<stdio.h>
#include<algorithm>
#include<utility>
using namespace std;
struct fl
{
	int fi, se, ing;
}date[100001];
int chk(fl x, fl y)
{
	if(x.fi==y.fi) return x.se<y.se;
	return x.fi<y.fi;
}
int main()
{
	int f, de=301, result=0, max=0, save;
	scanf("%d", &f);
	for(int i=0;i<f;i++)
	{
		int sm, sd, lm, ld;
		scanf("%d%d%d%d", &sm, &sd, &lm, &ld);
		date[i].fi=sm*100+sd;
		date[i].se=lm*100+ld;
		date[i].ing=date[i].se-date[i].fi;
	}
	
	sort(date, date+f, chk);

	for(int i=1;i<=f;i++)
	{
		if(date[i-1].fi>de || de>1130) break;
		if(date[i-1].fi<=de)
		{
			int tmp=date[i-1].ing-(de-date[i-1].fi);
			if(max<tmp)
			{
				max=tmp;
				save=i-1;
			}
		}

		if(date[i].fi>de)
		{
			if(max!=0)	
			{
				de=date[save].se;
				max=0;
				result++;
			} else	{
				
				de=date[i-1].se;
				result++;
			}
		}
		if(date[i].se>1130 && date[i].fi<=de) 
		{
			de=date[i].se;
			result++;
		}
	}

	if(de<=1130) printf("0");
	else printf("%d", result);

	return 0;
}