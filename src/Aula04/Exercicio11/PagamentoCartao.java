package Aula04.Exercicio11;

public class PagamentoCartao implements Pagamento {
    private String nomeDoTitular;

    public PagamentoCartao(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com o cartão de " + nomeDoTitular + " foi concluida com sucesso");
    }
}
