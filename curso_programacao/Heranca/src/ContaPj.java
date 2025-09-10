public class ContaPj extends Conta{
    private Double limiteDeEmprestimo;

    public ContaPj(){
        super();
    }

    public ContaPj(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
        super(numero, titular, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public ContaPj(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public Double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }
    public void emprestimo (double quantia){
        if(quantia <= limiteDeEmprestimo){
            saldo = saldo + quantia -10.0;
            /*Saldo é visivel nesta classe porque esta classificado com protected, caso estivesse como private o mesmo não
            seria visivel por esta classe*/
            }
        
    }
    @Override
    public void saque(double quantia){
        super.saque (quantia);
        saldo -= 2.0;
    }
}
