package Aula05.exercicio13;

public class carrinhoDeCompras {
        String nome;
        String validade;

        public carrinhoDeCompras(String nome, String validade) {
            this.nome = nome;
            this.validade = validade;
        }

    @Override
    public String toString() {
        return "Itens: " + nome + " Validade: " + validade;

    }
}
