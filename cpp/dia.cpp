#include <iostream>
using namespace std;
int main()
{
int i;

       for( i=0;i<3;i++)
       {
               for(int j=3;j>i;j--)
               cout<<" ";
                       for(int k=0;k<i;k++)
                       cout<<" *";
                       cout<<endl;
       }
       for(i=3;i>0;i--)
       {
               for(int j=3;j>i;j--)
               cout<<" ";
                       for(int k=0;k<i;k++)
                       cout<<" *";
                       cout<<endl;
                      
       }
       for(int i=0;i<3;i++)
       {
               for(int j=3;j>i;j--)
               cout<<" ";
                       for(int k=0;k<i;k++)
                       cout<<" *";
                       cout<<endl;
                       
        return 0;
       } 
}
