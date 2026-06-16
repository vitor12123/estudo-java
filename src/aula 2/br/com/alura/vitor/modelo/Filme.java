package br.com.alura.vitor.modelo;
import br.com.alura.vitor.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anolancamento) {
        super(nome, anolancamento);
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificave() {
        return (int) mediaAvaliacao();
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getNomeFilme() + " (" + this.getAnoLancamento() + ") ";
    }
}