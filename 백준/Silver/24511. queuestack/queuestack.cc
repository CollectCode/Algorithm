#include<stdio.h>
#include<algorithm>
#define RANGE 100001
using namespace std;
pair<int,int> stru[RANGE];
int list[RANGE];
int main()
{
    int n,m,cnt=0,t=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++) scanf("%d",&stru[i].first);
    for(int i=0;i<n;i++) scanf("%d",&stru[i].second);
    for(int i=n-1;i>=0;i--) if(stru[i].first==0) list[t++]=stru[i].second;
    scanf("%d",&m);
    for(int i=t;i<m+t;i++) scanf("%d",&list[i]);
    for(int i=0;i<m;i++) printf("%d ", list[i]);

    return 0;
}