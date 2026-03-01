package entities;
public class Product {
    protected String name;
    protected double price;
    protected String priceTag;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String priceTag () {
       return "Produto: " + this.name + " Preço: " + this.price;
    }
}
