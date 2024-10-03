package Aula06.Exercicio20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //usei LinkedHashMap pra deixar a frase na ordem em que foi escrita e nao em ordem alfabetica
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        System.out.println("digite um frase");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            if (map.containsKey(palavra)) {
                map.put(palavra, map.get(palavra) + 1);
            } else {
                map.put(palavra, 1);
            }
        }
        System.out.println(map);
    }

}
