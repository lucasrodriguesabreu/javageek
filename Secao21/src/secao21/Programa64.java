package secao21;
//Conjuntos
import java.util.LinkedList;
/*
Uma das características dos conjuntos é a não aceitação de
elementos repetidos.

Gera performance.

A = ["Angelina, "Angela, "Adriano" ...];
B = 
C = 
D =
E = 
F =
.
.
.
.
Z = 
 0  1  2  3  4  5  6  7
[a][n][g][e][l][i][n][a]
*/

public class Programa64 {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        
        System.out.println(conjunto);
        
        conjunto.adiciona("Angelina");
        
        System.out.println(conjunto);
        
        conjunto.adiciona("Ana");
        conjunto.adiciona("Felicity");
        conjunto.adiciona("Gabriel");
        conjunto.adiciona("Júlia");
        conjunto.adiciona("Fabiana");
        conjunto.adiciona("Felicity"); //Não entra repetido
        
        conjunto.remove("Júlia");
        
        System.out.println(conjunto);
    }
}
