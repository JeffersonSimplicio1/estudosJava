package ExercicioDeFixacao05;

public class PessoaFisica extends Pessoas{
    private double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    public double calculoImposto(){
        double imposto = 0;
        if(getRendaAnual()< 2000){
             imposto = getRendaAnual() * 0.15;
        } else if (getRendaAnual() >= 2000){
            imposto = getRendaAnual() * 0.25;
        }
        return imposto;
    }

    public double saude(){
        double valor =0;
        if(gastosSaude > 0){
            valor = getGastosSaude() * 0.5;
        }
        return valor;
    }

    @Override
    public double impostoPago() {
        return calculoImposto() - saude();
    }

    @Override
    public String toString() {
        return getNome() + ": $ " + String.format("%.2f", impostoPago()) + "\n";
    }
}
