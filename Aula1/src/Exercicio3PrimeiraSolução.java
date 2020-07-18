import java.util.Scanner;

public class Exercicio3PrimeiraSolução {

    public static void main(String[] args) {

        int primeiroNumero, segundoNumero, terceiroNumero, numeroMaior, numeroMenor;

        try{
            Scanner entrada = new Scanner(System.in);

            System.out.println("*** PROGRAMA PARA MOSTRAR O MAIOR E MENOR NÚMERO DE UM CONJUNTO DE 3 NÚMEROS INTEIROS ***\n");
            System.out.print("Entre com o primeiro número: ");
            primeiroNumero = entrada.nextInt();

            System.out.print("Entre com o segundo número: ");
            segundoNumero = entrada.nextInt();

            System.out.print("Entre com o terceiro número: ");
            terceiroNumero = entrada.nextInt();

            System.out.println();

            numeroMaior = maior(primeiroNumero, segundoNumero,terceiroNumero);
            numeroMenor = menor(primeiroNumero, segundoNumero,terceiroNumero);

            if(numeroMaior == numeroMenor){
                System.out.println("Os números digitados são iguais, e seu valor é: " + numeroMaior);
            }
            else {
                System.out.println("O maior número é: " + numeroMaior);
                System.out.println("O menor número é: " + numeroMenor);
            }

        } catch (Exception e){
            System.out.println("\nA entrada digitada não é um número válido");
        }
    }

    public static int maior(int num1, int num2, int num3){
        if(num1 >= num2 && num1 >= num3 ) {
            return num1;
        }
        else {
            if(num2 >= num1 && num2 >= num3){
                return num2;
            }
            else{
                return num3;
            }
        }
    }

    public static int menor(int num1, int num2, int num3){
        if(num1 <= num2 && num1 <= num3 ) {
            return num1;
        }
        else {
            if(num2 <= num1 && num2 <= num3){
                return num2;
            }
            else{
                return num3;
            }
        }
    }
}
