package secao21;

public class ListaLigada {
    
    private Celula primeira = null;
    
    public void adicionaNoComeço(Object elemento){
        Celula nova = new Celula(elemento, this.primeira);
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
}
