# Matrizes_com_JAVA
Praticando Matriz em  Java com o VsCode.
O programa tem como objetivo gerar uma matriz 3(linhas) por 5(colunas) com números de 0 a 100 aleatórios, feito através do VsCode.
Aula:https://www.youtube.com/watch?v=XKDSNSJvlxM&list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW&index=11
_____________________________________________________________________________________________________________________________________
//Começo do Código:


import java.security.SecureRandom; //biblioteca para utilizar a função Random
public static void main(String[] args) {
      
        final int linhas=3;
        final int colunas=5;
        int[][] numeros = new int[linhas][colunas];
        
        for(int l=0; l<linhas;l++){
            for(int c=0; c<colunas; c++){
        numeros[l][c]=new SecureRandom().nextInt(100);//irá sempre modificar a posição dos núm. lançando núm. aleatórios	
        }
        }
        
        for(int l=0;l<linhas; l++){
            for(int c=0; c<colunas; c++){
             System.out.printf("%2d | ",numeros[l][c]);
            }
        System.out.printf("%n");
        }
    }}

