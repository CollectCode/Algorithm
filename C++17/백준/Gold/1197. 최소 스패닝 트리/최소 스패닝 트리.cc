#include<stdio.h>
#include<algorithm>
#define RANGE 100010
using namespace std;
int jung,gan,a,b,result=0,par[RANGE];
struct tree
{
    int f,s,w;
}t,trees[RANGE];
int chk(tree x,tree y)
{
    return x.w<y.w;
}
int find(int x)
{
    if(par[x]==x) return x;
    par[x]=find(par[x]);
    return par[x];
}
int main()
{
    scanf("%d%d",&jung,&gan);
    for(int i=0;i<RANGE;i++) par[i]=i;
    for(int i=0;i<gan;i++) scanf("%d%d%d",&trees[i].f,&trees[i].s,&trees[i].w);
    sort(trees,trees+gan,chk);
    for(int i=0;i<gan;i++)
    {
        a=find(trees[i].f);
        b=find(trees[i].s);
        if(a!=b)
        {
            par[b]=a;
            result+=trees[i].w;
        }
    }
    printf("%d",result);
    return 0;
}