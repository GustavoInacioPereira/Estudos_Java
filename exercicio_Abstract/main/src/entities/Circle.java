package entities;
import entities.enums.Color;

public class Circle extends Shape{
    private double raio;

    public Circle (Color color, double raio) {
        super(color);
        this.raio = raio;    
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

   
}
