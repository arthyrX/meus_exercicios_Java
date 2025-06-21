package com.arthur.exercicios.estrutura_sequencial.ex02_area_circulo;
import java.util.Scanner;
import java.util.Locale;

public class CalculoAreaCirculo {
    public static void main(String[] args) {
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double raio;
        double area;
        double pi = 3.14159;

        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.printf("A = %.4f", area);

        sc.close();

    }
}
