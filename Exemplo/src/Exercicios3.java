import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        
        Scanner leitorDeVariaveis = new Scanner(System.in);

        Integer primeiro;
        Integer segundo;
        Integer terceiro;
        Integer maior;
        Integer menor;

        System.out.println("Informe o primeiro numero");
        primeiro = leitorDeVariaveis.nextInt();
        System.out.println("Informe o segundo numero");
        segundo = leitorDeVariaveis.nextInt();
        System.out.println("Informe o terceiro numero");
        terceiro = leitorDeVariaveis.nextInt();

        maior = Math.max(primeiro,segundo);
        System.out.println("O maior numero é o " + maior);

        menor = Math.min(primeiro,segundo);
        menor = Math.min(menor,terceiro);
        System.out.println("O menor numero é o " + menor);





    }
    
}