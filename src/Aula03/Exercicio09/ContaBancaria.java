package Aula03.Exercicio09;

import java.time.LocalTime;
import java.util.Scanner;

public class ContaBancaria {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalTime horarioAtual;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = LocalTime.now();
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void deposito(double valor) {
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        saldo += valor;
    }

    public void pix(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Transferência PIX de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência PIX.");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        if (valor <= saldo) {
            LocalTime horaAtual = LocalTime.now();
            if (horaAtual.isAfter(LocalTime.of(8, 0)) && horaAtual.isBefore(LocalTime.of(19, 0))) {
                saldo -= valor;
                destino.deposito(valor);
                System.out.println("Transferência de R$" + valor + " para a conta de " + destino.getNome() + " realizada com sucesso.");
            } else {
                System.out.println("Transferência permitida apenas entre 8h e 19h.");
            }
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void verificarHorario() {
        System.out.println("Horário atual: " + LocalTime.now());
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Identificador da Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Horário Atual: " + horarioAtual);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdentificadorConta() {
        return identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo() {
        return saldo;
    }
}
