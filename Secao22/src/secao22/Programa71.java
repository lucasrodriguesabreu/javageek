package secao22;
//Lambdas

/*
Expressões lambdas, são funções anônimas.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa71 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        
        Comparator<String> comparador = new ComparadorPorTamanho();
        
        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("OutLast 2");
        
        palavras.sort(comparador);
        //  Expressão lambda - forma 1
        /*
        palavras.forEach((String s) -> {
            System.out.println(s);
        });
        */
        // Expressão lambda - forma 2
        palavras.forEach(s -> System.out.println(s));
    }
}