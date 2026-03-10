import br.com.alura.vitor.calculos.CalculadoraDeTempo;
import br.com.alura.vitor.calculos.FiltroRecomendacao;
import br.com.alura.vitor.modelo.Episodio;
import br.com.alura.vitor.modelo.Filme;
import br.com.alura.vitor.modelo.Serie;
import desafio3.Carro;
import desafio3.ModeloCarro;
import desafio4.ConversorMoeda;
import desafio4.Livro;
import desafio4.ProdutoFisico;
import desafio4.TabuadaMultiplicacao;

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

        FiltroRecomendacao filtroR = new FiltroRecomendacao();

        filtroR.filtra(filmeBuscado);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(dark);
        episodio.setTotalView(1000);

        filtroR.filtra(episodio);


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
        carro.setModelo("onyx");
        carro.setPreco1(10.0);
        carro.setPreco2(40.0);
        carro.setPreco3(20.0);
        carro.maiorPreco();

        ModeloCarro personalizacao = new ModeloCarro();
        personalizacao.setPreco1(10.0);
        personalizacao.setPreco2(40.0);
        personalizacao.setPreco3(20.0);

        personalizacao.setTunado(true);
        personalizacao.setAno(2016);
        personalizacao.aumentoPreco();
        carro.maiorPreco();
        System.out.println(carro.getModelo() + " - " + personalizacao.getAno() + " - " + personalizacao.getPreco3());

        // desafio 4

        ConversorMoeda conversorDolar = new ConversorMoeda();
        conversorDolar.setDolar(1);
        System.out.println(conversorDolar.converterDolarParaReal());

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(10);

        ProdutoFisico loja = new ProdutoFisico();
        Livro fabrica = new Livro();

        System.out.println("preco para pessoas: " + loja.precoFinal());
        System.out.println("preco para as lojas:    " + fabrica.precoParaLojas());
    }

}