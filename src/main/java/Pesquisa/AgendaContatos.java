package main.java.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosporNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosporNome.add(c);
            }
        }
        return contatosporNome;
    }

    public Contato atualizarNumeroContato(String nome, int novonumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novonumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("christian", 123456);
        agendaContatos.adicionarContato("christian", 0);
        agendaContatos.adicionarContato("christian santos", 11111);
        agendaContatos.adicionarContato("christian hugo", 6578453);
        agendaContatos.adicionarContato("maria luiz", 11111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisaPorNome("maria luiz"));

        System.out.println("Contatos atualizado:" + agendaContatos.atualizarNumeroContato("maria luiz", 55980973 ));

        agendaContatos.exibirContato();
    }
}
