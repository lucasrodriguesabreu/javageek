//do while
package programa08;
//Biblioteca de scanner
import java.util.Scanner;

public class Programa08 {

    public static void main(String[] args) {
        
        int idade = 1;
        String nome;
        
        //Para receber dados do usuário via teclado
        Scanner teclado = new Scanner(System.in);
        //Primeiro executa o bloco, depois faz a checagem
        do{        
        System.out.println("Informe seu nome: ");
        //Para receber o nome digitado
        nome = teclado.nextLine();
        //Para receber a idade digitada
        System.out.println("Informe sua idade: ");
        //idade = teclado.nextInt(); //Bug
        idade = Integer.parseInt(teclado.nextLine());
        
        
        System.out.println(nome + " tem " + idade + " anos.");
        //While sempre checa o valor (condição) antes de executar o bloco
        }while(idade > 0);
        teclado.close();  
    }
}