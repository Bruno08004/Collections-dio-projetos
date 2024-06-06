package Main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> gerenciadorAlunos;

    public GerenciadorAlunos() {
        this.gerenciadorAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        gerenciadorAlunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!gerenciadorAlunos.isEmpty()) {
            for (Aluno a : gerenciadorAlunos) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            gerenciadorAlunos.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matrícula inexistente!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(gerenciadorAlunos);
        if(!gerenciadorAlunos.isEmpty()){
            System.out.println(gerenciadorAlunos);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!gerenciadorAlunos.isEmpty()) {
            alunoPorNota.addAll(gerenciadorAlunos);
            System.out.println(alunoPorNota);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public void exibirAlunos() {
        System.out.println(gerenciadorAlunos);
    }

    //Testando...

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.gerenciadorAlunos);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.gerenciadorAlunos);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
