package entities;

public class Account {

    private Integer numero;
    private String titular;
    private Double saldoInicial;
    private Double limiteSaque;
    private Double valorSaque;

    public Account(Integer numero, String titular, Double saldoInicial, Double limiteSaque, Double valorSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldoInicial = saldoInicial;
        this.limiteSaque = limiteSaque;
        this.valorSaque = valorSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }


    public Double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public double novoSaldo(){
        return saldoInicial - valorSaque;
    }
    @Override
    public String toString() {
        return String.format("Novo Saldo: %.2f%n", novoSaldo());
    }
}
