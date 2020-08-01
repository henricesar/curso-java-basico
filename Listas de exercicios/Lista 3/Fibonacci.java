import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {

   public void calculaFibonacci() throws IOException {


       int numeroAuxiliar1 = 1;
       int numeroAuxiliar2 = 1;
       int resultado = numeroAuxiliar1 + numeroAuxiliar2;

       Scanner entrada = new Scanner (System.in);

       System.out.println();
       System.out.print("Digite um número máximo inteiro não negativo para cálculo da série de Fibonacci: ");
       int numero = entrada.nextInt();
       System.out.println();

       if(numero < 0){
           System.out.println("O número informado deverá ser maior ou igual a 0.");
           System.out.println();
           System.out.print("Pressione ENTER para continuar...");
           System.in.read();
       }
       else {
           System.out.println("O resultado da série de Fibonacci é:");
           System.out.println();
           System.out.print("0, " + numeroAuxiliar1 + ", " + numeroAuxiliar2);

           while(resultado < numero){
               resultado = numeroAuxiliar1 + numeroAuxiliar2;
               System.out.print(", " + resultado);
               numeroAuxiliar1 = numeroAuxiliar2;
               numeroAuxiliar2 = resultado;
           }
           System.out.println();
           System.out.println();
           System.out.print("Pressione ENTER para continuar...");
           System.in.read();
       }
   }
}

