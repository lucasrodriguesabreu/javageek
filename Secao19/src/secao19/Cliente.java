
package secao19;

//Protected

//É o modificador de acesso default (Padrão)

/*
- O modificador de acesso Protected faz com que
o elemento seja visível somente dentro do mesmo
pacote onde o elemento foi declarado.
*/

public class Cliente implements Comparable{
    private int idade;
    private String nome;
    private String endereco;
    
    public Cliente(int idade, String nome, String endereco) {
        this.idade = idade;
        this.nome = nome;
        this.endereco = endereco;
        
        this.dizer_oi();
    }
    
    public void dizer_oi(){
        System.out.println(this.nome);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Object outro) {
        Cliente aux = (Cliente)outro;
        if(this.idade < aux.idade){
            return -1;
        }else if(this.idade > aux.idade){
            return 1;
        }else{
            return 0;
        }
    }
    
    
    
}