#include<stdio.h>
#include<algorithm>
#define RANGE 1000001
int chance[RANGE]={0,0,1,1};
int main()
{
    int t,num,start=4;
    scanf("%d", &num);
    while(1)
    {
        if(start==num+1) break;
        t=start;
        int t1=3000,t2=3000,t3=3000,res=0;
        if(num<4&&num>0) 
        {
            if(num==1) printf("0");
            else printf("1");
            exit(0);
        }
        t1=chance[t-1];
        if(t%2==0) t2=chance[t/2];
        if(t%3==0) t3=chance[t/3];
        if(t1<=t2&&t1<=t3) res=t1;
        else if(t2<=t1&&t2<=t3) res=t2;
        else if(t3<=t2&&t3<=t1) res=t3;
        chance[start]=res+1;
        start++;
    }

    printf("%d",chance[num]);
    return 0;
}