import br.com.alura.vitor.calculos.CalculadoraDeTempo;
import br.com.alura.vitor.modelo.Filme;
import br.com.alura.vitor.modelo.Serie;
import desafio3.Carro;
import desafio3.ModeloCarro;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("");
        Filme filmeBuscado = new Filme();

        filmeBuscado.setNome("vingadores ultimato");
        filmeBuscado.setAnoLancamento(2019);
        filmeBuscado.setDuracaoEmMinutos(210);
        
        filmeBuscado.exibeFichaTecnica();
        filmeBuscado.avalie(10);
        filmeBuscado.avalie(9);
        filmeBuscado.avalie(8);

        System.out.println(filmeBuscado.getSomAvaliacao());
        System.out.println("total avaliacoes: " + filmeBuscado.getQuantidadeAvaliacao());
        System.out.println(filmeBuscado.mediaAvaliacao());

        Serie dark = new Serie();

        dark.setNome("dark");
        dark.setAnoLancamento(2017);
        dark.setTemporadas(3);
        dark.setEpsodioPorTemporada(8);
        dark.setMinutosPorEpsodio(53);
        dark.exibeFichaTecnica();
        System.out.println("Duração da serie em minutos: " + dark.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("ilha do medo");
        outroFilme.setDuracaoEmMinutos(132);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeBuscado);
        calculadora.inclui(outroFilme);
        calculadora.inclui(dark);
        System.out.println("Soma filmes " + calculadora.getTempoTotal() + " minutos");

        // desafio 1
        Desafio1 desafio1 = new Desafio1();

        System.out.println("aqui começa o desafio 1.");

        desafio1.pessoa();
        System.out.println(desafio1.calculadora(10));
        desafio1.musicas();

        // desafio 2

        Desafio2 desafio2 = new Desafio2();
        desafio2.setIdadePessoa(19);
        System.out.println("o titular tem " + desafio2.getIdadePessoa() + " anos");

        Desafio2.Produto produto = desafio2.new Produto();
        produto.setNome("subwaysurfs");
        produto.getNome();
        produto.setPreco(20);
        produto.setDesconto(2);
        produto.getPreco();

        // desafio 3

        Carro carro = new Carro();
        carro.setModelo("onyx 2016");
        carro.setPreco1(10.0);
        carro.setPreco2(40.0);
        carro.setPreco3(20.0);
        carro.maiorPreco();

        ModeloCarro personalizacao = new ModeloCarro();
        personalizacao.getPreco1();
        personalizacao.getPreco2();
        personalizacao.getPreco3();
        personalizacao.setTunado(true);
        personalizacao.aumentoPreco();
        carro.maiorPreco();
    }
    
}
