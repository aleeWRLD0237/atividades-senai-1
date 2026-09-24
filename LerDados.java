package br.com.lopal.atividades;

import java.util.Scanner;

final class LerDados {
    private LerDados() {}

    static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) return scanner.nextInt();
            System.out.println("Digite um número inteiro válido.");
            scanner.next();
        }
    }

    static double lerDecimal(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String valor = scanner.next().replace(',', '.');
            try {
                return Double.parseDouble(valor);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }
}
