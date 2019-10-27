package secao20;
/*
Para executar métodos em paralelo, nossa classe
deve implementar a interface Runnable, e o método
que precisar ser executado em paralelo deve
ser executado dentro de um método run
*/
public class GeraRelatorio implements Runnable{
    
    public void executa(){
        //For de 0 até 10 mil
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + "Gerando relatório...aguarde");
        }
    }
    
    public void run() {
        //For 0 até 10 mil
        for (int i = 0; i < 10000; i++) {
            System.out.println(i + "Gerando relatório...aguarde");
        }
    }
}