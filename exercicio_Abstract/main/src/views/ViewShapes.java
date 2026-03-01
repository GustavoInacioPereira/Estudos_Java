package views;

import java.util.List;

import entities.Shape;

public class ViewShapes {
    public static void visualizar(List<Shape> listaFormas) {
        for(int i = 0; i < listaFormas.size(); i++) {
            System.out.printf("-----Objeto #%d -----%n", i);
            System.out.println("Cor: " + listaFormas.get(i).getColor() + " (" + listaFormas.get(i).getColor().getHexColor() + ")");
            System.out.printf("Area: %.2f%n", listaFormas.get(i).area());
        }
    }
}
