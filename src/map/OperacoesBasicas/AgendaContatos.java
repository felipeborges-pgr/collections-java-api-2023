package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Felipe", 345423);
        agendaContatos.adicionarContato("Felipe", 57567);
        agendaContatos.adicionarContato("Felipe Gomes", 44444);
        agendaContatos.adicionarContato("Felipe Test", 7886868);
        agendaContatos.adicionarContato("Ana Souza", 1111111);
        agendaContatos.adicionarContato("Felipe", 54543);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Ana Souza");
        agendaContatos.exibirContatos();

        System.out.println("O número é : " + agendaContatos.pesquisarPorNome("Felipe Test"));

    }

}
