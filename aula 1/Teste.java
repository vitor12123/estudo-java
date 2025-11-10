import java.util.Scanner;

public class Teste 
{

    public static void main(String[] args) 
    {
        System.out.println("");
        System.out.println("digite uma letra ");
        Scanner input = new Scanner(System.in);
        String numeroJogador = input.next();
        int numeroTecla = numeroJogador.charAt(0) ;
        System.out.println("Tecla " + numeroTecla );
        
    }
}
