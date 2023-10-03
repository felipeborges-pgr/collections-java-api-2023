package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 12", 16d, 5);
        cadastroProdutos.adicionarProduto(5L, "Produto 15", 20d, 4);
        cadastroProdutos.adicionarProduto(1L, "Produto 18", 18d, 3);
        cadastroProdutos.adicionarProduto(3L, "Produto 21", 23d, 2);

        System.out.println(cadastroProdutos.produtoSet);

//        System.out.println(cadastroProdutos.exibirProdutosPorNome());
//
//        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
//
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());

    }

}


