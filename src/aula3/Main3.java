import br.com.alura.vitor.modelo.Filme;
import br.com.alura.vitor.modelo.Serie;
import desafio1.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Filme filmeVitor = new Filme("todo mundo em panico", 2000);
        filmeVitor.setDuracaoEmMinutos(132);
        filmeVitor.setAnoLancamento(2000);
        filmeVitor.avalie(9.5);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeVitor);

        System.out.println("Tamanho lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNomeFilme());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        Serie theOffice = new Serie("The Office", 2008);

        // desafio 1

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        for( int i = 0; i < 3; i++) {
            Scanner pessoa = new Scanner(System.in);
            Pessoa pessoas = new Pessoa();

            System.out.println("digite o nome da pessoa " + (i + 1));
            String nomeDaPessoa = pessoa.nextLine();
            System.out.println("digite a idade da pessoa " + (i + 1));
            int idadeDaPessoa = pessoa.nextInt();

            pessoas.setNomePessoa(nomeDaPessoa);
            pessoas.setIdadePessoa(idadeDaPessoa);

            listaDePessoas.add(pessoas);
        }
        System.out.println("tamanho lista: " + listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(" ");
        listaDePessoas.forEach( (n) -> { System.out.println(n); } );

    }
}
