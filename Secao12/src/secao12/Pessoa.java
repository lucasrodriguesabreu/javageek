package secao12;

/*
- Classe base
- Essa classe serve de base para todas as outras
*/
//Agora como classe abstrata
public abstract class Pessoa {
    private String nome;
    private int ano_nascimento;
    private String email;
    
    public Pessoa(String nome, int ano_nascimento, String email){
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail (String email){
        this.email = email;
    }
    
    public int getAnoNascimento(){
        return this.ano_nascimento;
    }
    public void setAnoNascimento(int ano_nascimento){
        this.ano_nascimento = ano_nascimento;
    }
    //Exemplo de overriding / Sobreescrita de método
    public String toString(){
        return "Nome: " + this.nome + "\nAno de Nascimento é " + this.ano_nascimento;
    
    }
    //Overloading / Sobrecarga de método
    public void mensagem(){
        System.out.println("Esta é a minha mensagem...");
    }
    public int mensagem(String msg){
        System.out.println(msg);
        return 0;
    }
}