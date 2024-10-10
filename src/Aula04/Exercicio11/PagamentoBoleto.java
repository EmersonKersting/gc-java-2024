package Aula04.Exercicio11;

public class PagamentoBoleto implements Pagamento {
    private String codigoBoleto;

    public PagamentoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento do boleto " + this.codigoBoleto + " foi realizado com sucesso");
    }
}
