package secao20;

public class FazDeposito implements Runnable{
    private Conta conta;
    
    public FazDeposito(Conta conta){
        this.conta = conta;
    }

    public void run() {
        this.conta.depositar(100.0f);
    }
    
    
}
