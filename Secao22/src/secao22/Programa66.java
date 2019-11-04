package secao22;
//Default Methods

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*

Novidade implementada a partir da versão 8 do Java

Atualmente estamos na versão 10 do Java.

*/
public class Programa66 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        
        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("OutLast 2");
        
        Collections.sort(palavras); //Ordena de forma alfabética
        
        for(int i = 0; i < palavras.size(); i++){
            System.out.println("A palavra " + palavras.get(i) + " tem tamanho " + palavras.get(i).length());
        }
        
        System.out.println(palavras);
    }
    
}
