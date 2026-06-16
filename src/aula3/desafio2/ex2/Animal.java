package desafio2.ex2;

public class Animal {
    private String nomeEspecie;
    private boolean extinto;
    private String aondeVive;

    public Animal(String nomeEspecie, boolean extinto, String aondeVive) {
        this.nomeEspecie = nomeEspecie;
        this.extinto = extinto;
        this.aondeVive = aondeVive;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public String getAondeVive() {
        return aondeVive;
    }
}
