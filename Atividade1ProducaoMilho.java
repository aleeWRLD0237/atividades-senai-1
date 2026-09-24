package br.com.lopal.atividades;

import java.util.Scanner;

public class Atividade1ProducaoMilho {
    private Atividade1ProducaoMilho() {}

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            executar(scanner);
        }
    }

    public static void executar(Scanner scanner) {
        double[] producao = new double[7];
        double total = 0;
        double maior = Double.NEGATIVE_INFINITY;
        int semanaMaior = 0;
        for (int i = 0; i < producao.length; i++) {
            producao[i] = LerDados.lerDecimal(scanner, "Produção da semana " + (i + 1) + " (toneladas): ");
            total += producao[i];
            if (producao[i] > maior) {
                maior = producao[i];
                semanaMaior = i + 1;
            }
        }
        System.out.printf("Produção total: %.2f toneladas%n", total);
        System.out.printf("Média semanal: %.2f toneladas%n", total / producao.length);
        System.out.printf("Maior produção: %.2f toneladas (semana %d)%n", maior, semanaMaior);
    }
}
