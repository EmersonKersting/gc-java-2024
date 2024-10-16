package Aula03.Exercicio09;

//Feito em coop Emerson Kersting e João Vitor Trevisan

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Emerson Kersting", "123.456.789-00", "0001", "Banco do Brasil", "Rua Dom Pedro, 434", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("Joao Trevisan", "987.654.321-00", "0002", "Banco Nubank", "Rua 20 de Setembro, 453", 500.00);

        System.out.println("Informações da conta 1:");
        conta1.verificarInformacoes();

        System.out.println("\nDepósito na conta 1:");
        conta1.deposito(200);

        System.out.println("\nTransferência da conta 1 para a conta 2:");
        conta1.transferencia(conta2, 300);

        System.out.println("\nSaldo da conta 1 após as operações:");
        conta1.verificarSaldo();

    }
}
