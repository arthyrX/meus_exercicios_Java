package com.arthur.exercicios.estrutura_sequencial.ex06_areas_geometricas;
import java.util.Scanner;
import java.util.Locale;

public class CalculoAreasMultiplas {
    public static void main(String[] args) {

        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.

         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a, b, c, trianguloRetangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        trianguloRetangulo = (a * c) / 2;
        circulo = pi * Math.pow(c, 2);
        trapezio = (a + b) * c / 2;
        quadrado = Math.pow(b, 2);
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);





        sc.close();
    }
}
