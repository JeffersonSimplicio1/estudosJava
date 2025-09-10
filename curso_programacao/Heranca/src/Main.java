public class Main {
    public static void main(String[] args) {
//                Conta acc = new Conta(1001, "Alex", 0.0);
//                ContaPj bacc = new ContaPj(1002, "Maria", 0.0, 500.0);
//
//                //UPCASTING
//
//                Conta acc1 = bacc;
//                Conta acc2 = new ContaPj(1003, "Bob", 0.0, 200.00);
//                Conta acc3 = new ContaPoupanca(1004,"Ana", 0.0, 0.01);
//                // A criação de contas PJ e Poupança não gera erro pq apesar de ser contas diferentes elas continuam sendo contas!
//
//                //Downcasting
//
//                ContaPj acc4 =(ContaPj) acc2;
//                acc4.emprestimo(100.0);
//
//                if(acc3 instanceof ContaPj){
//                    ContaPj acc5 = (ContaPj) acc3;
//                    acc5.emprestimo(200.0);
//                    System.out.println("Emprestimo!");
//                }
//
//                if(acc3 instanceof ContaPoupanca){
//                    ContaPoupanca acc5 = (ContaPoupanca) acc3;
//                    acc5.saldoAtualizado();
//                    System.out.println("Atualizado!");
//
//                }
//

//        Conta acc1 = new Conta(1001,"Alex", 1000.00);
//        acc1.saque(200.0);
//        System.out.println(acc1.getSaldo());
//
//        Conta acc2 = new ContaPoupanca(1002, "Regina", 1000.00,0.01);
//        acc2.saque(200.00);
//        System.out.println(acc2.getSaldo());

        Conta x = new Conta(1020, "Alex", 1000.00);
        Conta y = new ContaPoupanca(1023,"Maria", 1000.00,0.01);

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());



    }
}
