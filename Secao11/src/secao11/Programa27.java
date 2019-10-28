package secao11;
//Private

/*
Privado à própria classe

Ou seja, só temos acesso ao atributo ou método privado
dentro da própria classe onde ele foi declarado.
*/

public class Programa27 {
    
    public static void main(String[] args) {
        Cliente cli1 = new Cliente ("Felicity Jones", "Rua Qualquer 123");
        
        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Endereço: " + cli1.getEndereco());
        
        System.out.println("");
        
        Cliente cli2 = new Cliente ("Angelina Jolie", "Rua Outra 345");
        
        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Endereço: " + cli2.getEndereco());
              
        //cli1.dizer_oi();
        
    }
    
}
