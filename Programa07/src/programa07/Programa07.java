//while e do while

/*
*Receba dados do usuário enquanto a idade for maior que zero.
*/
package programa07;
//Biblioteca de scanner
import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {
        
        int idade = 1;
        String nome;
        
        //Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);
        //While sempre checa o valor (condição) antes de executar o bloco
        while(idade > 0) {        
        System.out.println("Informe seu nome: ");
        //Para receber o nome digitado
        nome = teclado.nextLine();
        //Para receber a idade digitada
        System.out.println("Informe sua idade: ");
        //idade = teclado.nextInt(); //Bug
        idade = Integer.parseInt(teclado.nextLine());
        
        System.out.println(nome + " tem " + idade + " anos.");
        }    
        teclado.close();  
    }
}