package Aula05.exercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<carrinhoDeCompras> carrinhoCompras = new ArrayList<>();
        int opcao;

        do {
            System.out.println("""
                    Lista de carrinho de compras
                    1 - Adicionar item
                    2 - Remover item
                    3 - Exibir carrinho
                    4 - Sair
                    """);
            opcao = sc.nextInt();
            sc.nextLine();

           switch (opcao){
               case 1:
                   System.out.println("Digite o item que deseja adicionar ao carrinho");
                   String nome = sc.nextLine();
                   System.out.println("Digite a data de validade");
                   String validade = sc.nextLine();

                   carrinhoDeCompras novaCompra = new carrinhoDeCompras(nome, validade);
                   carrinhoCompras.add(novaCompra);
                   System.out.println("Compra adicionada com sucesso!");
                   break;

              case 2:
                  if (carrinhoCompras.isEmpty()) {
                      System.out.println("Seu carrinho esta vazio");
                  } else {
                      System.out.println("Insira o item que deseja remover");
                      for (int i = 0; i < carrinhoCompras.size(); i++) {
                          System.out.println(i + " - " + carrinhoCompras.get(i));
                      }
                      int indice = sc.nextInt();
                      if (indice >= 0 && indice < carrinhoCompras.size()) {
                          carrinhoCompras.remove(indice);
                          System.out.println("Removido com sucesso!");
                      } else {
                          System.out.println("Insira um item valido");
                      }
                  }
                  break;

               case 3:
                   if (carrinhoCompras.isEmpty()) {
                       System.out.println("Seu carrinho esta vazio");
                   } else {
                       System.out.println("Seu carrinho tem esses itens adicionados");
                       for (int compra = 0; compra < carrinhoCompras.size(); compra++) {
                           System.out.println(carrinhoCompras);
                       }
                   }
                    break;

              case 4:
                  System.out.println("Compra finalizada. Obrigado.");
                  break;
                  default:
                      System.out.println("Insira uma opção valida");
           }

        } while (opcao != 4);

        sc.close();

        }
    }
