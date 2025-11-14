package Entities;

import java.awt.*;

public class Cicle extends Shape {
    private Double raio;

    public Cicle(Color color, Double raio) {
        super();
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    public double area(){
        return raio* raio * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("O valor da área do retângulo é: %.2f", area());
    }
}
