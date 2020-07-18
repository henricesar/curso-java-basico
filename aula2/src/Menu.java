import java.util.Scanner;

public class Menu {

    private Scanner leitorDeVariaveis;

    public Integer apresentarMenu(){

        Integer opcaoSelecionada = 0;

        Boolean devoApresentarMenu = true;

        while(devoApresentarMenu) {
            System.out.println("Menu de opções: ");
            System.out.println("(1) - Comparar o maior e menor valor entre os números informados");
            System.out.println("(2) - Verificação de idade para doação de sangue");
            System.out.println("(3) - Validar data de aniversário");
            System.out.println("(4) - Calcular tabuada");
            System.out.println("(5) - Calcular IMC");
            System.out.println("(0) - Sair");
            System.out.println("========================");

            System.out.print("Selecione sua opção: ");
            leitorDeVariaveis = new Scanner(System.in);
            opcaoSelecionada = leitorDeVariaveis.nextInt();

            if (opcaoSelecionada != 1 && opcaoSelecionada != 2 && opcaoSelecionada != 3
                    && opcaoSelecionada != 4 && opcaoSelecionada != 5 && opcaoSelecionada != 0) {
                System.out.println();
                System.out.println("Opção Inválida....");
                System.out.println();
                devoApresentarMenu = true;
            } else {
                devoApresentarMenu = false;
            }
        }
        return opcaoSelecionada;
    }
}
