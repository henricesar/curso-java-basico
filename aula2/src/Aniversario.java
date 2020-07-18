import java.util.Scanner;

public class Aniversario {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Aniversario() {
        Scanner leitorDeVariaveis = new Scanner(System.in);
        System.out.println();
        System.out.print("Informe o dia: ");
        this.dia = leitorDeVariaveis.nextInt();
        //validaDia(this.dia);

        System.out.print("Informe o mês: ");
        this.mes = leitorDeVariaveis.nextInt();
        //validaMes(this.mes);

        System.out.print("Informe o ano: ");
        this.ano = leitorDeVariaveis.nextInt();
        //validaAno(this.ano);
    }
    public void validaData(){
        boolean dataCerta = true;
        if(dia < 1 || dia > 31) {
            System.out.println();
            System.out.println("!!!AVISO!!!");
            System.out.println("===============");
            System.out.println("Data inválida, o dia digitado está fora da faixa (1 até 31)");
            System.out.println();
            dataCerta = false;
        }
        if (mes < 1 || mes > 12) {
            System.out.println();
            System.out.println("!!!AVISO!!!");
            System.out.println("===============");
            System.out.println("Data inválida, o mês digitado está fora da faixa (1 até 12)");
            System.out.println();
            dataCerta = false;
        }
        if (ano < 1820 || ano > 2020){
            System.out.println();
            System.out.println("!!!AVISO!!!");
            System.out.println("===============");
            System.out.println("\nData inválida, o ano digitado está fora da faixa (1820 até 2020)");
            System.out.println();
            dataCerta = false;
        }
        if (ano == 2020 && mes >= 7){
            System.out.println();
            System.out.println("!!!AVISO!!!");
            System.out.println("===============");
            System.out.println("\nData inválida, neste ano só está sendo computada datas até o mês 6");
            System.out.println();
            dataCerta = false;
        }
        if(dataCerta) {
            System.out.println();
            System.out.println("RESULTADO");
            System.out.println("===========");
            System.out.println("\nSua data de aniversário está válida e é em " + dia + "/" + mes + "/" + ano);
            System.out.println();
        }
    }
}
