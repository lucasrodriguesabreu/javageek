
package secao11;

//Protected

//É o modificador de acesso default (Padrão)

/*
- O modificador de acesso Protected faz com que
o elemento seja visível somente dentro do mesmo
pacote onde o elemento foi declarado.
*/

public class Cliente {
    private String nome;
    private String endereco;
    
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        
        this.dizer_oi();
    }
    
    public void dizer_oi(){
        System.out.println(this.nome + " está dizendo oi...");
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
}