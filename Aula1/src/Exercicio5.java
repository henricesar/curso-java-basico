import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        int dia, mes, ano;
        boolean dataCerta = true;

        try{
            Scanner entrada = new Scanner(System.in);

            System.out.println("*** PROGRAMA DATA DE ANIVERSÁRIO***\n");
            System.out.print("Entre com o dia de seu aniversário: ");
            dia = entrada.nextInt();

            System.out.print("Entre com o mês de seu aniversário: ");
            mes = entrada.nextInt();

            System.out.print("Entre com o ano de seu aniversário com 4 digitos (menor ano permitido 1820): ");
            ano = entrada.nextInt();

            if(dia < 1 || dia > 31) {
                System.out.println("\nData inválida, o dia digitado está fora da faixa (1 até 31)");
                dataCerta = false;
            }
            if (mes < 1 || mes > 12) {
                System.out.println("\nData inválida, o mês digitado está fora da faixa (1 até 12)");
                dataCerta = false;
            }
            if (ano < 1820 || ano > 2020){
                System.out.println("\nData inválida, o ano digitado está fora da faixa (1820 até 2020)");
                dataCerta = false;
            }
            if (ano == 2020 && mes >= 7){
                System.out.println("\nData inválida, neste ano só está sendo computada datas até o mês 6");
                dataCerta = false;
            }
            if(dataCerta)
                System.out.println("\nSua data de aniversário está válida e é em " + dia + "/" + mes + "/" + ano);

        }catch (Exception e){
            System.out.println("\nENTRADA ICORRETA. Por favor, entre com um número inteiro sem vírgulas ou pontos.");
        }
    }
}
