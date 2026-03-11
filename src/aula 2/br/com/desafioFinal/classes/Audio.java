package br.com.desafioFinal.classes;

public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double estrelas;
    private boolean euCurti = false;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(double estrelas) {
        this.estrelas = estrelas;
    }

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void setEuCurti(boolean euCurti) {
        this.euCurti = euCurti;
    }

    public boolean getEuCurti() {
        return euCurti;
    }
}
