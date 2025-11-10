import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("bem vindo");

        //int anoLancamento = 2019;
        //String nomeFilme = "Vingadores Ultimato";
        //double notaImdb = 8.4;
       // String tipoPlano = "plus";
       // if(tipoPlano.equals("gratis")) {
       //     System.out.println("vc é pobre, só pode assistir 30% dos filmes");
        //}
       // else if(tipoPlano.equals("plus")){
       //     System.out.println("bem vindo patrão! Assiste oque vc quiser.");
       // }
        //System.out.println("O filme " + nomeFilme + ", lançado em " + anoLancamento + ", tem nota " + notaImdb + " no IMDB.");
    //
       // double notasFilme = (9.8 + 6.3 + 8.0)/3;
      //  System.out.println("A média das notas do filme é " + notasFilme);
//
       // int classificacao = (int) (notasFilme / 2);
       // System.out.println("A classificação do filme é " + classificacao + " estrelas");

      //  Scanner inputes = new Scanner(System.in);

     //   System.out.println("qual filme vc quer assistir? ");
       // String escolhaFilme = inputes.nextLine();
       // System.out.println("digite sua nota para o filme: ");
       // double notaIndividualFilme = inputes.nextDouble();

       // System.out.println("voce escolheu " + escolhaFilme);
       // System.out.println("voce deu " + notaIndividualFilme + " para " + escolhaFilme);
        //inputes.close();

      //  int contador = 0;
       // double mediaNota = 0; 
      //  double nota = 0;
       // Scanner input = new Scanner(System.in);
       // for(int i = 0; i < 3; i++){ 
       //     System.out.println("digite a nota do aluno: ");
        //    nota = input.nextDouble();
       //     mediaNota += nota; 
       ///     contador += 1;
       // }
       // double mediaSala = mediaNota / contador ;
        //System.out.println("a media da sala foi " + mediaSala);

        int contador = 0;
        double mediaNota = 0; 
        double nota = 0;
        Scanner input = new Scanner(System.in);
        while(nota != -1){ 
            System.out.println("digite a nota do aluno (digite -1 para encerrar): ");
            nota = input.nextDouble();
            if(nota >= 0) {
                mediaNota += nota; 
                contador ++;
            }
        }
        if (contador <= 0 || mediaNota <= 0) {
            System.out.println("media sala é 0");
        }
        else {
            double mediaSala = mediaNota / contador ;
            System.out.println("a media da sala foi " + mediaSala);
        }
        System.out.println("");
    }
}
