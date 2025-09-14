package ExercicioDeFixacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            System.out.println("Product #" + (i+1) + " data: ");
        System.out.print("Common, used or imported (c/u/i) ? ");
        char ch = sc.next().charAt(0);
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();

        if(ch == 'c'){
            Product prod = new Product(name, price);
            list.add(prod);
        } else if(ch == 'u'){
            System.out.println("Manufature date: (DD/MM/YYYY)");
            LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            list.add(new UsedProduct(name, price, date));
        } else if (ch == 'i') {
            System.out.print("Customs fee: ");
            double customsFee = sc.nextDouble();
            Product prod = new ImportedProduct(name, price, customsFee);
            list.add(prod);
          }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product prod :  list){
            System.out.println(prod.priceTag());
        }
        sc.close();
      }
    }
