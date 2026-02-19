package application;
import java.util.Scanner;
import entities.Personas;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0, idade, quantMenorIdade = 0, controle = 0;
        String nome, mostra = "";
        double altura, porcen;
        

        do {
            IO.println("Quantos numeros voce vai digitar?");
            num = sc.nextInt();
            if (num < 0) {
                IO.println("Quantidade minima atingida");
            }
        } while (num < 0);
        
        Personas[] vetorPersonas = new Personas[num];
        

        for (int i = 0; i < vetorPersonas.length; i++) {
            sc.nextLine();
            IO.println("Digite o Nome");
            nome = sc.nextLine();
            IO.println("Digite a Idade");
            idade = sc.nextInt();
            IO.println("Digite a Altura");
            altura = sc.nextDouble();
            vetorPersonas[i] = new Personas(nome, idade, altura);
            if(vetorPersonas[i].isMinorAge() == true) {
                quantMenorIdade += 1;
            }
           
        }

        Personas[] vetorMenorIdade = new Personas[quantMenorIdade];

        
        for (int i = 0; i < vetorPersonas.length; i++) {
             if(vetorPersonas[i].isMinorAge()) {
                vetorMenorIdade[controle]  = vetorPersonas[i];
                mostra += " " + vetorMenorIdade[controle].getNome();
                controle++;
            }
        }

        porcen = (quantMenorIdade * 100.0) / vetorPersonas.length;

        System.out.print("Menores de 16 Anos: " + mostra);
        System.out.printf("Porcentagem de menores de idade %.2f ", porcen);
        sc.close();

    }
}
