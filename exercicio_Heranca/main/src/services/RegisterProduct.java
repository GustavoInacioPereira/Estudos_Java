package services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class RegisterProduct {
    public static void register (int quant, List<Product> product, Scanner sc) {
        for(int i = 0; i < quant; i++) {
            System.out.printf("Produto Comum, Usado ou Importado (C / U / I) %n");
            String optionProduct = sc.nextLine().toUpperCase();
            switch (optionProduct) {
                case "C":
                    System.out.printf("Nome: %n");
                    String name = sc.nextLine();
                    System.out.printf("Price: %n");
                    double price = sc.nextDouble();
                    product.add(new Product(name, price));
                    sc.nextLine();
                    break;
                case "U":
                    System.out.printf("Nome: %n");
                    name = sc.nextLine();
                    System.out.printf("Price: %n");
                    price = sc.nextDouble();
                    sc.nextLine();
                    System.out.printf("Data de Fabricação: (DD/MM/YYYY) %n");
                    String date = sc.nextLine();
                    LocalDate dataFinal = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
                    product.add(new UsedProduct(name, price, dataFinal));
                    break;
                case "I":
                    System.out.printf("Nome: %n");
                    name = sc.nextLine();
                    System.out.printf("Price: %n");
                    price = sc.nextDouble();
                    System.out.printf("Taxa de Importação: %n");
                    double customsFee = sc.nextDouble();
                    product.add(new ImportedProduct(name, price, customsFee));
                    sc.nextLine();
                    break;
            
                default:
                    System.out.printf("Opção Invalida %n");
                    break;
            }
            
        }
    }
}
