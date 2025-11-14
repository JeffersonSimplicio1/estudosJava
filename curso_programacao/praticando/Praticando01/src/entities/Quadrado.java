package entities;

public class Quadrado extends Formas{
    private double lado;

    public Quadrado(){
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double area(){
        return getLado() * getLado();
    }
}
