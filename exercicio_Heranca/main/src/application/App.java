import services.RegisterProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Product;


public class App {
    public static void main(String[] args) throws Exception {
        List<Product> product = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite a quantidade: %n");
        int quant = sc.nextInt();
        sc.nextLine();
        RegisterProduct.register(quant, product, sc);
        
      for(int i = 0; i < product.size(); i++) {
            System.out.println(product.get(i).priceTag());
        }
    
        sc.close();
    }
}
