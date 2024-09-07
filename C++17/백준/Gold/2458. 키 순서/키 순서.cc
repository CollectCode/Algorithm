#include<stdio.h>
#include<vector>
#include<algorithm>
#define RANGE 510
using namespace std;
int stu,c,chk[RANGE],cnt=0;
int map[RANGE][RANGE], mapv[RANGE][RANGE];
void dfs(int x)
{
	chk[x]=1;
	for(int i=1;i<=stu;i++) if(map[x][i]==1&&chk[i]==0)	dfs(i);
}
void dfs2(int x)
{
	chk[x]=1;
	for(int i=1;i<=stu;i++) if(mapv[x][i]==1&&chk[i]==0) dfs2(i);
}
int main()
	{
	scanf("%d%d",&stu,&c);
	for(int i=0;i<c;i++)
	{
		int num1,num2;
		scanf("%d%d",&num1,&num2);
		map[num1][num2]=1;
		mapv[num2][num1]=1;
	}

	for(int i=1;i<=stu;i++)
	{
		int a=0,b=0;
		dfs(i);
		for(int j=1;j<=stu;j++) {a+=chk[j],chk[j]=0;}
		dfs2(i);
		for(int j=1;j<=stu;j++) {b+=chk[j],chk[j]=0;}
		if(a+b==stu+1) cnt++;
	}
	printf("%d",cnt);
	return 0;
}