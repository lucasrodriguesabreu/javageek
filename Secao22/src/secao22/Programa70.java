package secao22;

//Classe anônima

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classe anônima
public class Programa70 {
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
        
        palavras.forEach(new Consumer<String>(){
            public void accept(String s){
                System.out.println(s);
            }
        });
    }
}