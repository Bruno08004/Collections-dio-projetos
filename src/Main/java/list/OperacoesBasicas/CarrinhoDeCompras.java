package Main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras{
    private List<Item> listItens = new ArrayList<>();

    public CarrinhoDeCompras() {
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco,quantidade);
        this.listItens.add(item);
    }

   public void removerItem(String nome){
        List<Item>  listItensRemover = new ArrayList<>();
        if(!this.listItens.isEmpty()){
            Iterator rem = this.listItens.iterator();

            while(rem.hasNext()) {
                Item in = (Item)rem.next();
                if(in.getNome().equalsIgnoreCase(nome)){
                  listItensRemover.add(in);
                }
            }
            this.listItens.removeAll(listItensRemover);
        }else{
            System.out.println("O carrinho está vazio!");
        }
   }

  public Double calcularValorTotal(){
        double valorTotal = 0.0;
        if(this.listItens.isEmpty()){
            throw new RuntimeException("O carrinho está vazio!");
        }else{
            double valorItem;
            for(Iterator var = this.listItens.iterator(); var.hasNext(); valorTotal += valorItem){
                Item i = (Item)var.next();
                valorItem = i.getPreco() * (double)i.getQuantidade();
            }
            return valorTotal;
        }
 }

  public void exibirItens(){
        if(!this.listItens.isEmpty()){
            System.out.println(this.listItens);
        }else{
            System.out.println("O carrinho está vazio!");
        }
  }
  public String toString(){
        return "CarrinhoDeCompras{itens=" + this.listItens+"}";
  }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Lápis",2.0,3);
        carrinhoDeCompras.adicionarItem("Lápis", 2.0, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35.0, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 4.0, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = "+carrinhoDeCompras.calcularValorTotal());
        System.out.println("--------------------------------------------------------------------------------------------------------");
        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = "+carrinhoDeCompras.calcularValorTotal());
    }
}

