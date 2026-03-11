package br.com.desafioFinal.classes;

public class MinhasPreferidas extends Musicas {

    private String[] musicasCurtidas = new String[100];
    private int indice = 0;

    public String getMusicasCurtidas(int i) {
        return musicasCurtidas[i];
    }

    public void setMusicasCurtidas() {
        if (getEuCurti()) {
            this.musicasCurtidas[indice] = getTitulo();
            indice++;
        }

    }
}
