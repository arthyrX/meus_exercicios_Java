package com.arthur.exercicios.estrutura_condicional.ex02_par_ou_impar;
import java.util.Scanner;

public class VerificaParImpar {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
         */

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Par");
        }
        else{
            System.out.println("Ímpar");
        }

        sc.close();
    }
}
