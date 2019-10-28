package secao17;

/*
Getters e Setters

Getter
    - É um método público, que serve para consultar dados;
    - A nomenclatura desses métodos é get_nome_do_atributo()
Setters
    - 
*/

public class Conta {
    int numero;
    private float saldo;
    private float limite;
    Cliente cliente;
    
    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo + limite;
        this.limite = limite;
        this.cliente = cliente;
    }
    
    public void sacar(float valor) {
        if(valor <= this.saldo){
        this.saldo = this.saldo - valor;
        System.out.println("Saldo realizado com sucesso!");
        }else if(valor <= (this.saldo + this.limite)){
            //System.out.println("Saldo insuficiente!");
            //calculando o valor excedente do saque
            //saldo de 100 - 200 = -100
            float val_ret = this.saldo - valor;
            //val_ret = this.limite - val_ret
            val_ret = this.limite - val_ret;
            this.limite = val_ret;
            System.out.println("Saldo realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void depositar (float valor){
        this.saldo = this.saldo + valor;
    }
    
    //Método getter do atributo Saldo
    public float getSaldo(){
        return this.saldo + this.limite;
    }    
}