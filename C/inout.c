#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    // read and prints a character
    char ch;
    scanf("%c", &ch);
    printf("%c", ch);
    puts("");

    // read and prints a string
    char s[50];
    scanf("%s", s);    
    printf("%s", s);
    puts("");

    // read and prints a sentence
    char sen[500];
    scanf("\n"); // the last statement will read a newline character from the previous line
    scanf("%[^\n]%*c", sen);
    printf("%s", sen);
    


    // or

        int BUFFSIZE = 256;
    
    	char c;
    	char str[BUFFSIZE];
    	char sen[BUFFSIZE];
    
    	scanf("%c ", &c);
    	scanf("%s ", str);
    	fgets(sen, BUFFSIZE, stdin);
    
    	printf("%c\n", c);
    	printf("%s\n", str);
    	printf("%s\n", sen);
    
    return 0;
}



}
