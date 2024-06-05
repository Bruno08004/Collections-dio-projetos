package Main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean conclusao;

    public Tarefa(String descricao) {
        this.conclusao = false;
        this.descricao = descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "conclusao=" + conclusao +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
