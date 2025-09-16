package ExercicioDeFixacao02;

public class Circulo {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double areaDoCirculo (){
        return raio * 3.14;
    }
}
