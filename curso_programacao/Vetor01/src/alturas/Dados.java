package alturas;

public class Dados {
    private String nome;
    private int idade;

    public Dados(String nome, int idade, double altura ) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    private double  altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
