import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio3SegundaSolucao {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Integer numeroMaior, numeroMenor;

        try{
            Scanner entrada = new Scanner(System.in);

            System.out.println("*** PROGRAMA PARA MOSTRAR O MAIOR E MENOR NÚMERO DE UM CONJUNTO DE 3 NÚMEROS INTEIROS ***\n");
            System.out.print("Entre com o primeiro número: ");
            numeros.add(entrada.nextInt());

            System.out.print("Entre com o segundo número: ");
            numeros.add(entrada.nextInt());

            System.out.print("Entre com o terceiro número: ");
            numeros.add(entrada.nextInt());

            System.out.println();

            numeroMaior = Collections.max(numeros);
            numeroMenor = Collections.min(numeros);

            if(numeroMaior == numeroMenor){
                System.out.println("Os números digitados são iguais, e seu valor é: " + numeroMaior);
            }
            else{
                System.out.println("O maior número é: " + numeroMaior);
                System.out.println("O menor número é: " + numeroMenor);
            }
        }catch (Exception e){
            System.out.println("\nA entrada digitada não é um número válido");
        }
    }
}
