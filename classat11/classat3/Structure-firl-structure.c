#include<stdio.h>
#include<conio.h>
struct Student{
    int id;
    char fName[30];
    char lName[30];
    char email[50];
};
void main(){
    //Crud operations in a file
    char choice;
    do{
            //main program logic
            printf("Options: \n a. Add a new Student\n b. View a Student's Details\n");
            printf(" c. View all Students Details \n d. Update a Student's Details\n");
            printf(" e. Delete a Student's Details\n-");

            scanf("%c"&choice);
            if(choice=='a'){

            }

        do{
            printf("Do you want to continue(y/n)?");
            scanf(" %c", &choice);
        }while(!(choice=='y'||choice=='n'));
    }while(choice=='y');


}
