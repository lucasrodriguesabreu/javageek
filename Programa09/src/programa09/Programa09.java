//do while
package programa09;
//Biblioteca de scanner
import java.util.Scanner;

public class Programa09 {

    public static void main(String[] args) {
        
        int idade;
        String nome;
        
        //Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);
        //i++ -> i = i + 1
        for (int i = 0; i < 5; i++){
        System.out.println("Informe seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe sua idade: ");
        //idade = teclado.nextInt(); //Bug
        idade = Integer.parseInt(teclado.nextLine());
        
            if(idade > 0){
            System.out.println(nome + " tem " + idade + " anos.");
            }
        }
        teclado.close();  
    }
}