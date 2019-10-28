//Criando nossas próprias funções

/*
Faça um programa que receba diversos nomes
de frutas do usuário e no final imprima essas
frutas em ordem contrária.
O programa deve solicitar ao usuário quantas frutas ele quer informar.
*/
package programa20;

import java.util.Scanner;
import static programa20.Programa20.frutas;

public class Programa20 {
    
    static String frutas[];
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int qtd;
        //Declaração do vetor
        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(teclado.nextLine());
            
           
        teclado.close();
    }    
    /*
    Uma função deve ter o seguinte:
    a) Tipo de retorno (Tipo de dado que a função vai retornar);
    b) Nome;
    c) Parâmetros/Argumentos de entrada(Opcional)
    d) Retorno (Opcional - depende do tipo de retorno)
    */
    //void = vazio
    static void cadastrar_dados(int quantidade){

        //Definindo o tamanho do vetor
        frutas = new String[quantidade];
        //3
        //0..2 (0, 1, 2)
        for(int i = 0; i < quantidade; i++){ //i++ -> i = i + 1
            System.out.println("Informe a " + (i + 1) + " fruta: ");
            frutas[i] = teclado.nextLine();
        }
        
    }
    
    static void mostrar_dados(int quantidade){
        for(int i = (quantidade - 1); i >=0; i--){//i-- -> i = i - 1
            System.out.println(frutas[i]);   
        }        
    }
}