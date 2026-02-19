package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            IO.println("Quantos numeros voce vai digitar?");
            num = sc.nextInt();
            if (num < 0) {
                IO.println("Quantidade maxima/minima atingida");
            }
        } while (num < 0);
        
        int[] vetorA = new int [num];
        int[] vetorB = new int [num];
        int[] vetorC = new int [num];

        for (int i = 0; i < vetorA.length; i++) {
            IO.println("Digite os valores do vetor A");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            IO.println("Digite os valores do vetor B");
            vetorB[i] = sc.nextInt();
        }
       
        IO.println("Vetores Resultantes");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            IO.println(vetorC[i]);
        }

        sc.close();

    }
}
