import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tipo de estrutura do animal?\n" +
                " - Vertebrado\n" +
                " - Invertebrado\n");
        String palavraUm = sc.next();

        System.out.println("Digite qual o tipo do animal? \n " +
                "- Ave \n " +
                "- Mamifero \n " +
                "- Inseto \n " +
                "- Anelideo"

        );
        String palavraDois = sc.next();

        System.out.println("Qual o habito alimentar do animal?\n" +
                "- Carnivoro\n" +
                "- Herbivoro\n" +
                "- Onivoro\n" +
                "- Hematofago");

        String palavraTres = sc.next();

        if (palavraUm.equalsIgnoreCase("vertebrado")) {
            if (palavraDois.equalsIgnoreCase("Ave")) {
                if (palavraTres.equalsIgnoreCase("Carnivoro")) {
                    System.out.println("aguia");
                } else if (palavraTres.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if(palavraDois.equalsIgnoreCase("mamifero")) {
                if(palavraTres.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else if (palavraTres.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }

        } else if (palavraUm.equalsIgnoreCase("invertebrado")) {
            if(palavraDois.equalsIgnoreCase("inseto")) {
                if (palavraTres.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else if (palavraTres.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");

                }
            } else if (palavraDois.equalsIgnoreCase("anelideo")) {
                if (palavraTres.equalsIgnoreCase("hematofago")) {
                System.out.println("sanguessuga");
                } else if (palavraTres.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");

                }

            }

        }
    }
}


///////