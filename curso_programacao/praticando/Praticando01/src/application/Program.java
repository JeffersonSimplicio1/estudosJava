package application;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a figura que você quer calcular a area: \n " +
                "1 - Quadrado \n" +
                "2 - Triângulo \n" +
                "3 - Retângulo \n" +
                "4 - Trapezio \n" +
                "5 - Circulo\n");

            int n = sc.nextInt();

            if(n == 1){
                System.out.print("Qual a medida dos lados do quadrado? ");
                double lado = sc.nextDouble();

                Quadrado quadrado = new Quadrado(lado);

                System.out.printf("O valor da area do quadrado é: %.2f", quadrado.area());

            } else if (n == 2) {
                System.out.print("Qual o valor da base do triângulo: ");
                double base = sc.nextDouble();
                System.out.print("Qual o valor da altura do triângulo: ");
                double altura = sc.nextDouble();

                Triangulo triangulo = new Triangulo(base, altura);

                System.out.printf("O valor da area do triangulo é: %.2f", triangulo.area());

            } else if (n == 3) {
                System.out.print("Qual o valor da base do Retângulo: ");
                double base = sc.nextDouble();
                System.out.print("Qual o valor da altura do Retângulo: ");
                double altura = sc.nextDouble();

                Retangulo retangulo = new Retangulo(base, altura);

                System.out.printf("O valor da area do retangulo é: %.2f", retangulo.area());

            } else if (n ==4) {
                System.out.print("Qual o valor da base Maior do Trapezio: ");
                double baseMaior = sc.nextDouble();
                System.out.print("Qual o valor da base Menor do Trapezio: ");
                double baseMenor = sc.nextDouble();
                System.out.print("Qual o valor da base altura do Trapezio: ");
                double altura = sc.nextDouble();

                Trapezio trapezio = new Trapezio(baseMaior, baseMenor, altura);

                System.out.printf("A area do trapezio é: %.2f", trapezio.area());

            } else if (n == 5) {
                System.out.print("Você possui o valor do raio ou do diametro da figura (R / D): ");
                char select = sc.next().charAt(0);
                select = Character.toLowerCase(select);

                if(select == 'r'){
                    System.out.print("Insira o valor do raio: ");
                    double raio = sc.nextDouble();

                    Circulo circulo = new Circulo(raio);

                    System.out.printf("A area do circulo é %.2f", circulo.area());

                } else if (select == 'd') {
                    System.out.print("Insira o valor do Diametro do circulo: ");
                    double diametro = sc.nextDouble();
                    double raio = diametro/2;

                    Circulo circulo = new Circulo(raio);

                    System.out.printf("A area do circulo é %.2f", circulo.area());

                } else {
                    System.err.println("Você inserio um valor invalido!");
                }
            } else {
        System.err.println("VocÊ inserio um valor invalido!");
    }

        sc.close();
    }
}
