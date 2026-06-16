package desafio2;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("string 1");
        lista.add("string 10");
        lista.add("string 12");
        lista.add("string 1321");
        lista.add("string 52312");

        lista.forEach( str -> {
            System.out.println(str);
        });
    }


}
