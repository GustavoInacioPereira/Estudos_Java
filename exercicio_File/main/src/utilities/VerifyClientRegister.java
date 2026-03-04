package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VerifyClientRegister {
    public static boolean verify(String base, String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                if (line.equals(base)) {
                    System.out.println("Ja cadastrado");
                    return true;
                } else {
                    line = br.readLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao Ler Documento");
        }
        return false;
    }
}
