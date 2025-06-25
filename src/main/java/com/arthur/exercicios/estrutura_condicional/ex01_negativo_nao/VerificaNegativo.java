package com.arthur.exercicios.estrutura_condicional.ex01_negativo_nao;
import java.util.Scanner;

public class VerificaNegativo {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         */

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Não Negativo");
        }

        sc.close();
    }
}
