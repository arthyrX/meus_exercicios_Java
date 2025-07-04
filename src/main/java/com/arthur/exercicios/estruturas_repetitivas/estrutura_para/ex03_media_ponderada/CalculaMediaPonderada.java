package com.arthur.exercicios.estruturas_repetitivas.estrutura_para.ex03_media_ponderada;
import java.util.Scanner;
import java.util.Locale;

public class CalculaMediaPonderada {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        peso 5.
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double mediaPonderada = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f\n", mediaPonderada);
        }

        sc.close();
    }
}
