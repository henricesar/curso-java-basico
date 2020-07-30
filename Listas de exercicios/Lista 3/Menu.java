import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private Scanner leitorDeVariaveis;

    public Integer apresentarMenu() throws IOException {

        Integer opcaoSelecionada = 0;

        Boolean devoApresentarMenu = true;

        while(devoApresentarMenu) {
            System.out.println("Menu de opções: ");
            System.out.println("(1) - Informar todos números inteiros entre dois números informados ");
            System.out.println("(2) - Mostrar o valor da soma de todos números do intervalo anterior");
            System.out.println("(3) - Taxa de crescimento");
            System.out.println("(4) - Validar entrada do ex anterior");
            System.out.println("(5) - Mostrar lista dobrada");
            System.out.println("(6) - Cálculo da sequência de Fibonacci");
            System.out.println("(7) - Cálculo de Fatorial");
            System.out.println("(8) - Ordenação de lista");
            System.out.println("(0) - Sair");
            System.out.println("========================");

            System.out.print("Selecione sua opção: ");
            leitorDeVariaveis = new Scanner(System.in);
            opcaoSelecionada = leitorDeVariaveis.nextInt();

            if (opcaoSelecionada != 1 && opcaoSelecionada != 2 && opcaoSelecionada != 3
                    && opcaoSelecionada != 4 && opcaoSelecionada != 5 && opcaoSelecionada != 6
                    && opcaoSelecionada != 7 && opcaoSelecionada != 8 && opcaoSelecionada != 0) {
                System.out.println();
                System.out.println("Opção Inválida....");
                System.out.println();
                System.out.print("Pressione ENTER para continuar...");
                System.in.read();
                devoApresentarMenu = true;
            } else {
                devoApresentarMenu = false;
            }
        }
        return opcaoSelecionada;
    }
}
