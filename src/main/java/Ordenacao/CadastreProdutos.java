package main.java.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastreProdutos {
    //atributos
    private Set<Produto> produtoSet;

    public CadastreProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
      produtoSet.add(new Produto(cod,nome, preco, quantidade ));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> ProdutosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        ProdutosPorPreco.addAll(produtoSet);
        return ProdutosPorPreco;

    }

    public static void main(String[] args) {
        CadastreProdutos cadastreProdutos = new CadastreProdutos();

        cadastreProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastreProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastreProdutos.adicionarProduto(1L, "Produto 3", 10d, 52);
        cadastreProdutos.adicionarProduto(9L, "Produto 9", 2d, 5);

        System.out.println(cadastreProdutos.produtoSet);

        System.out.println(cadastreProdutos.exibirProdutosPorPreco());

        System.out.println(cadastreProdutos.exibirProdutosPorNome());


    }
}
