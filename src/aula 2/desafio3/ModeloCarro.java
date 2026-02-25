package desafio3;

public class ModeloCarro extends Carro{
    private int ano;
    private boolean tunado;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Boolean getTunado() {
        return tunado;
    }

    public void setTunado(boolean tunado) {
        this.tunado = tunado;
    }

    public void aumentoPreco(){
        if (tunado == true) {
            setPreco3(getPreco3() + 100);
        }
    }
}
