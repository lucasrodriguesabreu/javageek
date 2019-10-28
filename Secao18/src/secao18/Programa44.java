package secao18;
//Escrevendo em arquivos parte 2
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa44 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner teclado = new Scanner(System.in);
        
        try{
                               
            PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt", true));
            
            for (int i = 0; i <5; i++){
                System.out.println("Escreva algo: ");
                String msg = teclado.nextLine();
                escrever.println(msg);               
            }
            escrever.close();
        }catch (FileNotFoundException e){
            System.out.println("Não foi possível criar o arquivo.");
        }
        teclado.close();
    }
}