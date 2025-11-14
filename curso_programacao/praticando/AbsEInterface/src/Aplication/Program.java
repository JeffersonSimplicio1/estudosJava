package Aplication;

import Entities.Cicle;
import Entities.Rectangle;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a figura que você deseja saber a area Retangulo ou Circulo (R/C): ");
        char resp = sc.next().charAt(0);
        resp = Character.toLowerCase(resp);
        sc.nextLine();

         if(resp == 'r'){

             System.out.print("Qual o valor da Base: ");
             double base = sc.nextDouble();
             System.out.print("Qual o valor da Altura: ");
             double altura = sc.nextDouble();

         } else if (resp == 'c'){
             System.out.print("Qual o valor raio do circulo: ");
             double raio = sc.nextDouble();

             Cicle cicle = new Cicle(Color.black, raio);

             System.out.println(cicle.toString());

         } else{
             System.err.println("Você digitou um valor invalido.");
         }
    }
}
