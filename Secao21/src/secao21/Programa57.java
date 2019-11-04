package secao21;
//Listas ligadas/LinkedList
/*
Em um vetor, os elemtnso estão um do lado do outro, enquanto em uma lista
ligada, eles estão em lugares diferentes, porém um aposta para o outro
indicando o próximo elemento.

[0][3][1][4][2]
*/
public class Programa57 {
    
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        System.out.println(lista);
        lista.adicionaNoComeco("Maria");
        System.out.println(lista);
        lista.adicionaNoComeco("Angelina");
        System.out.println(lista);
        lista.adicionaNoComeco("Felicity");
        System.out.println(lista);
        
        String nome = "Pedro";
        lista.adicionaNoComeco(nome);
        System.out.println(lista);
        
        int numero = 42;
        lista.adicionaNoComeco(numero);
        System.out.println(lista);
        
        Cliente cli1 = new Cliente(34, "Juliana Paes", "Rua 3");
        lista.adicionaNoComeco(cli1);
        System.out.println(lista);
    }
}

/*

Parei com 35:52

*/