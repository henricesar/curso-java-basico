import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        
        Scanner leitorDeVariaveis = new Scanner(System.in);

        Integer idade;        

        System.out.println("Qual a sua idade ?!! ");
        idade = leitorDeVariaveis.nextInt();

        if(idade >= 18 && idade <= 67){
            System.out.println("Parabens voce pode doar sengue");
        } else {
            System.out.println("Infelizmente voce nao pode doar sangue");
        }

        leitorDeVariaveis.close();

    }
    
}