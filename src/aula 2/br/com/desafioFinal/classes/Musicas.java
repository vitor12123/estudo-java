package br.com.desafioFinal.classes;

public class Musicas extends Audio {
    private String cantor;
    private double tempoMusica;
    private String album;
    private String genero;
    private String classificacaoM;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getTempoMusica() {
        return tempoMusica;
    }

    public void setTempoMusica(double tempo) {
        this.tempoMusica = tempo;
    }

    public void setClassificacaoM() {
        if (getEstrelas() >= 4) {
            this.classificacaoM = "musica em alta!!";
        } else if (getEstrelas() > 2.5 & getEstrelas() < 4) {
            this.classificacaoM = "musica boa";
        }
        else {
            this.classificacaoM = "musica ruim";
        }
    }

    public String getClassificacaoM() {
        return classificacaoM;
    }
}
