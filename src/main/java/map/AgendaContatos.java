package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>() ;
    }

    public void adicionarContato(String nome, Integer telefone) {
       agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(agendaContatoMap.isEmpty()) {
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("guy", 123456);
        agendaContatos.adicionarContato("guy martial", 1111111);
        agendaContatos.adicionarContato("guy dio", 3245363);
        agendaContatos.adicionarContato("guy10", 7834563);
        agendaContatos.adicionarContato("christian hugo", 111111);
        agendaContatos.adicionarContato("guy", 444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("chritian hugo");
        agendaContatos.exibirContato();

        System.out.println("O numero e: " + agendaContatos.pesquisarPorNome("guy dio"));

    }
}
