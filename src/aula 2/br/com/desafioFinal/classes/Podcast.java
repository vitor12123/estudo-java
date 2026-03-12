package br.com.desafioFinal.classes;

public class Podcast extends Audio {
    private String nomePodcast;
    private String apresentador;
    private double tempoPodcast;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomePodcast() {
        return nomePodcast;
    }

    public void setNomePodcast(String nomePodcast) {
        this.nomePodcast = nomePodcast;
    }


    public double getTempoPodcast() {
        return tempoPodcast;
    }
    public void setTempoPodcast(double tempo) {
        this.tempoPodcast = tempo;
    }

}
