import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {

   public void calculaFibonacci() throws IOException {

       int numero,numeroAuxiliar3;
       int numeroAuxiliar1 = 0;
       int numeroAuxiliar2 = 1;
       Scanner entrada = new Scanner (System.in);

       System.out.println();
       System.out.print("Digite um número inteiro não negativo para cálculo da série de Fibonacci: ");
       numero = entrada.nextInt();
       System.out.println();
       if(numero < 0){
           System.out.println("O número informado deverá ser maior ou igual a 0.");
           System.out.println();
           System.out.print("Pressione ENTER para continuar...");
           System.in.read();
       }
       else {
           numeroAuxiliar1 = 0;
           numeroAuxiliar2 = 1;
           System.out.println("Segue abaixo o resultado da série de Fibonacci do número " + numero);

           if (numero == 0) {
               System.out.println(numeroAuxiliar1);
               System.out.println();
               System.out.print("Pressione ENTER para continuar...");
               System.in.read();
           }
           else {
               if (numero == 1) {
                   System.out.println(numeroAuxiliar1 + ", " + numeroAuxiliar2);
                   System.out.println();
                   System.out.print("Pressione ENTER para continuar...");
                   System.in.read();
               }
               else {
                   for (int i = 2; i <= numero; i++) {
                       numeroAuxiliar3 = numeroAuxiliar1 + numeroAuxiliar2;
                       System.out.print(numeroAuxiliar1 + ", ");
                       numeroAuxiliar1 = numeroAuxiliar2;
                       numeroAuxiliar2 = numeroAuxiliar3;
                   }
                   System.out.println(numeroAuxiliar2);
                   System.out.println();
                   System.out.print("Pressione ENTER para continuar...");
                   System.in.read();
               }
           }
       }
   }
}

