package desafio4;

public class ConversorMoeda implements ConvercaoFinanceira {
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal() {
        if (dolar == 0) {
            return 0;
        }
        else {
            double moedaConvertida = dolar * 5.15;
            return moedaConvertida;
        }
    }
}
