package secao14;

public class Ventilador implements IEletronico{
    
    private boolean ligado = false;

    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Liguei o aparelho.");
        }
    }

    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            System.out.println("Desliguei o aparelho.");
        }
    }
    
}
