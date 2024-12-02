package atributos;

public class Circulo extends Figura{
	
	 private double raio;

	
	 
	 public Circulo (String cor, double raio) {
		 super(cor);
		 this.raio = raio;
	 }
	 public Circulo() {
		 
	 }
	 

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	 public String toString() {
		 return "Circulo [ raio = " + raio + ", cor = " + super.getCor()+"]";
	 }
	 
	 public double area () {
		 
		 return raio * 3.14*2;
	 }

}
