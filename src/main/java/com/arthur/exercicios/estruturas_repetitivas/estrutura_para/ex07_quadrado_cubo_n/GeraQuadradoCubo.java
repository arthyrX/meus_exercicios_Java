package com.arthur.exercicios.estruturas_repetitivas.estrutura_para.ex07_quadrado_cubo_n;
import java.util.Scanner;

public class GeraQuadradoCubo {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        exemplo.
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int x = i;
            int y = i * i;
            int z = i * i * i;

            System.out.printf("%d %d %d\n", x, y, z);
        }

        sc.close();
    }
}
