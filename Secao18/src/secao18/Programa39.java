package secao18;
//Object: A mãe de todas as classes

/*
A classe object faz parte do pacote java.lang
*/
public class Programa39 {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente ("Angelina Jolie", "Rua 1, 234");
        Cliente cli2 = new Cliente ("Felicity Jones", "Rua 2, 345");
        
        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(1, 200, 300, cli2);
        
        Caixa prateleira = new Caixa();
        
        System.out.println(c1);
        System.out.println(c2);
        
        if(c1.equals(c2)) {
            System.out.println("São a mesma conta.");
        }else{
            System.out.println("São contas diferentes.");
        }
        prateleira.adicionar(c1); //0 -> tem getSaldo();
        prateleira.adicionar(c2); //1 -> tem getSaldo();
        
        //Conta conta = prateleira.pegar(0);
        
        System.out.println(((Conta)prateleira.pegar(0)).getSaldo()); //Cast
        
        prateleira.adicionar(cli1); //2 -> não tem getSaldo();
        
        System.out.println(((Cliente)prateleira.pegar(2)).getNome()); //Cast
        
        if((Object)c1 instanceof Conta){
            System.out.println("O objeto é do tipo Conta.");
        }else{
            System.out.println("O objeto não é do tipo Conta.");
        }
    }
}
