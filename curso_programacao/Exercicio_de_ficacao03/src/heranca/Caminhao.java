package heranca;

public class Caminhao extends Veiculo{
	
	private int eixos;
	
	public Caminhao(String placa, int ano, int eixos) {
		super(placa,ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		System.out.println("A placa do veiculo é " + placa + " e o ano de fabricação é " + ano
				+ ", o numero de eixos é " + eixos);
	}
	

}
