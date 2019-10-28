package secao18;
//Trabalhando com Strings
/*
Em Java, String são imutáveis, ou seja, não mudam.
*/
public class Programa41 {
    
    public static void main(String[] args) {
        String curso = "Programação em Java: Essencial";
        
        //String nova = curso.replace("Java", "Python"); //Altera na string, se encontrar, a primeira palavra pela segunda.
        //curso = curso.replace("Java", "Python"); //Altera na string, se encontrar, a primeira palavra pela segunda.
        curso = curso.toLowerCase(); //Converte as letras maiúsculas para minúsculas
        
        System.out.println(curso);
        //System.out.println(nova);
        curso = curso.toUpperCase(); //Converte as letras de minúsculas para maiusculas
        
        System.out.println(curso);
        
        System.out.println(curso.charAt(12));
        
        for(int i = 0; i < curso.length(); i++){
            System.out.println(curso.charAt(i));
        }
        
        for(int i = curso.length() - 1; i>=0; i--){
            System.out.println(curso.charAt(i));
        }
    }
}