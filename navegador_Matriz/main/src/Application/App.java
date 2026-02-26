package Application;
import java.util.Scanner;
import Utilities.CheckArray;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Quantidade de Linhas: ");
        int quantLinha = sc.nextInt();
        System.out.println("Digite a Quantidade de Colunas: ");
        int quantCol = sc.nextInt();
        

        int matriz [][] = new int[quantLinha][quantCol];

        System.out.println("Digite os Numeros:  ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o Numero para analise:  ");
        int number = sc.nextInt();
        CheckArray.checaMatriz(matriz, number);
        sc.close();
        
    } 
}
