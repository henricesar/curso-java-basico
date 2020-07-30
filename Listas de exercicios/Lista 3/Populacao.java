import java.io.IOException;
import java.util.Scanner;

public class Populacao {

    private int populacaoA;
    private int populacaoB;
    private float crescimentoA;
    private float crescimentoB;


    public void calculoFixoPopulacao() throws IOException {
        int anos = 1;

        while(80000 * Math.pow(1.03, anos) <= 200000 * Math.pow(1.015, anos)){
            anos++;
        }
        System.out.println();
        System.out.println("Este método exibe um cálculo fixo de quanto tempo levará para a população da cidade 'A' ultrapassar a\n" +
                "cidade 'B'. Para isto foi utilizado os seguintes parâmetros:\n\n" +
                "População da cidade A: 80000\n" +
                "Taxa de crescimento da população da cidade A: 3% ao ano\n\n" +
                "População da cidade B: 220000\n" +
                "Taxa de crescimento da população da cidade A: 1,5% ao ano\n");
        System.out.println("A população da cidade A levará " + anos + " anos para ultrapassar a população da cidade B");
        System.out.println();
        System.out.print("Pressione ENTER para continuar...");
        System.in.read();

    }

    public void calculoPopulacao() throws IOException {
        int anos = 1;
        float txCresimentoA, txCrescimentoB;

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print("Por favor, entre com a população da cidade 'A': ");
        this.populacaoA = entrada.nextInt();

        System.out.print("Por favor, entre com a taxa de crescimento anual da população da cidade 'A' em porcentagem, " +
                "usando a vírgula como separador: ");
        this.crescimentoA = entrada.nextFloat();
        txCresimentoA = convertePorcentagem(this.crescimentoA);

        System.out.println();

        System.out.print("Por favor, entre com a população da cidade 'B': ");
        this.populacaoB = entrada.nextInt();

        System.out.print("Por favor, entre com a taxa de crescimento anual da população da cidade 'B'em porcentagem, "  +
                "usando a vírgula como separador: ");
        this.crescimentoB = entrada.nextFloat();
        txCrescimentoB = convertePorcentagem(this.crescimentoB);

        System.out.println();

        if(this.populacaoA >= this.populacaoB) {
            System.out.println("A população 'A' deverá ser menor que a população de 'B'");
            System.out.println();
            System.out.print("Pressione ENTER para continuar...");
            System.in.read();
        }
        else
            if(this.crescimentoA <= this.crescimentoB){
                System.out.println("A taxa de crescimento da população 'A' deverá ser maior que a da população de 'B'");
                System.out.println();
                System.out.print("Pressione ENTER para continuar...");
                System.in.read();
            }
            else {
                while (populacaoA * Math.pow(txCresimentoA, anos) <= populacaoB * Math.pow(txCrescimentoB, anos)) {
                    anos++;
                }
                System.out.println();
                System.out.println("A população da cidade A levará " + anos + " anos para ultrapassar a população da cidade B");
                System.out.println();
                System.out.print("Pressione ENTER para continuar...");
                System.in.read();
            }
    }
    private float convertePorcentagem(float taxaCrescimento){
        return 1 + (taxaCrescimento / 100);
    }
}
