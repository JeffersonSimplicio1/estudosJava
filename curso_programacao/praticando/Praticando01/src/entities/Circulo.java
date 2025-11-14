package entities;

public class Circulo extends Formas {
    private Double raio;

    public Circulo(){}

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    public double area(){
        return getRaio() * getRaio() * Math.PI;
    }
}
