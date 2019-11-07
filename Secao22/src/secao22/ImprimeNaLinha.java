package secao22;

import java.util.function.Consumer;

public class ImprimeNaLinha implements Consumer<String>{
    
    public void accept(String s){
        System.out.println(s);
    }
}
