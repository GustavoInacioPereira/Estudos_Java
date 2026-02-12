package application;
import util.converter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);       
        double n1,n2;
        IO.print("Qual a cotação do dolar? ");
        n1 = sc.nextDouble();
        IO.print("Deseja comprar quantos dolares? ");
        n2 = sc.nextDouble();
        IO.print(converter.cotacao(n1, n2));
        sc.close();
    }
}
