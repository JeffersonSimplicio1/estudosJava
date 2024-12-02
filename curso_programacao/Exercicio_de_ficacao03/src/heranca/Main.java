package heranca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList <Veiculo> veiculo = new ArrayList<Veiculo>();
		
		veiculo.add(new Veiculo("XPO-0987",2010));
		veiculo.add(new Veiculo("ABC-1234",2012));
		veiculo.add(new Veiculo("KYX=0987",2014));
		veiculo.add(new Caminhao("NZT-3028",2014,5));
		veiculo.add(new Caminhao("HJU-3341",2000,7));
		
		ArrayList <Caminhao> caminhoes = new ArrayList<Caminhao>();
		
		veiculo.add(new Veiculo("XPO-0987", 2010));
		veiculo.add(new Caminhao("HJU-3341", 2000,7));
		
		for(Veiculo veiculos : veiculo) {
			veiculos.exibirDados();
		}
		for (Caminhao caminhao : caminhoes) {
			caminhao.exibirDados();
		}
		
		
		
	}

}
