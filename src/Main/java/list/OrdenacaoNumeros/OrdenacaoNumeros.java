package Main.java.list.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {
    private List<Integer> ordenacaoNumeros;

    public OrdenacaoNumeros() {
        this.ordenacaoNumeros = new ArrayList<>();
    }


   public void adicionarNumero(int numero){
      ordenacaoNumeros.add(numero);
   }

   public List<Integer> ordenarAscendente(){
        if(!ordenacaoNumeros.isEmpty()){
            Collections.sort(ordenacaoNumeros);
            return ordenacaoNumeros;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
   }

    public List<Integer> ordenarDescendente(){
        if(!ordenacaoNumeros.isEmpty()){
            Collections.reverse(ordenacaoNumeros);
            return ordenacaoNumeros;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!ordenacaoNumeros.isEmpty()){
            System.out.println("Os números da lista são = " + ordenacaoNumeros);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        //Adicionando números
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(99);

        //Exibindo os números da lista
        ordenacaoNumeros.exibirNumeros();

        //Ordenando os números de forma Crescente
        System.out.println("Lista de número de forma Crescente = " + ordenacaoNumeros.ordenarAscendente());


        //Ordenando os números de forma Decrescente
        System.out.println("Lista de número de forma Decrescente = " + ordenacaoNumeros.ordenarDescendente());



    }
}
