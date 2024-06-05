package Main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefasSet;

    public ListaTarefa() {
        tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
                tarefasSet.remove(tarefaParaRemover);
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarTarefas() {
        if (!tarefasSet.isEmpty()) {
            return tarefasSet.size();
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.isConclusao()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (!t.isConclusao()) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConclusao(true);
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa marcarTarefaPendente = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    marcarTarefaPendente = t;
                }
            }
                 if(marcarTarefaPendente != null){
                     if(marcarTarefaPendente.isConclusao()){
                         marcarTarefaPendente.setConclusao(false);
                     }
                }

        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void limparListaTarefas() {
        if (!tarefasSet.isEmpty()) {
            tarefasSet.clear();
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefas = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Ler livros");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
//
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
