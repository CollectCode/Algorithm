#include<stdio.h>
#include<algorithm>
#define RANGE 1001
using namespace std;
int d[RANGE],lo=1,cnt;
int main()
{
    int num;
    scanf("%d",&num);
    for(int i=1;i<=num;i++) scanf("%d", &d[i]);
    for(int i=0;i<num-1;i++)
    {
        printf("%d ", lo);
        cnt=d[lo];
        d[lo]=0;
        while(1)
        {
            if(cnt==0) break;
            if(cnt>0)
            {
                if(d[lo+1]!=0&&lo<=num)
                {
                    lo++;
                    cnt--;
                }
                else lo++;
                if(lo>num) lo=0;
            } else    {
                if(d[lo-1]!=0 &&lo>0)
                {
                    lo--;
                    cnt++;
                }
                else lo--;
                if(lo<1) lo=num+1;
            }
        }
    }
    printf("%d", lo);
    return 0;
}