import java.util.Random;

public class Colaborador {
    public String nome;
    public String email;
    public int matricula;
    public int idade;
    Random random = new Random();

public double salario (){
    double salario;
    if(idade <=20){
        salario = 1500;
    }  else if( idade > 20 && idade <=30) {
        salario = 2000;
    } else if (idade > 30 && idade <= 50){
        salario = 3000;
    } else {salario = 5000;}
    return salario;
}
public int matricula(){
    matricula = random.nextInt(1000);
    return matricula;
}

    @Override
    public String toString() {
        return "\n --------------------------------------------------\n" +
                "Nome do Colaborador: "+ nome + "\n" +
                "Matricula do Colaborador: " + matricula() + "\n" +
                "Email do Colaborador: " + email + "\n" +
                "Salario do Colaborador: " + salario() + "\n";
    }
}

