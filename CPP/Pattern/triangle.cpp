

#include<iostream>
using namespace std;
int main()
{

     cout<<"Inverted Triangle Shape\n";


  int w=6;

   for(int g=0;g<9;g++)
 {
  cout<<"*";    // Displaying asterisk here
 }
  cout<<endl; // endl is for new line

  for(int a=1;a<=3;a++)
 {

    for(int b=0;b<a;b++)
   {
    cout<<" ";    // displaying space here
   }
    cout<<"*";


      for(int c=1;c<w;c++)
     {
      cout<<" ";
     }
      cout<<"*"<<endl;
      w=w-2;
 }

  for(int e=1;e<=1;e++)
 {

    for(int f=4;f>=e;f--)
   {
    cout<<" ";
   }
    cout<<"*";
 }

  return 0;
}


