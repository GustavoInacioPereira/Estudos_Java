package services;

import java.util.Scanner;

import entities.enums.Color;
import utilities.VerifyOption;

public class SetColor {
    public static Color color(Scanner sc) {
        System.out.printf("Digite a Opção da cor: %n");
        for(int i = 0; i < Color.values().length; i++) {
            System.out.printf("%d - %s %n", i, Color.values()[i]);
        }
        int optionColor = sc.nextInt();
        sc.nextLine();
        optionColor = VerifyOption.verifica(optionColor, 0, Color.values().length - 1, sc);

        return Color.values()[optionColor];
    }
}
