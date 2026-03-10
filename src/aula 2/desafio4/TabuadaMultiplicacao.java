package desafio4;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public int mostrarTabuada(int numero){
        for(int i = 1; i <= 10; i++){
            System.out.println(numero * i);
        }
        return numero;
    }

}
