import br.com.alura.vitor.modelo.Filme;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("");
        Filme filmeBuscado = new Filme();

        filmeBuscado.setNomeFilme("vingadores ultimato");
        filmeBuscado.setAnoLancamento(2019);
        
        filmeBuscado.exibeFichaTecnica();
        filmeBuscado.avalie(10);
        filmeBuscado.avalie(9);
        filmeBuscado.avalie(8);

        System.out.println(filmeBuscado.getSomAvaliacao());
        System.out.println("total avaliacoes: " + filmeBuscado.getQuantidadeAvaliacao());
        System.out.println(filmeBuscado.mediaAvaliacao());

        // desafio 1
        Desafio1 desafio1 = new Desafio1();

        System.out.println("aqui começa o desafio 1.");

        desafio1.pessoa();
        System.out.println(desafio1.calculadora(10));
        desafio1.musicas();
    }
    
}
