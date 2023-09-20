

#include <stdio.h>
#include <stdlib.h>


int main(int argc, char** argv) {
    
    float notas[4],media,soma=0;
    
    //ler as notas dos alunos
    for (int i=0;i<=3;i++){
        printf("Digite  a nota %d: ", i+1);
        scanf("%f", &notas[i]);
        soma+=notas[i];
    }
    
    media=soma/4;
    if(media<7)
        printf("Reprovado");
    else
        printf("Aprovado");
    
    /*printf("A media do aluno é %.2f", media);
    
    return (EXIT_SUCCESS);
}

