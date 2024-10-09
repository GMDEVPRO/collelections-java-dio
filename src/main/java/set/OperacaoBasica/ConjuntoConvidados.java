package main.java.set.OperacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atribute
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadosPorCodigoConvite(int codigoConvite) {
        Convidados convidadosParaRemover = null;
        for(Convidados c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadosParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadosParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convide 1" , 1234);
        conjuntoConvidados.adicionarConvidado("Convide 2" , 1235);
        conjuntoConvidados.adicionarConvidado("Convide 3" , 1235);
        conjuntoConvidados.adicionarConvidado("Convide 4" , 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadosPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
