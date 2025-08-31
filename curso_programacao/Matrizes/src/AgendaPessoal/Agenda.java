package AgendaPessoal;

import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String [] [] compromissos = new String[31][24];

            boolean sair = false;
            byte opcao;
            while (!sair){
                System.out.println("Escolha a opção: \n" +
                        " 1 - Adicionar compromisso \n" +
                        " 2 - Verifciar compromisso \n" +
                        " 3 - Sair");
                opcao = sc.nextByte();

                if(opcao == 1){ // add compromisso
                    boolean diaValido = false;
                    boolean horaValida = false;
                    int dia = 0;
                    int hora = 0;

                    while(!diaValido){ // validando o dia
                    System.out.print("Qual o dia do mês em que você quer adicionar o compromisso? ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia<=31){
                        diaValido = true;
                    } else {
                        System.out.println("Dia invalido, digite novamente. ");
                      }
                    }

                    while(!horaValida){ // validando a hora
                        System.out.print("Qual o horario do compromisso? ");
                        hora = sc.nextInt();
                        if(hora > 0 && hora <= 24){
                            horaValida = true;
                        }
                        else{
                            System.out.println("Horario invalido, digite novamente.");
                        }
                    }
                    dia --;
                    System.out.println("Digite o compromisso: ");
                    compromissos [dia] [hora] = sc.next();
                    System.out.println("--------------------------------------------");

                } else if(opcao == 2){ // verificar compromisso
                    boolean diaValido = false;
                    boolean horaValida = false;
                    int dia = 0;
                    int hora = 0;

                    while(!diaValido){ // validando o dia
                        System.out.print("Qual o dia do mês em que você quer adicionar o compromisso? ");
                        dia = sc.nextInt();
                        if(dia > 0 && dia<=31){
                            diaValido = true;
                        } else {
                            System.out.println("Dia invalido, digite novamente. ");
                        }
                    }

                    while(!horaValida){ // validando a hora
                        System.out.print("Qual o horario do compromisso? ");
                        hora = sc.nextInt();
                        if(hora > 0 && hora <= 24){
                            horaValida = true;
                        }
                        else{
                            System.out.println("Horario invalido, digite novamente.");
                        }
                    }
                     dia --;
                    System.out.println("O compromisso agendado é: " + compromissos [dia] [hora] );
                    System.out.println("--------------------------------------------");


                } else if (opcao == 0){ // sair do programa
                    System.out.println("Finalizando programa!!");
                    break;

                } else{
                    System.out.println("Opção invalida! =( \n"+
                                                     "          Digite novamente!! =D");
                }
            }


    }
}
