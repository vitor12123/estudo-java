public class Desafio2 {
    private long numeroConta = 1234567890;
    private double saldo = 1000.00;
    String titular = "vitor pallis ninni la salvia";

    private int idadePessoa;

    public void setIdadePessoa(int idadePessoa){
        this.idadePessoa = idadePessoa;
        if(idadePessoa >= 18) {
            System.out.println("o titular é maior de idade");
        }
        else {
            System.out.println("o titular é menor de idade");
        }
    }
    public int getIdadePessoa() {
        return idadePessoa;
    }

    class Produto {
        private String nome;
        private double preco;
        private double desconto;

        public void setNome(String nome){
            this.nome = nome;
        }
        public String getNome(){
            System.out.println("nome do produto: " + nome);
            return nome;
        }
        public void setPreco(double preco){
            this.preco = preco;
        }
        public void setDesconto(double desconto){
            this.desconto = desconto;
        }
        public double getPreco(){
            System.out.println("preco total: " + preco);
            if (desconto > 0) {
                preco = preco - desconto;
            }
            System.out.println("preco descontado: " + desconto);
            System.out.println("preco final: " + preco);
            return preco;
        }
    }
}

