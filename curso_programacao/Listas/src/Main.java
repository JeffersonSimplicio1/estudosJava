import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*Lista é uma estrutura de dados:
        Homogenea(Dados do mesmo tipo)
         Ordenada (elementos acessados por meio de posições)
         Iniciada vazia
         Cada elemento ocupa um nó

          Demo:

          Tamanho da lista: size()
          Inserir elementos na lista: add(obj), add(int,obj)
          Remover elemento: remove(obj), remove(int), removeIf(Predicate)
          Encontrar posição de elemento: indexOf(obj), lasIndexOf(obj)
          Filtrar lista com base em predicado:
          List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
          Encontrar primeira ocorrencia com base em predicado:
          Integer result = list.stream().filter(x -> x > 4 ).findFirst().orElese(null);
   */

         List<String> list = new ArrayList<String>();

         list.add("Jefferson");
         list.add("João");
         list.add("Regina");
         list.add("Benjamin");
         list.add("André");
         list.add("Jeremias");
         list.add("Clara");
         list.add(4,"Rosa");
         list.add("Jesus");
         list.add("José");
         list.add("Emanoel");
         list.add("Joaquim");


         // Saber o tamanho da lista
        System.out.println(list.size());

        // removendo itens da lista
        //list.remove("Jefferson");
        //list.remove(2);
        // utilizando for each para mostrar no console os elementos da lista

         for(String x: list){
             System.out.println(x);
         }

        System.out.println("----------------------------------");
         //Remove todos que iniciam com a letra J
               // list.removeIf(x ->x.charAt( 0 ) == 'J');
        System.out.println(list.size());

        for(String x: list){
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        System.out.println("Index of Rosa: " + list.indexOf("Rosa"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}