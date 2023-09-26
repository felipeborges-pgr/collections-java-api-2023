package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itensList = new ArrayList<>();

    public CarrinhoDeCompras() {
    }

    public CarrinhoDeCompras(List<Item> itens) {
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensListParaRemover = new ArrayList<>();
        for(Item i: itensList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensListParaRemover.add(i);
            }
        }
        itensList.removeAll(itensListParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!itensList.isEmpty()) {
            for(Item item: itensList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if(!itensList.isEmpty()) {
            System.out.println(this.itensList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itensList +
                '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
