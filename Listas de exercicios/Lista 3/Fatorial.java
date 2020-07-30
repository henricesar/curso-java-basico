import java.io.IOException;
import java.util.Scanner;

public class Fatorial {

    public void calculoFatorial() throws IOException {
        int numero;
        double fatorial;
        Scanner entrada = new Scanner (System.in);
        System.out.println();
        System.out.print("Digite o número para cálculo do fatorial: ");
        numero = entrada.nextInt();
        if(numero < 0){
            System.out.println();
            System.out.println("O número informado deverá ser maior ou igual a 0.");
            System.out.println();
            System.out.print("Pressione ENTER para continuar...");
            System.in.read();
        }
        else {
            System.out.println();
            System.out.print(numero + "! = ");
            fatorial = numero;

            if (numero == 0 || numero == 1) {
                fatorial = 1;
                System.out.println(fatorial);
                System.out.println();
                System.out.print("Pressione ENTER para continuar...");
                System.in.read();
            }
            else {
                while (numero > 1) {
                    fatorial = fatorial * (numero - 1);
                    if (numero == 1)
                        System.out.print("=");
                    System.out.print(numero + " * ");
                    numero -= 1;
                }
                System.out.println(numero + " = " + fatorial);
                System.out.println();
                System.out.print("Pressione ENTER para continuar...");
                System.in.read();
            }
        }
    }
}
