#include<iostream>
#include<utility>
#include<algorithm>
#include<vector>
#include<string>
using namespace std;
int num;
string cal(string tmp, int x)
{
	if(x==num) return tmp;
	else if(tmp=="9876543210" && x<num) return "-1";
	
	int index=-1;
	for(int i=tmp.size()-1;i>0;i--)
	{
		if(tmp[i]-'0'+1<tmp[i-1]-'0' && tmp[i]-'0'!=9)
		{
			index=i;
			break;
		}	
	}
	if(index==-1)
	{
		if(tmp[0]-'0'!=9)
		{
			for(int i=1;i<tmp.size();i++) tmp[i]=(tmp.size()-i-1)+'0';
			tmp[0]++;
			return cal(tmp, x+1);
		}
		else
		{
			string tmp2="";
			for(int i=0;i<tmp.size();i++) tmp[i]=(tmp.size()-i-1)+'0';
			tmp2+=tmp.size()+'0';
			tmp2+=tmp;
			return cal(tmp2, x+1);
		}
	}
	else
	{
		for(int i=index+1; i<tmp.size();i++) tmp[i]=(char)(tmp.size()-i-1+'0');
		tmp[index]++;
		return cal(tmp, x+1);
	}
}
int main()
{
	scanf("%d", &num);
	if(num < 11) printf("%d", num);
	else printf("%s", cal("10", 10).c_str());
	
	return 0;
}