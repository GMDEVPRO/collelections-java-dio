package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    private List<Pessoas> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordonarPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoas> ordenarPorAltura() {
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoas("nome 1", 20, 1.75);
        ordenacaoPessoas.adicionarPessoas("nome 2", 10, 1.56);
        ordenacaoPessoas.adicionarPessoas("nome 3", 25, 1.86);
        ordenacaoPessoas.adicionarPessoas("nome 4", 17, 1.75);

        System.out.println(ordenacaoPessoas.ordonarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());;
    }
}