package com.arthur.exercicios.estrutura_sequencial.ex05_valor_pecas;
import java.util.Scanner;
import java.util.Locale;

public class CalculoValorPecas {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int peca1Codigo, peca2Codigo;
        int peca1Unidade, peca2Unidade;
        double peca1Preco, peca2Preco;

        peca1Codigo = sc.nextInt();
        peca1Unidade = sc.nextInt();
        peca1Preco = sc.nextDouble();

        peca2Codigo = sc.nextInt();
        peca2Unidade = sc.nextInt();
        peca2Preco = sc.nextDouble();

        double valorAPagar = (peca1Unidade * peca1Preco) + (peca2Unidade * peca2Preco);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorAPagar);

        sc.close();
    }
}
