//Atributos

//Métodos

//Construtores

/*

- Sempre, um construtor vazio tem a seguinte forma:

public NomeDaClasse(){}
*/
package programa24;

public class Pessoa {
    
    String nome, email;
    int ano_nascimento;
    
    //construtor vazio
    
    public Pessoa(){}
    
    //construtor com parâmetros
    public Pessoa (String nome, String email, int ano_nascimento){
        
        this.nome = nome;
        this.email = email;
        this.ano_nascimento = ano_nascimento;        
    }
    
}
