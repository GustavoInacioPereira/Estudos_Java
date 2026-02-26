package Utilities;


public class CheckArray {
    public static void checaMatriz(int[][] matriz, int number) {
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == number) {
                    System.out.printf("Posição na Matriz: [%d] [%d]%n", i, j);
                    if (j - 1 >= 0) {
                        int left = matriz[i][j - 1];
                        System.out.printf("Numero à esquerda: %d %n",left);
                    }
                    if ((j + 1) < matriz[i].length) {
                        int numDireita = matriz[i][j + 1];
                        System.out.printf("Numero à direita: %d %n",numDireita);
                    }
                    if ((i - 1) >= 0) {
                        int numCima = matriz[i - 1][j];
                        System.out.printf("Numero acima: %d %n",numCima);
                    }
                    if ((i + 1) < matriz.length) {
                        int numBaixo = matriz[i + 1][j];
                        System.out.printf("Numero abaixo: %d %n",numBaixo);
                    }
                    
                }
            }
        }
         
    }
    
}
