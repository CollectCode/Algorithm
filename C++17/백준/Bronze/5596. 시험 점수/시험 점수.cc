#include<stdio.h>
int main()
{
    int kook=0, sae=0;
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<4;j++)
        {
            int t;
            scanf("%d",&t);
            if(i==0) kook+=t;
            else sae+=t;
        }
    }
    if(kook>=sae) printf("%d",kook);
    else printf("%d",sae);
    return 0;
}