package utilities;

import java.util.Scanner;

public class VerifyOption {
    public static int verifica(int option, int primeiroValor, int segundoValor, Scanner sc) {
        do {
            if(option < primeiroValor || option > segundoValor) {
                System.out.printf("Opção Inválida %n Digite a Opção");
                option = sc.nextInt();
                sc.nextLine();
            }
            
        } while (option < primeiroValor || option > segundoValor);
        return option;
    }       
   
}
