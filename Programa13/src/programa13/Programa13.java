//TIpos de dados alfanuméricos
//Caracteres e strings
package programa13;

public class Programa13 {

    public static void main(String[] args) {
        //Tipos primitivos
        char letra1 = 'a';
        char letra2 = 97; //97 em decimal == 'a'
        
        letra2 = (char) (letra2 + 1); //cast
        
        System.out.println("Letra1 " + letra1 + ".");
        System.out.println("Letra2 " + letra2 + ".");
        
        //Tipos não primitivos
        
        Character letra3 = 'A';
        System.out.println("Letra3 " + letra3);
    }
}
