package secao19;
//Listas
import java.util.ArrayList;

public class Programa46 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(42);
        numeros.add(24);
        numeros.add(12);
        numeros.add(2);
        numeros.add(91);
        
        System.out.println(numeros.get(0));
        
        for(int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
    
}
