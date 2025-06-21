package com.arthur.exercicios.estrutura_sequencial.ex04_salario_funcionario;
import java.util.Scanner;
import java.util.Locale;

public class CalculoSalario {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroFuncionario;
        int horasTrabalhadas;
        double salarioPorHora;
        double salario;

        numeroFuncionario = sc.nextInt();
        sc.nextLine();
        horasTrabalhadas = sc.nextInt();
        sc.nextLine();
        salarioPorHora = sc.nextDouble();

        salario = salarioPorHora * horasTrabalhadas;
        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY =  U$ %.2f\n", salario);

        sc.close();

    }
}
