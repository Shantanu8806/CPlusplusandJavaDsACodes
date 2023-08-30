#include <bits/stdc++.h>
using namespace std;
long long solve(long long n,long long k,long long l,vector<long long>&deliciousness)
{
    long long ans=0;
    
    priority_queue<int>pq;
    for(int i=0;i<deliciousness.size();i++)
    {
        pq.push(deliciousness[i]);
    }
    int count=0;
    while(!pq.empty())
    {
        int currentCustomer=count %k+1;
        
        if(currentCustomer==l)
        {
            ans+=pq.top();
        }
        pq.pop();
        
        count++;
    }
    return ans;
}
int main() {
	// your code goes here
	int T;
	cin>>T;
	while(T--)
	{
	    long long n,k,l;
	    
	    cin >> n >> k >> l;
	    
	    vector<long long> a(n);
	    
	    for(int  i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }
	    cout<<solve(n,k,l,a)<<endl;
	}
	return 0;
}
