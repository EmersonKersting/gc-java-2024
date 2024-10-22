package Boss;

import java.util.*;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static List<Aventureiros> listaAventureiros = new ArrayList<>();

    public static void menuEscolha () {
        Aventureiros aventureiro = new Aventureiros("Emerson", 22, Classes.ARQUEIRO, 5000, 5);

        listaAventureiros.add(aventureiro);

        int opcao = 0;

        do {
            System.out.println("""
                    ||||| Sistema de gestão de mercenarios |||||
                    
                    1 - Adicionar Mercenario
                    2 - Atualizar Mercenario
                    3 - Excluir Mercenario
                    4 - listar Mercenarios
                    5 - Buscar mercenario por nome
                    6 - Filtrar por classe
                    7 - Sair
                    """);
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do Aventureiro: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a idade do Aventureiro: ");
                    int idade = sc.nextInt();
                    System.out.println("Qual a classe escolhida? (Arqueiro, Mago, Assassino, Cavaleiro)");
                    String resposta = sc.next();
                    Classes classes = Classes.valueOf(resposta.toUpperCase());
                    System.out.println("Qual o salario?");
                    double salario = sc.nextDouble();
                    System.out.println("Qual a nota de desempenho (0 a 5)");
                    int notaDesempenho = sc.nextInt();

                    Aventureiros aventureiros = new Aventureiros(nome, idade, classes, salario, notaDesempenho);
                    listaAventureiros.add(aventureiros);
                    System.out.println("Aventureiro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do Aventureiro que deseja atualizar: ");
                    sc.nextLine();
                    String nomeAtualizar = sc.nextLine();

                    Aventureiros atualizarAventureiro = null;
                    for (Aventureiros atualizar : listaAventureiros) {
                        if (atualizar.getNome().equalsIgnoreCase(nomeAtualizar)) {
                            atualizarAventureiro = atualizar;
                            break;
                        }
                    }

                    if (atualizarAventureiro != null) {
                        System.out.println("Aventureiro encontrado. Atualize as informações:");

                        System.out.println("Digite a nova idade do Aventureiro (Atual: " + atualizarAventureiro.getIdade() + "): ");
                        int novaIdade = sc.nextInt();
                        atualizarAventureiro.setIdade(novaIdade);

                        System.out.println("Qual a nova classe? (Atual: " + atualizarAventureiro.getClasses() + "): ");
                        sc.nextLine();
                        String mudarClasse = sc.nextLine();
                        Classes novaClasse = Classes.valueOf(mudarClasse.toUpperCase());
                        atualizarAventureiro.setClasses(novaClasse);

                        System.out.println("Digite o novo salário (Atual: " + atualizarAventureiro.getSalario() + "): ");
                        double novoSalario = sc.nextDouble();
                        atualizarAventureiro.setSalario(novoSalario);

                        System.out.println("Digite a nova nota de desempenho (Atual: " + atualizarAventureiro.getNotaDesempenho() + "): ");
                        int novaNotaDesempenho = sc.nextInt();
                        atualizarAventureiro.setNotaDesempenho(novaNotaDesempenho);

                        System.out.println("Aventureiro atualizado com sucesso!");
                    } else {
                        System.out.println("Aventureiro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do Aventureiro que deseja remover: ");
                    sc.nextLine();
                    String nomeRemover = sc.nextLine();

                    Aventureiros removerAventureiro = null;
                    for (Aventureiros remover : listaAventureiros) {
                        if (remover.getNome().equalsIgnoreCase(nomeRemover)) {
                            removerAventureiro = remover;
                            break;
                        }
                    }

                    if (removerAventureiro != null) {
                        listaAventureiros.remove(removerAventureiro);
                        System.out.println("Aventureiro removido com sucesso!");
                    } else {
                        System.out.println("Aventureiro não encontrado.");
                    }
                    break;
                case 4:
                    if (listaAventureiros.isEmpty()) {
                        System.out.println("Nenhnum aventureiro cadastrado!");
                    } else {
                        System.out.println("Lista de Aventureiros:");
                        System.out.println(listaAventureiros);
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do Aventureiro que deseja buscar: ");
                    sc.nextLine();
                    String buscarNome = sc.nextLine();

                    for (Aventureiros buscar : listaAventureiros) {
                        if (buscar.getNome().equalsIgnoreCase(buscarNome)) {
                            System.out.println("Aventureiro encontrado:");
                            System.out.println(buscar);
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Digite a classe que deseja filtrar (ARQUEIRO, MAGO, ASSASSINO, CAVALEIRO): ");
                    sc.nextLine();
                    String classeBuscar = sc.nextLine().toUpperCase();

                    try {
                        Classes classeFiltrar = Classes.valueOf(classeBuscar);
                        int contador = 0;

                        System.out.println("Aventureiros da classe " + classeFiltrar + ":");

                        for (Aventureiros listar : listaAventureiros) {
                            if (listar.getClasses() == classeFiltrar) {
                                System.out.println("Nome: " + listar.getNome());
                                System.out.println("Idade: " + listar.getIdade());
                                System.out.println("Salário: " + listar.getSalario());
                                System.out.println("Nota de Desempenho: " + listar.getNotaDesempenho());
                                System.out.println("-----------------------------");
                                contador++;
                            }
                        }

                        System.out.println(contador == 0 ? "Nenhum aventureiro encontrado da classe " + classeFiltrar + "." : "");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Classe inválida! Por favor, tente novamente.");
                    }
                    break;
                case 7:
                    System.out.println("Finalizado, Obrigado!");
                    break;
                default:
                    System.out.println("Insira uma opção valida");
            }


        } while (opcao != 7);

    }

}
