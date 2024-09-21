package Aula03.Exercicio09;


import java.util.Scanner;

public class Main extends ContaBancaria{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.setNome("Emerson");
        minhaConta.setCpf("048.719.040-83");
        minhaConta.setNomeBanco("Nubank");
        minhaConta.setEndereco("Casa");
        minhaConta.setHorarioAtual("17:00");
        minhaConta.setIdentificadorConta("767");
        minhaConta.setSaldo(500.000);

        System.out.println("Informe o valor do pix: ");
        double valorPix = scanner.nextDouble();
        minhaConta.pix(valorPix);

        System.out.println(minhaConta.getNome());
        System.out.println(minhaConta.getCpf());
        System.out.println(minhaConta.getNomeBanco());
        System.out.println(minhaConta.getEndereco());
        System.out.println(minhaConta.getHorarioAtual());
        System.out.println(minhaConta.getIdentificadorConta());
        System.out.println(minhaConta.getSaldo());

    }
}