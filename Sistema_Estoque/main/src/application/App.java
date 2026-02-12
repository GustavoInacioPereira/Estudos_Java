package application;
import entities.product;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        product prod = new product();
        char escolha;
        int quantidade;

        IO.print("Qual o nome da peça: ");
        prod.name = sc.nextLine();
        IO.print("Qual o valor da peça: ");
        prod.valor = sc.nextDouble();
        IO.print("Quantidade de peças em estoque: ");
        prod.quant = sc.nextInt();
        

        IO.print("Deseja retirar alguma peça do estoque? (S N)");
        escolha = sc.next().toUpperCase().charAt(0);
        if (escolha == 'S') {          
            IO.print("Quants unidades voce quer retirar?");
            quantidade = sc.nextInt();
            IO.print(prod.removProd(quantidade));
        } 

        IO.print("Deseja adicionar alguma peça do estoque? (S N)");
        escolha = sc.next().toUpperCase().charAt(0);
        if (escolha == 'S') {
            IO.print("Quants unidades voce quer adicionar?");
            quantidade = sc.nextInt();
            IO.print(prod.addProd(quantidade));
        } 

        System.out.printf("O produto %s tem %d unidades em estoque, com cada unidade saindo por R$%.2f%n", prod.name, prod.quant, prod.valor);
        IO.print(prod.valEstoque());
        sc.close();
   
    }
}
