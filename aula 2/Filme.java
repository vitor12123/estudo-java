public class Filme {
    String nomeFilme;
    int anoLancamento ;
    boolean incluidoNoPlano;
    double avalicacao ;
    int quantidadeAvaliacao ; 

    void exibeFichaTecnica(){
        System.out.println("");
        System.out.println("nome do filme:" + nomeFilme);
        System.out.println("ano de lançamento do filme:" + anoLancamento);
    }

    void avalie(double nota){
        quantidadeAvaliacao++;
        avalicacao += nota;
    }

    double mediaAvaliacao(){
        return avalicacao/quantidadeAvaliacao;
    }
}
