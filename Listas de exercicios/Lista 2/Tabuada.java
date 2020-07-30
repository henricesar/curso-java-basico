import java.util.Scanner;

public class Tabuada {

    private Scanner leitorDeVariaveis;

    public void calcularTabuadaSolicitandoNumero() {
        leitorDeVariaveis = new Scanner(System.in);
        System.out.println();
        System.out.print("Informe o número que deseja calcular a tabuada: ");
        Integer numeroInformado = leitorDeVariaveis.nextInt();
        calcularTabuada(numeroInformado);
    }

    public void calcularTabuada(Integer numeroInformado) {
        Integer resultado;
        System.out.println();
        for (int multiplicador = 1; multiplicador<=10; multiplicador++) {
            resultado = numeroInformado * multiplicador;
            System.out.println(numeroInformado + " x " + multiplicador + " = " + resultado);
        }
        System.out.println();
    }

}
