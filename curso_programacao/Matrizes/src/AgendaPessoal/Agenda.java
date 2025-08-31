package AgendaPessoal;

import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][24];
        // Mês, Dias, Horas

        boolean sair = false;
        byte opcao;
        while (!sair) {
            System.out.println("Escolha a opção: \n" +
                    " 1 - Adicionar compromisso \n" +
                    " 2 - Verifciar compromisso \n" +
                    " 3 - Sair");
            opcao = sc.nextByte();
            boolean diaValido = false;
            boolean horaValida = false;
            boolean mesValido = false;
            int dia = 0;
            int hora = 0;
            int mes = 0;

            if (opcao == 1) { // add compromisso
                while (!mesValido) { // validando o dia
                    System.out.print("Qual o mês em que você quer adicionar o compromisso? ");
                    mes = sc.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("mes invalido, digite novamente. ");
                    }
                }

                    while (!diaValido) { // validando o dia
                        System.out.print("Qual o dia do mês em que você quer adicionar o compromisso? ");
                        dia = sc.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia invalido, digite novamente. ");
                        }
                    }

                    while (!horaValida) { // validando a hora
                        System.out.print("Qual o horario do compromisso? ");
                        hora = sc.nextInt();
                        if (hora > 0 && hora <= 24) {
                            horaValida = true;
                        } else {
                            System.out.println("Horario invalido, digite novamente.");
                        }
                    }
                    mes--;
                    dia--;
                    System.out.println("Digite o compromisso: ");
                    compromissos[mes][dia][hora] = sc.next();
                    System.out.println("--------------------------------------------");
                } else if (opcao == 2) { // add compromisso
                    while (!mesValido) { // validando o dia
                        System.out.print("Qual o mês em que você quer adicionar o compromisso? ");
                        mes = sc.nextInt();
                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("mes invalido, digite novamente. ");
                        }
                    }

                        while (!diaValido) { // validando o dia
                            System.out.print("Qual o dia do mês em que você quer adicionar o compromisso? ");
                            dia = sc.nextInt();
                            if (dia > 0 && dia <= 31) {
                                diaValido = true;
                            } else {
                                System.out.println("Dia invalido, digite novamente. ");
                            }
                        }

                        while (!horaValida) { // validando a hora
                            System.out.print("Qual o horario do compromisso? ");
                            hora = sc.nextInt();
                            if (hora > 0 && hora <= 24) {
                                horaValida = true;
                            } else {
                                System.out.println("Horario invalido, digite novamente.");
                            }
                        }
                        mes--;
                        dia--;
                    System.out.println("O compromisso agendado é: " + compromissos[mes][dia][hora]);
                    System.out.println("--------------------------------------------");
                    }  else if (opcao == 3) { // sair do programa
                    System.out.println("Finalizando programa!!");
                    break;

                } else {
                    System.out.println("Opção invalida! =( \n" +
                            "          Digite novamente!! =D");
                }
            }
        }
    }

