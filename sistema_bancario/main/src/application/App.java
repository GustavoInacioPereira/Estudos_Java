package application;
import entities.Cliente;
import util.ConverterRealToDolar;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean sair = false;
        double deposito, saque;

        IO.print("Digite seu nome: ");
        String nameCli = sc.nextLine();
        IO.print("Digite o número da sua conta: ");
        int numConta = sc.nextInt();
        IO.print("Deseja fazer um deposito inicial? (S/N)");
        char escolha = sc.next().toUpperCase().charAt(0);
        Cliente cli = new Cliente(nameCli, numConta);
        

        if (escolha == 'S') {
            IO.print("Digite o valor para deposito inicial: ");
            deposito = sc.nextDouble();
            cli = new Cliente(nameCli, numConta, deposito);
        }  

        do {
            System.out.printf("Olá %s, cliente da conta %d%nsua conta tem um total de R$%.2f%n", cli.getNameCli(), cli.getNumConta(), cli.getValorEmConta());
            System.out.printf("Digite o numero da opção: %n1 - Mudar nome %n2 - Realizar um novo depósito %n3 - Realizar conversão para dolar %n4 - Realizar Saque %n5 - Sair%n");
            opcao = sc.nextInt(); 
            sc.nextLine();  

            switch (opcao) {
                case 1:
                    IO.print("Digite seu nome: ");
                    nameCli = sc.nextLine();
                    cli.setNameCli(nameCli);
                    break;

                case 2:
                    IO.print("Digite o valor para deposito: ");
                    deposito = sc.nextDouble();
                    cli.deposito(deposito);
                    System.out.printf("Deposito de %.2f realizado", deposito);
                    break;

                case 3:
                    if (cli.getValorEmConta() <= 0) {
                        System.out.printf("Sem saldo em conta%n");
                        break;
                    }
                    System.out.printf("R$%.2f convertidos para dolar = $%.2f %n", cli.getValorEmConta(), ConverterRealToDolar.converter(cli.getValorEmConta()));
                    break;

                case 4:
                    System.out.printf("Digite o valor para Saque: (Há uma taxa de %.2f para cada saque) ", Cliente.getTaxaSaque());
                    saque = sc.nextDouble();
                    cli.saque(saque);
                    System.out.printf("Saque de %.2f realizado %n", saque);
                    break;

                case 5:
                    sair = true;
                    break;
            
                default:
                    System.out.printf("Opção Invalida%n");
                    break;
            }
        } while (sair == false);

        sc.close();
    }
}
