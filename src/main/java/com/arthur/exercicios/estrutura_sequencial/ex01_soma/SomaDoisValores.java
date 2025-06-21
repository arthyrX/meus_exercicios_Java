package com.arthur.exercicios.estrutura_sequencial.ex01_soma;

import java.util.Scanner;

public class SomaDoisValores {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        */

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();
        int soma = a + b;

        System.out.printf("SOMA = %d", soma);

        sc.close();

    }
}
