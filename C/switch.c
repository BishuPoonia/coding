#include <stdio.h>

void main()
{
  int a;
  puts("Enter a number:");
  scanf("%d", &a);
  switch(a)
  {
    case 0: puts("zero");
            break;
    default: puts("non-zero");
  }
}
