package application;
import java.util.Scanner;

import services.ReadClients;
import services.RegisterClients;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path = "src\\document\\clients.txt";
        RegisterClients.register(sc, path);
        ReadClients.read(path);
        sc.close();
    }
}
