package secao20;
//Simulação da geração de relatório + barra de tarefa
//Com a utilização de threads
import sun.awt.windows.ThemeReader;

public class Programa52 {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread t1 = new Thread(barra);
        t1.start();
        
        GeraRelatorio relatorio = new GeraRelatorio();
        Thread t2 = new Thread(relatorio);
        t2.start();
    }
}