package List.Operations;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Item> carrinhoList;

    public CarrinhoCompra() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome,double preco,int quantidade){
        Item item = new Item(nome,preco,quantidade);
        carrinhoList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item item : carrinhoList){
            if(item.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(item);
            }
        }
        carrinhoList.removeAll(itemParaRemover);
    }

    public double calculaValorTotal(){
        double total = 0.0;
        for(Item item : carrinhoList){
            total += item.getPreco() * item.getQtd();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoList);
    }
}
