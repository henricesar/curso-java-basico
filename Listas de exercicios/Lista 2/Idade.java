import java.sql.SQLOutput;
import java.util.Scanner;

public class Idade {
    int idade;

    public void verificaIdade(){
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite a idade para doação de sangue: ");
        idade = entrada.nextInt();

        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("===========");

        if (idade >= 18 && idade <= 67)
            System.out.println("Você pode doar sangue");
        else
            System.out.println("Você está fora da faixa etária para doar sangue");
        System.out.println();
    }
}
