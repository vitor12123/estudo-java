package br.com.desafioFinal.main;

import br.com.desafioFinal.classes.Audio;
import br.com.desafioFinal.classes.MinhasPreferidas;
import br.com.desafioFinal.classes.Musicas;

import java.util.Random;

public class MainDesafio {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        Audio audio = new Audio();
        Random random = new Random();

        musicas.setTitulo("Can't Deny");
        musicas.setTempoMusica(2.49);
        musicas.setGenero("house");
        musicas.setCantor("Ace Lizzy");

        for (int i = 0; i < 5000; i++) {
            musicas.reproduzir();
            if (i % 2 == 0 ) {
                musicas.curtir();
            }
        }

        double guardaAvaliacoes = 0;


        for (int i = 0; i < 150; i++){
            int avaliacoes = random.nextInt(9);
            musicas.setEstrelas(avaliacoes);
            guardaAvaliacoes += musicas.getEstrelas();

            if (i == 149) {
                musicas.setEstrelas(guardaAvaliacoes / (i + 1));
            }
        }

        musicas.setClassificacaoM();
        System.out.println(musicas.getTitulo());
        System.out.println(musicas.getCantor());
        System.out.println(musicas.getEstrelas());
        System.out.println(musicas.getTotalCurtidas());
        System.out.println(musicas.getTotalReproducoes());
        System.out.println(musicas.getClassificacaoM());

        String tituloCurtido = musicas.getTitulo();

        MinhasPreferidas curtidos = new MinhasPreferidas();
        curtidos.setTitulo(tituloCurtido);
        curtidos.setEuCurti(true);
        curtidos.setMusicasCurtidas();
        System.out.println("musicas curtidas: " + curtidos.getMusicasCurtidas(0));
    }
}
