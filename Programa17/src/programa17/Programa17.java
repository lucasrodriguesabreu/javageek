// Vetores Parte 2
package programa17;

public class Programa17 {

    public static void main(String[] args) {
        //Declaração e definição de tamanho do vetor
        int numeros[] = new int[10];
        
        System.out.println("Tamanho do vetor: " + numeros.length);
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 3;
        }
        
        //System.out.println(numeros[0]); //primeiro elemento
        //System.out.println(numeros[9]); //ultimo elemento
        //0 .. 9
        //numeros[10] = 42;
        //System.out.println(numero[10]);
        /*
        Os vetores/arrays possuem tamanho fixo e não
        podem ser aumentados/diminuidos 
        */
        
        numeros[0] = 7;
        System.out.println(numeros[0]); //primeiro elemento
        //numeros[0] = 23.4;
        /*
        Os vetores/arrays possuem tipos de dados fixos
        e não aceitam tipos variados, como visto no exemplo da linha 28.
        */
        
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (int)Math.round(Math.random() * 10);
        }
        System.out.println(numeros[0]); //primeiro elemento
        System.out.println(numeros[9]); //ultimo elemento
        //0 .. 1 double
        System.out.println(Math.random());
        
        System.out.println(Math.random() * 10);
        
        System.out.println(Math.round(Math.random() * 10));
        
        for (int i : numeros) {
            System.out.println(i);
        }
                
    }
    
}
