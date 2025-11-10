import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        // Exercicio 1
        double temperaturaCelsius = 30.0;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println("");
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        // ex 2 
        double notas[] = {8.0, 4.0};
        double media = (notas[0] + notas[1]) / 2;
        System.out.println("media: " + media);

        // ex 3 
        double num1 = 9.9;
        int numConvertido = (int) num1;
        System.out.println(numConvertido);

        // ex 4 
        char letras = 'b';
        String texto = "oolean";
        System.out.println(letras + texto);

        // ex 5 
        double precoProduto = 19.99;
        int quantidade = 3; 
        System.out.println(quantidade * precoProduto);

        // ex 6 
        double valorEmDolares = 1000;
        double conversor = 4.94; 
        System.out.println(conversor * valorEmDolares);

        // ex 7 
        boolean verificacao = true;
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero para calcular o fatorial: ");
        int numeroFatorial1 = input.nextInt();
        int numeroFatorial2 = numeroFatorial1;
        int fatorial = 1;
        while (verificacao){
            fatorial *= numeroFatorial2;
            numeroFatorial2--;
            if (numeroFatorial2 == 1) {
                break;
            }
        }
        System.out.println(fatorial);
    }
}
