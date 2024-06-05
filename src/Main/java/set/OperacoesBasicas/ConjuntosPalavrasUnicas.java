package Main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosPalavrasUnicas {
    private Set<String> setPalavrasUnicas;

    public ConjuntosPalavrasUnicas() {
        this.setPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        setPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!setPalavrasUnicas.isEmpty()) {
            if (setPalavrasUnicas.contains(palavra)) {
                setPalavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return setPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!setPalavrasUnicas.isEmpty()) {
            System.out.println(setPalavrasUnicas);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntosPalavrasUnicas conjuntoLinguagens = new ConjuntosPalavrasUnicas();

        //Adicionando palavras ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        //Exibindo as palavras inseridas
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        //Verificando palavras inseridas no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}

