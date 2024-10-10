package Aula04.Exercicio11;

public class Main {
    public static void main(String[] args) {
        Pagamento pagBoleto = new PagamentoBoleto("165148489465656");
        Pagamento pagCartao = new PagamentoCartao("Emerson G Kersting Junior");

        pagBoleto.processarPagamento();
        pagCartao.processarPagamento();
    }
}
