package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int som = 0;
        double media;

        do {
            IO.println("Quantos numeros voce vai digitar?");
            num = sc.nextInt();
            if (num > 10 ||  num < 0) {
                IO.println("Quantidade maxima/minima atingida");
            }
        } while (num > 10 ||  num < 0);
        
        double[] vetorNum = new double[num];

        for (int i = 0; i < vetorNum.length; i++) {
            IO.println("Digite um numero");
            vetorNum[i] = sc.nextDouble();
        }

        System.out.printf("Valores: ");
        for (int i = 0; i < vetorNum.length; i++) {
            System.out.print(vetorNum[i] + " ");
            som += vetorNum[i];
        }

        media = som / num;
        System.out.printf("%n Soma: %2.f%n ", som);
        System.out.printf("Media: %.2f%n ",  som);
        sc.close();

    }
}
