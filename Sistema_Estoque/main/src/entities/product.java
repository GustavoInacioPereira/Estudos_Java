package entities;

public class product {
    public String name;
    public Double valor;
    public int quant;

    public String valEstoque () {
        return String.format("O valor total em estoque é de R$%.2f%n", quant * valor);
    }

    public String removProd (int a) {
        quant -= a;
        return String.format("Removido %d itens, sobrando %d itens em estoque %n", a, quant);
    };

    public String addProd (int a) {
        quant += a;
        return String.format("Adicionado %d itens %n", a);
    };
}

