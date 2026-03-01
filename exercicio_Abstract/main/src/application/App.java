package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Shape;
import services.SetShape;
import views.ViewShapes;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a Quantidade de formas: %n");
        int quant = sc.nextInt();
        sc.nextLine();
        List<Shape> listaFormas = new ArrayList<Shape>();
        SetShape.forma(sc, listaFormas, quant);
        ViewShapes.visualizar(listaFormas);
        sc.close();
    }
}
