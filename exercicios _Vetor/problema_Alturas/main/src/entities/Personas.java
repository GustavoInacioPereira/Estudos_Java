package entities;

public class Personas {
    private String nome;
    private int idade;
    private double altura;

    public Personas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;      
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Double getAltura() {
        return altura;
    }

    public boolean isMinorAge() {
        if (idade < 16) {
            return true;
        }
        return false;
    }

}
