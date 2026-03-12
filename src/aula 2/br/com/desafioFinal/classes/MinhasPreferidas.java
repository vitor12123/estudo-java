package br.com.desafioFinal.classes;

public class MinhasPreferidas extends Musicas {

    private String[] musicasCurtidas = new String[100];
    private int indiceM = 0;

    public String getMusicasCurtidas(int i) {
        return musicasCurtidas[i];
    }

    public void setMusicasCurtidas() {
        if (getEuCurti()) {
            this.musicasCurtidas[indiceM] = getTitulo();
            indiceM++;
            setEuCurti(false);
        }

    }

    private String[] podcastsCurtidos = new String[100];
    private int indiceP = 0;

    public String getPodcastsCurtidos(int i) {
        return podcastsCurtidos[i];
    }

    public void setPodcastsCurtidos(Podcast podcast) {
        if(getEuCurti()) {
            this.podcastsCurtidos[indiceP] = podcast.getNomePodcast();
            indiceP++;
            setEuCurti(false);
        }
    }
}
