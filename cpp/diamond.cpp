/* 
    CSC 150 Assignment 3,Diamond 
    Maycee Hatch 2015-09-29
    This program prints a diamond out of * when provided with length.
*/
#include <iostream>

using namespace std;

int main()
{
        cout << "Enter a positive integer: ";
        int side;
        cin >> side;

   for (int x = 0; x <= 2 * side; x++)
    {
      for (int w = 0; w <= 2 * side; w++)
        {
          if (x <= side)
          {
              if (w < side - x || w > side + x)
              {
                cout << ' ';
              }
              else
              {
                cout << '*';
              }
          }
          else
          {
                if (w < x - side || w > 3 * side - x)
                {
                  cout << ' ';
                }
                else
                {
                  cout << '*';
                }
            }
        }
      cout << endl;
    }
}

