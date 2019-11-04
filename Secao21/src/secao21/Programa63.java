package secao21;
//Fila -> Implementação do Java

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        
        fila.add("Angelina"); //inserir
        fila.add("Maria"); //inserir
        fila.add("Felicity"); //inserir
        
        System.out.println(fila);
        
        String ret = fila.poll(); //Remover
        System.out.println(ret);
        
        System.out.println(fila);
    }
}
