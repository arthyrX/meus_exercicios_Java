package com.arthur.exercicios.estrutura_sequencial.ex03_diferenca_produtos;
import java.util.Scanner;

public class CalculoDiferencaProdutos {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
        do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        sc.nextLine();
        int D = sc.nextInt();
        int diferenca = A * B - C * D;

        System.out.printf("DIFERENCA = %d", diferenca);

        sc.close();

    }
}
