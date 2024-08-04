#include<stdio.h>
int cow[90000], sta[90000];
int main()
{
    int loop, st=-1;
    long sum=0;
    scanf("%d", &loop);
    for(int i=0;i<loop;i++) scanf("%d", &cow[i]);
 
    for(int i=0;i<loop;i++)
    {
        while(sta[st]<=cow[i] && st>-1)
        {
            sum+=st;
            sta[st--]=0;
        }
        if(st==-1 || sta[st]>cow[i])
        {
            sta[++st]=cow[i];
        }
    }
 
    if(st>-1)
    {
        for (int i=st;i>=0;i--)
        {
            sum+=i;
        }
    }
 
    printf("%ld", sum);
    return 0;
}