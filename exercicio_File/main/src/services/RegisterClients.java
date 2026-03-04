package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

import entities.Clients;
import utilities.VerifyClientRegister;

public class RegisterClients {
    public static void register(Scanner sc, String path) {
        boolean verify = false;
        System.out.printf("Digite o Nome %n");
        String name = sc.nextLine();
        System.out.printf("Digite o Email %n");
        String email = sc.nextLine();
        System.out.printf("Digite o Telefone %n");
        String numTel = sc.nextLine();

        Clients cliente = new Clients(name, email, numTel);
        verify = VerifyClientRegister.verify(
                "Nome: " + cliente.getName() + ", Email: " + cliente.getEmail() + ", Telefone: " + cliente.getNumTel(), path);
        if (!verify) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                bw.write("Nome: " + cliente.getName() + ", Email: " + cliente.getEmail() + ", Telefone: " + cliente.getNumTel() + "\n");

            } catch (IOException e) {
                System.out.println("Erro ao Escrever Documento");

            }
        }

    }
}
