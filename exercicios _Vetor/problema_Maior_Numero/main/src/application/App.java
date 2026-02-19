package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0, positionMaiorNum = 0;
        double maiorNum = 0;

        do {
            IO.println("Quantos numeros voce vai digitar?");
            num = sc.nextInt();
            if (num < 0) {
                IO.println("Quantidade maxima/minima atingida");
            }
        } while (num < 0);
        
        double[] vetorNum = new double[num];

        for (int i = 0; i < vetorNum.length; i++) {
            IO.println("Digite um numero");
            vetorNum[i] = sc.nextDouble();
        }

        
        for (int i = 0; i < vetorNum.length; i++) {
            
            if(maiorNum < vetorNum[i]) {
                maiorNum = vetorNum[i];
                positionMaiorNum = i + 1;
            }         
        }

        System.out.printf("Maior Numero: %.2f%n posição: %d", maiorNum, positionMaiorNum);      
        sc.close();

    }
}
