package ExercicioListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios vao ser registrados? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            System.out.println();
            System.out.println("Funcionario #" + (i+1) + ":" );
            System.out.print("id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }
        System.out.println("Digite o numero de identificação do funcionario que tera  aumento de salario? ");
        int idSaraly = sc.nextInt();

        Employee emp = list.stream().filter(x -> x. getId() == idSaraly). findFirst().orElse(null);
        if(emp == null){
            System.out.println("Id  inexistente");
        } else{
            System.out.print("Qual a porcentagem do aumento? ");
            double percent =  sc.nextDouble();
            emp. increaseSalary(percent);
        }

        /*Integer pos = position(list,idSaraly);
            if(pos == null){
            System.out.println("Id  inexistente");
        } else{
        System.out.print("Qual a porcentagem do aumento? ");
            double percent =  sc.nextDouble();
            list.get(pos). increaseSalary(percent);
        }*/
        System.out.println();
        System.out.println("Lista de funcionarios: ");

        for(Employee e : list) {
            System.out.println(e);
        }


    }
    public static Integer position(List<Employee> list, int id){
        for(int i = 0; i< list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
