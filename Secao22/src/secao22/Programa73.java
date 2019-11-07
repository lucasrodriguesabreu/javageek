package secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Expressões lambdas são funções anônimas, ou seja, funcções sem nome.

Já sabemos que podemos utilizar expressões lambdas com interfaces funcionais.

Devemos então criar uma função lambda compatível com a função da interface que estivermos
utilizando.

Por exemplo:

- A interface consumer, possui um método que recebe uma string e não retorna nada.
Por isso foi possível utilizar a expressão lambda que passa uma string como parâmetro e não retorna nada.

- A função sort, espera receber dois parâmetros do tipo string como entrada e retorna
um inteiro. Por isso foi possível passar a expressão lambda informando as duas strings, s1 e s2
e utilizando a classe Integer. Compare que retorna inteiro.
*/
public class Programa73 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        
        Comparator<String> comparador = new ComparadorPorTamanho();
        
        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("OutLast 2");
        
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        
        palavras.forEach(s -> System.out.println(s));
    }
}