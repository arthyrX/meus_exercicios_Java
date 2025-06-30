package com.arthur.exercicios.estruturas_repetitivas.estrutura_enquanto.ex03_posto_combustivel;
import java.util.Scanner;

public class ControlePostoCombustivel {
    public static void main(String[] args) {
        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.
         */

        Scanner sc = new Scanner(System.in);

        int combustivel = sc.nextInt();
        int somaAlcool = 0;
        int somaGassolina = 0;
        int somaDiesel = 0;

        while (combustivel != 4){
            switch (combustivel){
                case 1:
                    somaAlcool += 1;
                    break;
                case 2:
                    somaGassolina += 1;
                    break;
                case 3:
                    somaDiesel += 1;
                    break;
            }

            combustivel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", somaAlcool);
        System.out.printf("Gassolina: %d\n", somaGassolina);
        System.out.printf("Diesel: %d\n", somaDiesel);


        sc.close();
    }
}
