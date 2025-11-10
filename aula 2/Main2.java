public class Main2 {
    public static void main(String[] args) {
        System.out.println("");
        Filme filmeBuscado = new Filme();

        filmeBuscado.nomeFilme = "vingadores ultimato";
        filmeBuscado.anoLancamento = 2019;
        filmeBuscado.avalicacao = 9.9;
        filmeBuscado .incluidoNoPlano = true;
        filmeBuscado.quantidadeAvaliacao = 1;
        
        filmeBuscado.exibeFichaTecnica();
        filmeBuscado.avalie(10);
        filmeBuscado.avalie(7.5);
        filmeBuscado.avalie(5);

        System.out.println(filmeBuscado.avalicacao);
        System.out.println(filmeBuscado.quantidadeAvaliacao);
        System.out.println(filmeBuscado.mediaAvaliacao());

        // desafio 1
        Desafio1 desafio1 = new Desafio1();

        System.out.println("aqui começa o desafio 1.");

        desafio1.pessoa();
        System.out.println(desafio1.calculadora(10));
        desafio1.musicas();
    }
    
}
