#include <stdio.h>
int main() {
  int input, sum, n;
  printf("Enter anything other than a number to exit iteration\nEnter a number: ");
  while(scanf("%d", &input)) {
    printf("Enter another number: ");
    sum += input;
    n++;
  }
  printf("Average of inputs: %.2f", sum/(float)n);
  return 0;
}
