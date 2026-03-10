package desafio4;

public class Livro implements Calculavel{

    private double precoOriginal = 1.99;
    private double taxaDeEntraga = 2;
    public double precoParaLojas(){
        return  precoOriginal + taxaDeEntraga;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoParaLojas();
    }
}
