package entities;

public class Triangulo extends Formas{
    private Double base;
    private Double altura;

    public Triangulo(){
    }

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public double area(){
        return (getBase() * getAltura()) / 2;
    }
}
