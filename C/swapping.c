#include <stdio.h>

int main()
{
  int a, b, c, d;
  puts("value of a: ");
  scanf("%d", &a);
  puts("value of b: ");
  scanf("%d", &b);
  puts("value of c: ");
  scanf("%d", &c);
  
  puts("\nbefore swapping:");
  printf("value of a: %d", a);
  printf("\nvalue of b: %d", b);
  printf("\nvalue of c: %d", c);
  
  puts("\n\nafter swapping:");

  d = a;
  a = b;
  b = c;
  c = d;

  printf("Value of a: %d", a);
  printf("\nValue of b: %d", b);
  printf("\nValue of c: %d", c);

  puts("\n\nwithout fourth variable:");
  
  puts("value of a: ");
  scanf("%d", &a);
  puts("value of b: ");
  scanf("%d", &b);
  puts("value of c: ");
  scanf("%d", &c);
 
  puts("\nbefore swapping:");
  printf("value of a: %d", a);
  printf("\nvalue of b: %d", b);
  printf("\nvalue of c: %d", c);
  
  puts("\n\nafter swapping:");

  a = a + b + c;
  b = a - b - c;
  c = a - b - c;
  a = a - b - c;

  printf("Value of a: %d", a);
  printf("\nValue of b: %d", b);
  printf("\nValue of c: %d", c);

  puts("");
  return 0;
}
