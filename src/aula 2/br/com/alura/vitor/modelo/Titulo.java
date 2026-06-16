package br.com.alura.vitor.modelo;

public class Titulo implements Comparable<Titulo> {
    private String nomeFilme ;
    private int anoLancamento ;
    private boolean incluidoNoPlano;
    private double somAvaliacao;
    private int quantidadeAvaliacao ;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.setNome(nome);
        this.setAnoLancamento(anoLancamento);
    }

    public Titulo() {

    }

    public int getQuantidadeAvaliacao() {
        return quantidadeAvaliacao;
    }

    public double getSomAvaliacao() {
        return somAvaliacao;
    }

    public void setNome(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setAnoLancamento(int anoL){
        anoLancamento = anoL;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("");
        System.out.println("nome do filme:" + nomeFilme);
        System.out.println("ano de lançamento do filme:" + anoLancamento);
    }

    public void avalie(double nota){
        quantidadeAvaliacao++;
        somAvaliacao += nota;
    }

    public double mediaAvaliacao(){
        return somAvaliacao/quantidadeAvaliacao;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroT) {
        return this.getNomeFilme().compareTo(outroT.getNomeFilme());
    }
}