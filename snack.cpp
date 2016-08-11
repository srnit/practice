#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t,a,b;
	float min,max;
	cin>>t;
	while(t--)
	{

		cin>>a>>b;
		if(a==b)
		{
			min=(float)a;
			max=(float)sqrt(b*b+a*a);
			
			//printf("%f %f\n",min,max);
			cout<<fixed;

			cout<<setprecision(5)<<min<<" "<<max<<"\n";

		}
		else if(b>a)
		{
		min=(float)sqrt(b*b-a*a);
		max=(float)sqrt(b*b+a*a);
		//cout<<min<<" "<<max<<"\n";
		//printf("%f %f\n",min,max);
		cout<<fixed;

			cout<<setprecision(5)<<min<<" "<<max<<"\n";
}
else if(a>b)
{min=(float)sqrt(a*a-b*b);
		max=(float)sqrt(b*b+a*a);
		//printf("%f %f\n",min,max);
		cout<<fixed;

			cout<<setprecision(5)<<min<<" "<<max<<"\n";
		//cout<<min<<" "<<max<<"\n";
	
}
}
}
