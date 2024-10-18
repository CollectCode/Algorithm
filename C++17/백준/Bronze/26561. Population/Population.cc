#include<stdio.h>
int main()
{
    int loop;
    scanf("%d",&loop);
    for(int i=0;i<loop;i++)    {
        int hu,ti;
        scanf("%d%d",&hu,&ti);
        printf("%d\n",(ti/4)-(ti/7)+hu);
    }
    return 0;
}