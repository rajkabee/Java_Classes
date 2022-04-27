#include<stdio.h>
#include<conio.h>
void main(){
    FILE *fp;
    char ch;
    //write
    fp = fopen("test.txt", "w");
    fprintf(fp, "new file created successfully2!");
    fclose(fp);

    //read
    fp = fopen("test.txt", "r");

    while(fscanf(fp, "%c", &ch)!=EOF){
        printf("%c", ch);
    }

    fclose(fp);

    printf("\n appending \n");
    //append
    fp = fopen("test.txt", "a");
    fprintf(fp, "Appended test here!");
    fclose(fp);
    //read again
    fp = fopen("test.txt", "r");

    while(fscanf(fp, "%c", &ch)!=EOF){
        printf("%c", ch);
    }

    fclose(fp);




    getch();
}
