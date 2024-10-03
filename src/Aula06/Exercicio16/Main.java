package Aula06.Exercicio16;

public class Main {
    public static void main(String[] args) {
        StatusDoPedido(StatusPedido.ENTREGUE);
    }

    private static void StatusDoPedido(StatusPedido status) {
        switch (status){
            case ENVIADO:
                System.out.println("Seu pedido foi enviado.");
                break;
            case ENTREGUE:
                System.out.println("Seu pedido foi entregue.");
                break;
            case PENDENTE:
                System.out.println("Seu pedido esta pendente");
                break;
            case PROCESSANDO:
                System.out.println("Seu pedido esta sendo processado.");
                break;
        }

    }

}
