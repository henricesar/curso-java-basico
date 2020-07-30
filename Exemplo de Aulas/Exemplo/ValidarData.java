import java.util.Scanner;

public class ValidarData {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public ValidarData() {
        Scanner leitorDeVariaveis = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        this.dia = leitorDeVariaveis.nextInt();
        validaNumeroPositivo(this.dia);

        System.out.println("");
        System.out.print("Informe o mês: ");
        this.mes = leitorDeVariaveis.nextInt();;
        validaNumeroPositivo(this.mes);

        System.out.println("");
        System.out.print("Informe o ano: ");
        this.ano = leitorDeVariaveis.nextInt();
        validaNumeroPositivo(this.ano);
    }

    private void validaNumeroPositivo(Integer numero) {
        if (numero < 0)
            throw new NumeroPositivoException();
    }

    public ValidarData(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean verificarDataValida() {
        return false;
    }

}
