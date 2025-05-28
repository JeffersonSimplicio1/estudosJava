//fazer um programa para ler um numero inteiro N e os dados(nome e preço) de N produtos.
// Armazene os N produtos em um vetores.em seguida, mostrar o preço medio dos produtos

 public class Vetorespt2{
    public class void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        string [] nome = new string[n];
        double [] valor = new double[n];

        for(int i = 0;i<n;i++){
            nome = sc.next();
            valor = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i<n;i++){
            soma += valor[i];
        }
        double media = soma/n;
        System.out.printf("A Media dos valores dos produtos é: %.2f%n", media);



        sc.close();

     }
 }