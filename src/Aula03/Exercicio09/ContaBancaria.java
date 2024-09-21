package Aula03.Exercicio09;

import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String nomeBanco;
    private String endereco;
    private double saldo;
    private String horarioAtual;


    Scanner scanner = new Scanner(System.in);


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(String identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual(String horarioAtual) {
        this.horarioAtual = horarioAtual;
    }

    public void saque(double valor){
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            System.out.println("Pix realizado com sucesso");
        }
    }
    public void deposito(double valor){
        System.out.println("Insira o valor do deposito ");
        valor = scanner.nextDouble();
        saldo = saldo + valor;
    }
    public void pix(double valor){
        System.out.println("Qual o valor do pix?");
        valor = scanner.nextDouble();

        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Pix realizado com sucesso");
            saldo = saldo + valor;

        }
    }
}