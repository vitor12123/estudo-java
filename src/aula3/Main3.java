import br.com.alura.vitor.modelo.Filme;
import br.com.alura.vitor.modelo.Serie;
import br.com.alura.vitor.modelo.Titulo;
import desafio1.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Filme filmeVitor = new Filme("todo mundo em panico", 2000);
        filmeVitor.setDuracaoEmMinutos(132);
        filmeVitor.avalie(8.5);

        Filme filme2 = new Filme("madagascar", 2005);
        filmeVitor.setDuracaoEmMinutos(86);
        filme2.avalie(9.5);

        Filme filme3 = new Filme("meu malvado favorito", 2010);
        filmeVitor.setDuracaoEmMinutos(95);
        filme3.avalie(9);

        Serie dr_House = new Serie("doctor house",2005);
        dr_House.setAtiva(false);
        dr_House.setTemporadas(8);
        dr_House.setEpsodioPorTemporada(24);
        dr_House.setMinutosPorEpsodio(45);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeVitor);

        System.out.println("Tamanho lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNomeFilme());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        Serie theOffice = new Serie("The Office", 2008);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(filmeVitor);
        listaTitulos.add(filme2);
        listaTitulos.add(filme3);
        listaTitulos.add(dr_House);

        for (Titulo item : listaTitulos) {
            System.out.println(item.getNomeFilme());
            if(item instanceof Filme filme) {
                System.out.println("classificação: " + filme.getClassificave());
            }


        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Will Smith");
        buscaArtista.add("Rick Sanches");
        buscaArtista.add("Enaldinho");

        Collections.sort(buscaArtista);
        System.out.println(buscaArtista);

        System.out.println(listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        // desafio 1

        //ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //for( int i = 0; i < 3; i++) {
            //Scanner pessoa = new Scanner(System.in);
            //Pessoa pessoas = new Pessoa();

            //System.out.println("digite o nome da pessoa " + (i + 1));
            //String nomeDaPessoa = pessoa.nextLine();
            //System.out.println("digite a idade da pessoa " + (i + 1));
            //int idadeDaPessoa = pessoa.nextInt();

            //pessoas.setNomePessoa(nomeDaPessoa);
            //pessoas.setIdadePessoa(idadeDaPessoa);

            //listaDePessoas.add(pessoas);
            //}
        //System.out.println("tamanho lista: " + listaDePessoas.size());
        //System.out.println(listaDePessoas.get(0));
        //    System.out.println(" ");
      //  listaDePessoas.forEach( (n) -> { System.out.println(n); } );

    }
}
