#include<stdio.h>
#include<algorithm>
using namespace std;
struct room
{
	int first,second;
}temp[100001];
int chk2(int x, int y)
{
    return x<y;
}
int chk(room x,room y)
{
    if(x.second==y.second) return chk2(x.first,y.first);
    return x.second<y.second;
}
int main()
{
	int ice,re=0,result=1;
	scanf("%d", &ice);
	for(int i=0;i<ice;i++) scanf("%d%d", &temp[i].first, &temp[i].second);
	sort(temp, temp+ice, chk);
	for(int i=1;i<=ice;i++) 
	{
		if(temp[re].second<=temp[i].first) 
		{
			re=i;
			result++;
		}
	}
	printf("%d\n", result);

	return 0;
}