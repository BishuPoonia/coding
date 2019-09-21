#include <iostream>
using namespace std;
int main()

    
{
    // Pattern #1

    cout << "Pattern no. 1:" << endl;

    int a, b;
    for (a = 1; a <= 9; a++){
        for (b = 1; b <= a; b++){
            cout << a;
        }
            cout << "\n";
    }

    // Pattern #2

    cout << "\n\nPattern no. 2" << endl;
    
    int c, d;
    for (c = 1; c <= 9; c++){
        for (d = 1; d <= c; d++){
            cout << d;
        }
            cout << "\n";
    }

    // Pattern #3

    cout << "\n\nPattern no. 3" << endl;

    int e, f;
    for (e = 1; e <= 9; e++){
        for (f = 1; f <= e + e; f++){
            cout << f++;
        }
            cout << "\n";
    }

    // Pattern #4

    cout << "\n\nPattern no. 4" << endl;

    int g, h;
    for (g = 0; g <= 9; g++){
        for (h = 0; h <=g; h++){
            cout << h%2;
        }
            cout << "\n";
    }

    return 0;
}