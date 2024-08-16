#include<stdio.h>
#include<cstring>
#include<algorithm>
#define RANGE 100100
using namespace std;
int qu[RANGE],cha[RANGE],chk[RANGE];
int main()
{
    int cow, bo=0, top=0;
    scanf("%d%d", &qu[bo], &cow);
    chk[qu[bo]]=1;
	cha[bo]=1;
    if(qu[bo]==cow) 
    {
        printf("0");
        exit(0);
    }
    while(1)
    {
        if(qu[bo]-1==cow||qu[bo]+1==cow||qu[bo]*2==cow||qu[bo]==cow) break;
        if(!chk[qu[bo]+1]&&qu[bo]+1<=100000&&qu[bo]+1>-1)
        {
            qu[++top]=qu[bo]+1;
            cha[top]=cha[bo]+1;
            chk[qu[bo]+1]=1;
        }
        if(!chk[qu[bo]-1]&&qu[bo]-1<=100000&&qu[bo]-1>-1)
        {
            qu[++top]=qu[bo]-1;
            cha[top]=cha[bo]+1;
            chk[qu[bo]-1]=1;
        }
        if(!chk[qu[bo]*2]&&qu[bo]*2<=100000&&qu[bo]*2>-1)
        {
            qu[++top]=qu[bo]*2;
            cha[top]=cha[bo]+1;
            chk[qu[bo]*2]=1;
        }
        bo++;
    }
    printf("%d", cha[bo]);
    return 0;
}