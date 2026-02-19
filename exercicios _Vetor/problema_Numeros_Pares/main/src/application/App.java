package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0, quantPar = 0;
        String mostra = "";

        do {
            IO.println("Quantos numeros voce vai digitar?");
            num = sc.nextInt();
            if (num < 0) {
                IO.println("Quantidade minima atingida");
            }
        } while (num < 0);
        
        int[] vetorNum = new int[num];

        for (int i = 0; i < vetorNum.length; i++) {
            IO.println("Digite um numero");
            vetorNum[i] = sc.nextInt();
            if (vetorNum[i] % 2 == 0) {
                quantPar += 1;
            }
        }

        int[] vetorPar = new int[quantPar];
        int controlePar = 0;
        for (int i = 0; i < vetorNum.length; i++) {
              if (vetorNum[i] % 2 == 0) {
                vetorPar[controlePar] = vetorNum[i];
                mostra += " " + vetorPar[controlePar];
                controlePar++;
            }
        }

        
        System.out.printf("Pares: %d%n ", mostra);
        System.out.printf("Quantidade de Pares: %d%n ", quantPar);
        
        sc.close();

    }
}
