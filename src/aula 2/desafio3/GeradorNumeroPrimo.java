package desafio3;

public class GeradorNumeroPrimo extends NumerosPrimos{
    private static int numeroPrimo;
    public static int main(String[] args) {
        for (int numero = 2; numero <= 100; numero++) {

            boolean ehPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                }
            }

            if (ehPrimo) {
                System.out.println(numero);
            }
            numeroPrimo = numero;
        }
        return numeroPrimo;
    }
}
