package secao21;

public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0;
    
    public void adicionaNoComeço(Object elemento){
        //[42] [56]-> null
        Celula nova = new Celula(elemento, this.primeira);
        this.primeira = nova;
        this.total = this.total + 1;
        //TODO
    }
    public void adiciona(Object elemento){
        //TODO
    }
    /*public adiciona(int posicao, Object elemento){
        //TODO
    }*/
    public Object pega(int posicao){
        //TODO
        return null;
    }
    public void remove(int posicao){
        //TODO
    }
    public int tamanho(){
        //TODO
        return 0;
    }
    public boolean contem(Object obj){
        //TODO
        return false;
    }
    public String toString() {
        if(total == 0){
            return null;
        }
    }
    Celula atual = primeira;    
    StringBuilder builder = new StringBuilder("[");
    
    for(int i = 0; i < total; i++){
    builder.append(atual.getElemento());
    builder.append(", ");
    
    atual = atual.getProximo();
    }
    builder.append("]");
    return builder.toString()
}