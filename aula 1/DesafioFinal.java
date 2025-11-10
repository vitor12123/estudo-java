
import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        boolean validacao = true;
        System.out.println();
        String nome = "vitor";
        String tipoConta = "poupança";
        double saldoConta = 1500.00;

        System.out.println("nome da conta: " + nome);
        System.out.println("tipo da conta: " + tipoConta);
        System.out.println("saldo da conta: " + saldoConta);

        while(validacao) {
            Scanner input = new Scanner(System.in);
            System.out.println("para ver o saldo da conta digite 1: ");
            System.out.println("para depositar dinheiro digite 2: ");
            System.out.println("para sacar dinheiro digite 3: ");
            System.out.println("para sair digite 4: ");
            int opcao = input.nextInt(); 
            
            if (opcao == 1) {
                System.out.println("sua conta tem " + saldoConta);
            }
            if (opcao == 2) {
                System.out.println("digite o valor que deseja depositar: ");
                double valorDeposito = input.nextDouble();
                saldoConta += valorDeposito;
            }
            if (opcao == 3) {
                System.out.println("digite o valor que deseja saque: ");
                double valorSaque = input.nextDouble();
                if(saldoConta < valorSaque) {
                    System.out.println("voce nao tem dinheiro suficiente para fazer esse saque.");
                }
                else{
                    saldoConta -= valorSaque;
                }
            }
            if (opcao == 4) {
                System.out.println("Ate mais " + nome);
                break;
            }
            if (opcao >= 5) {
                System.out.println("opção invalida.");
            }
        }
    }
}
