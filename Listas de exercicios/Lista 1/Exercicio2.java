/***********************************************************************************************************
 * Este programa recebe dois números do tipo primitivo double e devolve qual o maior e o menor deles.      *
 * No caso dos números digitados serem iguais o programa informa este evento e o valor do número digitado. *
 * Se o valor digitado na entrada não for válido o programa informa o usuário.                             *
 **********************************************************************************************************/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        try {
                Scanner entrada = new Scanner(System.in);

                System.out.println("*** PROGRAMA QUE RECEBE DOIS NÚMEROS E DEVOLVE QUAL O MAIOR E O MENOR ***\n");
                System.out.print("Entre com o primeiro número: ");

                double primeiroNumero = entrada.nextDouble();
                System.out.print("Entre com o segundo número: ");

                double segundoNumero = entrada.nextDouble();
                System.out.println();

            if (primeiroNumero > segundoNumero) {
                System.out.println("MAIOR NÚMERO --> " + primeiroNumero);
                System.out.println("MENOR NÚMERO --> " + segundoNumero);
            } else if (primeiroNumero < segundoNumero) {
                System.out.println("MAIOR NÚMERO --> " + segundoNumero);
                System.out.println("MENOR NÚMERO --> " + primeiroNumero);
            } else
                System.out.println("OS DOIS NÚMEROS SÃO ÍGUAIS --> " + segundoNumero);

        } catch (Exception e) {
                System.out.println("\nA entrada digitada não é um número válido");
            }
    }
}
