#include<bits/stdc++.h>
using namespace std;
int main()
{
	int t;
	//std::vector<int>v;
	cin>>t;
	step1:
	{
	while(t--)
	{
		int n;
		cin>>n;
		vector<int>v;
		vector<int>a;
		//vector<int>:iterator it;
		for(int i=0;i<n;i++)
			cin>>v[i];
		sort(v.begin(),v.end());
		
		for(int i=0;i<n;i++)
		{
			if (v[i]%v[0]==0)
			{
				a[i]=v[i]/v[0];
				/* code */
			}
			else if(v[i]%v[0]!=0)
				{
					for(int i=0;i<n;i++)
						cout<<v[i]<<" ";
					cout<<"\n";

					goto step1;
				}

		}
		for(int i=0;i<n;i++)
			cout<<a[i]<<" ";
		cout<<"\n";
	
		}
		
}}


	
