import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int idade;

        try {
            Scanner entrada = new Scanner(System.in);

            System.out.println("*** PROGRAMA PARA MOSTRAR SE UMA PESSOA PODE DOAR SANGUE ***\n");
            System.out.print("Digite a idade para doação de sangue: ");
            idade = entrada.nextInt();

            System.out.println();

            if (idade >= 18 && idade <= 67)
                System.out.println("Você pode doar sangue");
            else
                System.out.println("Você está fora da faixa etária para doar sangue");
        }   catch (Exception e) {
            System.out.println("\nA entrada digitada não é um número inteiro");
        }
    }
}
