package entities;

public class ImportedProduct extends Product {
    private double customsFee;
    public ImportedProduct (String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return this.price + this.customsFee;
    }

    @Override
    public String priceTag () {
       return "Produto: " + this.name + " Preço: " + this.price + " Custo de Importação: " + this.customsFee + " Valor total: " + this.totalPrice();
    }
}
