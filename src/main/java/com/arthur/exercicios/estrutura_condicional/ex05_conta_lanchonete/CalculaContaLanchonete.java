package com.arthur.exercicios.estrutura_condicional.ex05_conta_lanchonete;
import java.util.Scanner;
import java.util.Locale;

public class CalculaContaLanchonete {
    public static void main(String[] args) {
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.

        CODIGO | ESPECIFICAÇÃO   | PREÇO
        -------|-----------------|--------
        1      | Cachorro Quente | R$ 4.00
        2      | X-Salada        | R$ 4.50
        3      | X-Bacon         | R$ 5.00
        4      | Torrada simples | R$ 2.00
        5      | Refrigerante    | R$ 1.50
         */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f", total);


        sc.close();
    }
}
