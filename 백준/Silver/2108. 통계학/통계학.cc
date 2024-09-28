#include<stdio.h>
#include<algorithm>
#include<cmath>
#define RANGE 500001
#define ABSO 4001
using namespace std;
int nums[RANGE],c[ABSO*2];
int chk(int x, int y) {return x<y;}
int main()
{
    int n,many=0,rangex=-4001,rangen=4001,cnt=0,manyr,tmp=0;
    double san=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        int t;
        scanf("%d",&t);
        c[4000+t]++;
        nums[i]=t;
        san+=t;
        if(c[4000+t]>many) many=c[4000+t];
        if(t>rangex) rangex=t;
        if(t<rangen) rangen=t;
    }
    
    sort(nums,nums+n,chk);

    if(san<0) san=ceil((san/n)-0.5);
    else san=floor((san/n)+0.5);
    
    for(int i=0;i<ABSO*2;i++)
    {
        if(many==c[i]) 
        {
            cnt++;
            manyr=i-4000;
            if(cnt>1) break;
        }
    }

    if(san==-0) san=0;

    printf("%.0lf\n",san);
    printf("%d\n",nums[n/2]);
    printf("%d\n",manyr);
    printf("%d\n",rangex-rangen);

    return 0;
}