#include<iostream>
using namespace std;
int main()
{
  int n, m, lar=0;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
    {
      cin>>a[i][j];
      if(lar<a[i][j])
        lar=a[i][j];
    }
  cout<<"The maximum element is "<<lar;
  //Type your code here.
}