package entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate date;

    public UsedProduct (String name, Double price, LocalDate date) {
        super(name, price);
        this.date = date;
    }

    @Override
    public String priceTag () {
       return "Produto (Usado): " + this.name + " Preço: " + this.price + " Data de Fabricação:  " + this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
