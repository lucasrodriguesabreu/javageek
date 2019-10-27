package secao20;

/*
O sincronismo ocorre, pois durante a execução do método a thread
executa um 'lock' (bloqueio) da função para que outra thread
só possa executá-la pós a finalização da thread
*/

public class Programa54 {
    public static void main(String[] args) throws InterruptedException{
        Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
        Conta c1 = new Conta(1, 200, 300, cli1); //saldo 500

        FazDeposito acao = new FazDeposito(c1);
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start(); //Deve ter 600
        t2.start(); //Deve ter 700
        
        t1.join(); //Avisando que a thread t1 deve se juntar a um sincronizador
        t2.join(); //Avisando que a thread t2 deve se juntar a um sincronizador

        System.out.println(c1);
    }
}
