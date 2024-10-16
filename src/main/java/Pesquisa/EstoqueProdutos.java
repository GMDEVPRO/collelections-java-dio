package main.java.Pesquisa;

import main.java.Ordenacao.Produto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atribute
    private Map<Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calculvalorTotalEstoque() {
        double valorTotalEstoque = 0d;
      if(estoqueProdutosMap.isEmpty()) {
        for(Produtos p : estoqueProdutosMap.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
      }
      return valorTotalEstoque;

    }

    public Produtos obterProdutosMaisCaro() {
       Produtos produtosMaisCaro = null;
       double maiorPreco = Double.MIN_VALUE;
       if (!estoqueProdutosMap.isEmpty()) {
           for (Produtos p : estoqueProdutosMap.values()) {
               if(p.getPreco() > maiorPreco) {
                   produtosMaisCaro = p;
               }

           }
       }
       return produtosMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "produto B", 5, 10.0);
        estoque.adicionarProduto(3L, "produto C", 2, 15.0);

        estoque.exibirProdutos();

        System.out.println("valor total do estoque: R$" + estoque.calculvalorTotalEstoque());
        System.out.println("produto mais caro: " + estoque.obterProdutosMaisCaro());
    }
}
