package secao21;
//Pilhas - Implementação do Java

import java.util.Stack;


public class Programa61 {
    
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();
        
        nomes.push("Angelina"); //insere
        nomes.push("Felicity"); //insere
        System.out.println(nomes);
        
        String ret = nomes.peek(); //retorna o elemento do topo
        System.out.println(ret);
        System.out.println(nomes);
        
        
        String r1 = nomes.pop(); //remove
        System.out.println(r1);
        System.out.println(nomes);
    }
}
