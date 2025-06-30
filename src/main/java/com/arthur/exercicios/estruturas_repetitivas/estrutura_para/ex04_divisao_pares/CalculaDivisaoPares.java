package com.arthur.exercicios.estruturas_repetitivas.estrutura_para.ex04_divisao_pares;
import java.util.Scanner;
import java.util.Locale;

public class CalculaDivisaoPares {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();


            if (denominador == 0){
                System.out.println("divisao impossivel");
            }
            else {
                double divisao = (double) numerador / denominador;
                System.out.printf("%.1f\n", divisao);
            }
        }

        sc.close();
    }
}
