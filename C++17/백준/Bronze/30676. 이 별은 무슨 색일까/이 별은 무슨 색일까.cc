#include<stdio.h>
int main()
{
	int num;
	scanf("%d",&num);
	if(num>=380 && num<425) printf("Violet");
	else if(num>=425 && num<450) printf("Indigo");
	else if(num>=450 && num<495) printf("Blue");
	else if(num>=495 && num<570) printf("Green");
	else if(num>=570 && num<590) printf("Yellow");
	else if(num>=590 && num<620) printf("Orange");
	else if(num>=620 && num<=780) printf("Red");

	return 0;
}