package br.com.alura.vitor.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificave() >= 4){
            System.out.println("Muito bem avaliado!");
        } else if (classificavel.getClassificave() >= 3) {
            System.out.println("esta em alta no momento !");
        }
        else{
            System.out.println("assista depois.");
        }
    }
}
