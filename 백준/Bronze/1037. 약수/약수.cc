#include<stdio.h>
#include<algorithm>
using namespace std;
int list[51];
int chk(int x, int y){return x<y;}
int main()
{
    int num,result=1,t;
    scanf("%d",&num);
    for(int i=0;i<num;i++) scanf("%d",&list[i]);
    sort(list,list+num,chk);
    printf("%d",list[num-1]*list[0]);
    return 0;
}