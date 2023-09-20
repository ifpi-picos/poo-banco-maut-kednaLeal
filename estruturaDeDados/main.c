#include <stdio.h>// biblioteca-padrão de entrada/saída

int main(void){ //função main inicia execução do programa
   char en;
    printf("digite seu nome: ");
    scanf("%s", &en);

    printf(en);
    return 0; // indica que o programa terminou com sucesso
}