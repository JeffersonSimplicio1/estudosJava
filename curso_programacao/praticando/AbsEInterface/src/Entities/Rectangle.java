package Entities;

import java.awt.*;

public class Rectangle extends Shape {
    private double altura;
    private double base;

    public Rectangle(Color color, double altura, double base) {
        super();
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area(){
        return getBase() * getAltura();
    }

    @Override
    public String toString() {
        return String.format("O valor da área do retângulo é: %.2f", area());
    }

}
