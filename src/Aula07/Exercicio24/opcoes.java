package Aula07.Exercicio24;

public class opcoes {

    public static void ConverterString(String string) {
        try {
            int num = Integer.parseInt(string);
            System.out.println("String convertida para " + num);
        } catch (NumberFormatException e) {
            System.out.println(string + " nao pode ser convertida.");
        }
    }
        public static void NuloVazio (String string) {
            if (string == null) {
                throw new NullPointerException("String nao pode ser nulo.");
            } else if (string.isEmpty()){
                System.out.println("String esta vazia.");
            } else {
                System.out.println("A String esta correta, nem nula nem vazia.");
            }

        }

        public static void PegarCaractere (String string, int ch){
            try {
                System.out.println("Caractere da posição " + ch + ": " + string.charAt(ch));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Indice invalido");
            }

        }
        public static void VerificarFrase(String string) {
        string = string.toUpperCase();
        if (string.contains("JAVA É FACIL") || string.equalsIgnoreCase("java é facil")) {
            throw new CaldeiraException("Java nao é facil");
        } else {
            System.out.println("frase nao encontrada");
        }
    }
}


