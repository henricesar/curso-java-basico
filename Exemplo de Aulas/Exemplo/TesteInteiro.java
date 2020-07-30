import java.util.InputMismatchException;
import java.util.Scanner;

class TesteInteiro {

    public static void main(String[] args) {

        Scanner leitorDeVariaveis;

        boolean finalizouExecucao = false;

        while (!finalizouExecucao) {
            try {
                leitorDeVariaveis = new Scanner(System.in);

                escreverEPularLinha("Informe a opção desejada: ");
                escreverEPularLinha("--------------------------");
                escreverEPularLinha("(1) - Validar número maior");
                escreverEPularLinha("(2) - Validar data");
                escreverEPularLinha("(0) - Sair");
                escreverEPularLinha("--------------------------");
                escrever("Opção: ");

                Integer opcaoSelecionada = leitorDeVariaveis.nextInt();

                if (opcaoSelecionada == 0) {
                    finalizouExecucao = true;
                }
                if (opcaoSelecionada == 2) {
                    ValidarData validarData = new ValidarData();
                }

            } catch (InputMismatchException e) {
                escreverEPularLinha("Comando inválido");
                escreverEPularLinha("------------------");
            } catch (NumeroPositivoException e) {
                escreverEPularLinha("Você deveria digitar um número positivo");
            }
        }
    }
    
    
    public static void escreverEPularLinha(String mensagem) {
        System.out.println(mensagem);
    }

    public static void escrever(String mensagem) {
        System.out.print(mensagem);
    }

}