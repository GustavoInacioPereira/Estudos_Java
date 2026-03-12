package application;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();

        String path = "src/documents/employee.txt";
        try (Stream<String> linhasDoArquivo = Files.lines(Paths.get(path))) {
            List<Employee> employeeInArchive = linhasDoArquivo
                    .filter(lines -> !lines.trim().isEmpty())
                    .map(lines -> lines.split(";"))
                    .map(vectInfos -> new Employee(vectInfos[0], vectInfos[1], Double.valueOf(vectInfos[2])))
                    .collect(Collectors.toList());
            employees.addAll(employeeInArchive);
        } catch (Exception e) {
            System.out.println("Erro ao ler documento");
        }

        double value = 100.20;
        

        List<String> employeeInOrder = employees.stream()
                .filter(emp -> emp.getSalary() > value)
                .map(emp -> emp.getEmail().toString())
                .sorted()
                .collect(Collectors.toList());

        Double employeeLetterSom = employees.stream()
                .filter(item -> item.getName().startsWith("M"))
                .mapToDouble(emp -> emp.getSalary())
                .sum();               
        
        System.out.printf("Email dos Funcionarios que tem salario acima de %.2f: %n", value);
        employeeInOrder.forEach(System.out::println);
        System.out.printf("Soma dos Salarios dos funcionarios que o nome começam com 'M': %.2f %n", employeeLetterSom);
        

    }
}
