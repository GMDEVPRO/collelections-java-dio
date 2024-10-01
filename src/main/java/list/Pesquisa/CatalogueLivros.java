package main.java.list.Pesquisa;


import java.util.ArrayList;
import java.util.List;

public class CatalogueLivros {
    //atribute
    private List<Livro> livroList;

    public CatalogueLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivre(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }

    return livrosPorIntervaloAnos;
    }

    Livro pesquisaPorTitulo(String titulo) {
        Livro livroPortitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                  livroPortitulo = l;
                  break;
                }
            }
        }
        return livroPortitulo;
    }

    public static void main(String[] args) {
        CatalogueLivros catalogoLivros = new CatalogueLivros();
        catalogoLivros.adicionarLivre("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivre("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivre("Livro 2", "Autor 1", 2022);
        catalogoLivros.adicionarLivre("Livro 3", "Autor 1", 2023);
        catalogoLivros.adicionarLivre("Livro 4", "Autor 1", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
    }

}