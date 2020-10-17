/*

	Homework
	Date: September 07 2020
	Name: Bishal Poonia

*/


#include <stdio.h>

int main()
{
    // Question 01
    
    printf("Check if given input is an alphabet or not:\n");
    char a;
    printf("Please enter a letter: ");
    scanf("%c", &a);
    if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) printf("\n%c is an alphabet.\n\n", a);
    else printf("\n%c is not an alphabet.\n\n", a);
    
    // Question 02
    
    printf("Check if given number is divisible by 11 and 5 both:\n");
    int x;
    printf("Please enter a number: ");
    scanf("%i", &x);
    if (x%11 == 0 && x%5 == 0) printf("\n%i is divisible by 11 and 5 both.\n\n", x);
    else printf("\n%i is not divisible by 11 and 5 both.\n\n", x);
    
    // Question 03
    
    printf("Check if a person is eligible for vote or not: \n");
    int age;
    printf("Please enter a number: ");
    scanf("%i", &age);
    if (age >= 18 && age <= 50) printf("Person is eligible to vote.");
    else printf("Person is not eligible for vote.");
    
    return 0;
}

