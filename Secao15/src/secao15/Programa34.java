package secao15;
//Atributos estáticos

/*
Atributos estáticos são atributos, onde os valores são compartilhados
entre as instâncias da classe.

Para utilizar um atributo estático, colocamos o nome da classe
junto ao atributo.

Exemplo:

NomeDaClasse.atributo;

*/
public class Programa34 {
    
    public static void main(String[] args) {
        Conta c1 = new Conta("Angelina Jolie");
        
        System.out.println(c1.getNumero());        
        System.out.println(c1.getCliente());
        
        Conta c2 = new Conta("Felicity Jones");
        
        System.out.println(c2.getNumero());        
        System.out.println(c2.getCliente());
        
        Conta c3 = new Conta("Silvio Santos");
        
        System.out.println(c3.getNumero());        
        System.out.println(c3.getCliente());
        
        //Tem o mesmo valor, pois atributos estáticos possuem os valores compartilhados
        System.out.println(Conta.contador);
    }
}
