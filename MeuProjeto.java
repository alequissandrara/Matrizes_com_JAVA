package ProjetoJava;
import java.security.SecureRandom;

public class MeuProjeto {
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


       




    }
}
