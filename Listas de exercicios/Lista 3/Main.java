import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Integer opcaoSelecionada = -1;

        IntervaloNumeros numeros =  new IntervaloNumeros();
        Populacao populacao =  new Populacao();
        Lista lista = new Lista();
        Fibonacci fibonacci = new Fibonacci();
        Fatorial fatorial = new Fatorial();

        while(opcaoSelecionada != 0) {
            try {
                opcaoSelecionada = menu.apresentarMenu();

                switch (opcaoSelecionada) {
                    case 1:
                        numeros.imprimeLista();
                        break;
                    case 2:
                        numeros.somaLista();
                        break;
                    case 3:
                        populacao.calculoFixoPopulacao();
                        break;
                    case 4:
                        populacao.calculoPopulacao();
                        break;
                    case 5:
                        lista.dobraLista();
                        break;
                    case 6:
                        fibonacci.calculaFibonacci();
                        break;
                    case 7:
                        fatorial.calculoFatorial();
                        break;
                    case 8:
                        lista.ordenaLista();
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println();
                System.out.println("!!!ERRO!!!");
                System.out.println("===============");
                System.out.println("Por favor, entrar com um número inteiro");
                System.out.println();
                System.out.print("Pressione ENTER para continuar...");
                System.in.read();

            }
        }
    }
}
