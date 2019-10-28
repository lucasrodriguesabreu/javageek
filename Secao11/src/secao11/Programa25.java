//Encapsulamento

package secao11;

public class Programa25 {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João da Silva", "Rua da paz, 45");
        Cliente maria = new Cliente("Maria da Silva", "Rua da paz, 50");
        
        Conta conta_joao = new Conta(1, 600.0f, 200.0f, joao);
        Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);
        
        System.out.println("Saldo do João (Antes do Saque): " + conta_joao.getSaldo());
        System.out.println("Saldo da Maria " + conta_maria.getSaldo());
        
        conta_joao.sacar(50);
        conta_maria.sacar(50);
        System.out.println("");
        
        System.out.println("Saldo do João (Depois do Saque): " + conta_joao.getSaldo());
        
    }
    
}