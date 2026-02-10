import java.util.ArrayList;
import java.util.List;
import java.util.Scanner ;

public class Projeto {
    public static void main(String[] args) {
        String pergunta[] = {"nome","endereço","telefone"};
        int lista = pergunta.length;
        List pessoas = new ArrayList();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <= lista - 1; i++) {
            System.out.println(" digite seu "+ pergunta[i]);
            String pessoa = scan.nextLine();
            pessoas.add(pessoa);
        }
        System.out.println(pessoas);
        scan.close();
    }
}
