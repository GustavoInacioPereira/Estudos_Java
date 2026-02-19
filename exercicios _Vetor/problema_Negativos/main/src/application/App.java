package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            IO.println("Quantos numeros voce vai digitar?");
            num = sc.nextInt();
            if (num > 10 ||  num < 0) {
                IO.println("Quantidade maxima/minima atingida");
            }
        } while (num > 10 ||  num < 0);
        
        int[] numInt = new int[num];

        for (int i = 0; i < numInt.length; i++) {
            IO.println("Digite um numero");
            numInt[i] = sc.nextInt();
        }

        for (int i = 0; i < numInt.length; i++) {
            if (numInt[i] < 0) {
                System.out.printf("%d%n", numInt[i]);
            }
        }
        sc.close();

    }
}
