package com.arthur.exercicios.estruturas_repetitivas.estrutura_para.ex05_calculo_fatorial;
import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1.
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
