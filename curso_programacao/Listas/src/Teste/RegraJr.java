package Teste;

public class RegraJr {
    private String nome;
    private  int matricula;
    private double faturamento;

    public RegraJr(String nome, int matricula, double faturamento) {
        this.nome = nome;
        this.matricula = matricula;
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getFaturamento() {
        return faturamento;
    }


    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public double faturamentoJunior (double faturamento){
    double calculoDeFaturamento = faturamento * 0.01;
    return calculoDeFaturamento;
}

    @Override
    public String toString() {
        return "O funcionario: " + nome +
                ", portador do numero de matricula:  " + matricula +
                ", Faturou o valor de " + faturamento;
    }
}
