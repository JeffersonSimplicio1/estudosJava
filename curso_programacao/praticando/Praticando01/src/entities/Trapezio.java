package entities;

public class Trapezio extends Formas {
    private Double baseMaior;
    private Double baseMenor;
    private Double altura;

    public Trapezio(){}

    public Trapezio(Double baseMaior, Double baseMenor, Double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public Double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(Double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public Double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public double area(){
        return ((getBaseMaior() + getBaseMenor()) * getAltura()) / 2;
    }
}
