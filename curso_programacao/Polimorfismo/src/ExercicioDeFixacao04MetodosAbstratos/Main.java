package ExercicioDeFixacao04MetodosAbstratos;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*Fazer um programa para ler os dados de n figuras (Fornecidas pelo usuario), e depois mostrar as areas desta figura na mesma ordem em que foram
   digitadas*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Shape #" + i+1 + "data: ");
            System.out.print("Retangle or Circle (r/c)? ");
            char rc = sc.next().charAt(0);
            System.out.println("Color (BLACK/ BLUE/ RED): ");
            Color color = Color . getColor(sc.next());


            if(rc == 'r' ){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width,height));
            } else if(rc == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS: ");
        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }


        sc.close();
    }
}
