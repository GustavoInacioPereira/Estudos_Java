package services;

import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import utilities.VerifyOption;

public class SetShape {
    public static void forma (Scanner sc, List<Shape> listaFormas, int quant) {
         for(int i = 0; i < quant; i++) {
            System.out.printf("Forma #%d%n", i);
            System.out.printf("Digite a Opção: %n1 - Circulo %n2 - Retangulo %n");
            int option = sc.nextInt();
            sc.nextLine();
            option = VerifyOption.verifica(option, 1, 2, sc);

            switch (option) {
                case 1:
                    Color color = SetColor.color(sc);
                    System.out.printf("Raio: %n");
                    double raio = sc.nextDouble();
                    listaFormas.add(new Circle(color, raio));
                    break;
                case 2:
                    color = SetColor.color(sc);
                    System.out.printf("Largura %n");
                    double largura = sc.nextDouble();
                    System.out.printf("Altura %n");
                    double altura = sc.nextDouble();
                    listaFormas.add(new Rectangle(color, largura, altura));
                    break;
            
                default:
                    break;
            }
        }
    }
}
