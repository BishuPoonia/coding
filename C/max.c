#include <stdio.h>

int main() {
  int a, b, c;
  printf("a: ");
  scanf("%d", &a);
  printf("\nb: ");
  scanf("%d",&b);
  printf("\nc: ");
  scanf("%d",&c);
  puts("");
  
  if(a>b) {
    if (a>c) {
      printf("A is the maximum number.");
      if (b>c) printf("B is the second maximum.");
      else printf("C is the second maximum.");
      }
    else printf("C is the maximum number.A is the second maximum.");
    }
  else if (b>c) {
    printf("B is the maximum number.");
    if (a>c) printf("A is the second maximum.");
    else printf("C is the second maximum.");
  }
  else {
    printf("C is the maximum number.");
    if (a>b) printf("A is the second maximum.");
    else printf("B is the second maximum.");
    }
  return 0;
}
