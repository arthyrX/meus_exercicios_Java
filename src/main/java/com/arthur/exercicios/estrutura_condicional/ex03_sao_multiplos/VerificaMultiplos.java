package com.arthur.exercicios.estrutura_condicional.ex03_sao_multiplos;
import java.util.Scanner;
public class VerificaMultiplos {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente.
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("São Múltiplos");
        }
        else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();
    }
}
