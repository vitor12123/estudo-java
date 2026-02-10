package br.com.alura.vitor.modelo;

public class Filme {
    private String nomeFilme ;
    private int anoLancamento ;
    private boolean incluidoNoPlano;
    private double somAvaliacao;
    private int quantidadeAvaliacao ;

    public int getQuantidadeAvaliacao() {
        return quantidadeAvaliacao;
    }
    public double getSomAvaliacao() {
        return somAvaliacao;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public void setAnoLancamento(int anoL){
        anoLancamento = anoL;
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
}
