package Aula06.Exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        niveisDeAcesso(NivelAcesso.USUARIO);
    }

    private static void niveisDeAcesso(NivelAcesso nivel) {
        switch (nivel){
            case ADMIN:
                System.out.println("O administrador pode acessar todos os recursos.");
                break;
            case MODERADOR:
                System.out.println("O moderador tem acessos limitados.");
                break;
            case USUARIO:
                System.out.println("O usuario nao tem acessos permitidos.");
                break;

        }
    }
}
