#include <stdio.h>
int main() {
   FILE *f = fopen("test.bin", "r");
   int c = getc(f);
   while (c != EOF) {
      putchar(c);
      c = getc(f);
   }
   fclose(f);
   getchar();
   return 0;
}
