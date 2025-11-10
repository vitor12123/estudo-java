import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Bem vindo ao jogo!");
        System.out.println("O jogo é simples você tem 5 tentativas para acertar um numero de 0 a 100.");
        System.out.println("Boa sorte!");

        int numeroJogo = new Random().nextInt(100);
        Scanner input = new Scanner(System.in);
        int contador = 1;

        for(int i = 0; i < 5; i++){
            System.out.println("sua " + contador + " tentativa: ");
            int numeroJogador = input.nextInt();

            if(numeroJogador > numeroJogo ) {
                System.out.println("o numero é menor que " + numeroJogador);
            } 
            else if (numeroJogador < numeroJogo) {
                System.out.println("o numero é maior que " + numeroJogador);
            }
            if(numeroJogador == numeroJogo){
                System.out.println("Parabens você ganhou! ");
                break;
            }
            else if (i <= 3){ 
                System.out.println("Tente novamente!");
            }
            else if( i <= 5){ 
                System.out.println("O numero era " + numeroJogo +", boa sorte na proxima!");
            }
            contador++;
        }
        
    }
}
