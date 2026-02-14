package entities;

public class Cliente {
    private String nameCli;
    private int numConta;
    private double valorEmConta;
    private static double taxaSaque = 5.00;

    public String getNameCli () {
        return nameCli;
    }
    public int getNumConta () {
        return numConta;
    }
    public double getValorEmConta () {
        return valorEmConta;
    }
     public static double getTaxaSaque () {
        return taxaSaque;
    }

    public void setNameCli (String nameCli) {
        this.nameCli = nameCli;
    }
    public static void setTaxaSaque (double taxaSaque) {
        Cliente.taxaSaque = taxaSaque;
    }


    public Cliente (String nameCli, int numConta) {
        this.nameCli = nameCli;
        this.numConta = numConta;
    }
    public Cliente (String nameCli, int numConta, double valorEmConta) {
        this.nameCli = nameCli;
        this.numConta = numConta;
        this.valorEmConta = valorEmConta;
    }
     
    
    public void deposito(double valDeposito) {
        valorEmConta += valDeposito;
    }

    public void saque(double valSaque) {
        valorEmConta -= (valSaque + taxaSaque);
    }


}