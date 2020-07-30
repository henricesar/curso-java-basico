import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lista {
    private List<Integer> listaA;
    private List<Integer> listaB;

    public void dobraLista() throws IOException {
        listaA = new ArrayList<Integer>();
        listaB = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        int max = 8;
        System.out.println();
        System.out.println("Crie uma lista com 8 elementos para que seja dobrado o valor de seus elementos.");
        System.out.println("Só é permitido números inteiros.");
        System.out.println();

        for (int i = 1; i <= max; i++) {
            System.out.print("Digite o " + i + "º elemento da lista: ");
            listaA.add(entrada.nextInt());
            listaB.add(listaA.get(i-1)*2);

        }
        System.out.println();
        System.out.println("A lista original digitada foi: " + listaA);
        System.out.println("A lista dobrada é: " + listaB);
        System.out.println();
        System.out.print("Pressione ENTER para continuar...");
        System.in.read();

        listaA.clear();
        listaB.clear();
    }

    public void ordenaLista() throws IOException {
        listaA = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print("Digite a quantidade de números que deseja criar a lista: ");
        Integer qtdNumeros = entrada.nextInt();

        if(qtdNumeros < 1) {
            System.out.println();
            System.out.println("O número não pode ser menor que 1");
            System.out.println();
            System.out.print("Pressione ENTER para continuar...");
            System.in.read();
        }else {
            for (int i = 1; i <= qtdNumeros; i++) {
                System.out.print("Digite o " + i + "º numero: ");
                listaA.add(entrada.nextInt());
            }
            listaB = new ArrayList<Integer>(listaA);
            Collections.sort(listaB);
            System.out.println();
            System.out.println("A lista 'A' é: " + listaA);
            System.out.println("A lista 'B' ordenada é: " + listaB);
            System.out.println();
            System.out.print("Pressione ENTER para continuar...");
            System.in.read();

            listaA.clear();
            listaB.clear();
        }
    }
}


