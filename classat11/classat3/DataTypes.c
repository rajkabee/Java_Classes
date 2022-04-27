#include<stdio.h>
#include<conio.h>
int main(){
    /*
    Integer
        byte    8bits +127 to -128
        short   16bits +32768 to -32767
        int     32bits +/- 2.14 billions
        long    64bits +/- 9.223billionsbillions

    Float
        float       32bits
        double      64bits

    Character
        char

    Boolean
        bool
    */

    short s;
    float f;
    char ch, c, name[20];
    s=234;
    printf("\nEnter a number: ");
    scanf("%d", &s);
    printf("s = %d", s);
    printf("\nEnter a floating point number: ");
    scanf("%f", &f);
    printf("f = %.3f", f);
    printf("\na,b,c Enter a choice: ");
    scanf(" %c", &ch);
    printf("ch : %c", ch);
    getch();
    printf("Enter your name: ");
    scanf("%s", &name);
    printf("Hello, %s!", name);
    return 1;
}
