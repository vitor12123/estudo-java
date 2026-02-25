package desafio3;

public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }
    public double getPreco1() {
        return preco1;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }
    public double getPreco2() {
        return preco2;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }
    public double getPreco3() {
        return preco3;
    }

    public void maiorPreco() {
        if (preco1 > preco2 & preco1 > preco3) {
            System.out.println("maior preço " + preco1);
        }
        else if (preco2 > preco1 & preco2 > preco3) {
            System.out.println("maior preço " + preco2);
        }
        else {
            System.out.println("maior preço " + preco3);
        }
    }
}



