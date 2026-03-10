package desafio4;
import desafio4.Livro;

public class ProdutoFisico implements Calculavel{

    Livro livro = new Livro();

    private double precoLoja = livro.precoParaLojas() + 2;
    public double precoFinal(){
        return precoLoja - 1;
    }

    @Override
    public double calcularPrecoFinal(){
        return precoFinal();
    }
}
