package Aula02.Exercicio07;

//Feito em coop com Gabriel S. Howes

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);



        boolean x = true;
        // modo pra deixar em looping


        while (x) {

            System.out.println("""
                |-----Bem vindo a calculadora do Howes-----|
                |1 - Soma                                  |
                |2 - Subtração                             |
                |3 - Divisão                               |
                |4 - Multiplicação                         |
                |5 - Exponenciação                         |
                |6 - Raiz quadrada                         |
                |7 - Sair                                  |
                |------------------------------------------|
                """);

            System.out.println("Digite a opção que deseja: ");
            int escolha = teclado.nextInt();




            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    int numeroSoma1 = teclado.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int numeroSoma2 = teclado.nextInt();

                    int resultadoSoma = numeroSoma1 + numeroSoma2;
                    System.out.println("O resultado da soma é: " + resultadoSoma);

                    break;

                case 2:
                    System.out.println("Digite o primeiro número: ");
                    int numeroSubtracao1 = teclado.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int numeroSubtracao2 = teclado.nextInt();

                    int resultadoSubtracao = numeroSubtracao1 - numeroSubtracao2;
                    System.out.println("O resultado da subtração é: " + resultadoSubtracao);

                    break;

                case 3:
                    System.out.println("Digite o primeiro número: ");
                    double numeroDivisao1 = teclado.nextDouble();

                    System.out.println("Digite o segundo número: ");
                    double numeroDivisao2 = teclado.nextDouble();
                    if (numeroDivisao2 == 0) {
                        System.out.println("Não podemos dividir algo por zero :( Tente outro número");

                        break;

                        //tentei dar só um aviso da multiplicaçaõ pq vi em algum lugar que da erro nos codigos mas isso
                        // foi meu maximo
                    }
                    double resultadoDivisao = numeroDivisao1 / numeroDivisao2;
                    System.out.println("O resultado da divisão é: " + resultadoDivisao);

                    break;

                case 4:
                    System.out.println("Digite o primeiro número: ");
                    int numeromultiplicacao1 = teclado.nextInt();

                    System.out.println("Digite o segundo número: ");
                    int numeromultiplicacao2 = teclado.nextInt();

                    int resultadoMultiplicacao = numeromultiplicacao1 * numeromultiplicacao2;
                    System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao);
                    break;

                case 5:
                    System.out.println("Digite o primeiro número: ");
                    int numeroExponenciacao1 = teclado.nextInt();

                    System.out.println("Digite o expoente: ");
                    int numeroExponenciacao2 = teclado.nextInt();

                    int resultadoExponenciacao = Calcularpotencia(numeroExponenciacao1, numeroExponenciacao2);

                    System.out.println("O resultado de " + numeroExponenciacao1 + " na exponenciação de " + numeroExponenciacao2 + ": "
                            + resultadoExponenciacao);

                    break;

                //fazer sem metodo
                case 6:
                    System.out.println("Digite o número que deseja saber a raiz quadrada: ");
                    double numero = teclado.nextDouble();

                    double resultado = calculaRaizQuadrada(numero);

                    System.out.println("A raiz quadrada de " + numero + " é " + resultado);
                    break;

                case 7:
                    System.out.println("Finalizando calculadora. Obrigado pelo acesso :)");

                    x = false;
                    break;

            }
        }

        teclado.close();

    }
    //metodo para fazer exponenciacao (peguei ajuda do chat mas esse aqi eu entendi bem até)
    public static int Calcularpotencia(int numeroExponenciacao1, int exponente) {
        int resultadoExponenciacao = 1;

        if (exponente == 0) {
            return  1;
        }


        for (int i = 1; i <= exponente; i++) {
            resultadoExponenciacao *= numeroExponenciacao1;

        }

        return resultadoExponenciacao;
    }
    //metodo para fazer a raiz quadrada (peguei ajuda do chat)
    public static double calculaRaizQuadrada(double numero) {
        //precisao
        double precisao = 0.00001;

        //palpite inicial
        double palpite = numero/ 2.0;

        //enquanto a diferença entre palçpite^2 e o numero for maior que a precisao
        while ((palpite * palpite - numero) > precisao || (numero - palpite * palpite) > precisao) {
            palpite= (palpite + (numero / palpite)) / 2.0; //ajusta o palpite

        }
        return palpite;

    }

}
