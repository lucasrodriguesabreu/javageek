//If, else, elseif
package programa04;


public class Programa04 {

    public static void main(String[] args) {
        //Declarando e inicializando a variável
        int numero = 80;
        //Se
        if(numero > 5){
            System.out.println("Sim, o número " + numero + " é maior que 5.");
        }else if(numero == 5){
            System.out.println("O número " + numero + " é igual a 5.");
        }else if (numero%2 ==0){
            System.out.println("O número " + numero + " é par.");            
        }else{            
            System.out.println("Não, o número " + numero + " não é maior que 5.");
        }
    }
    
}
