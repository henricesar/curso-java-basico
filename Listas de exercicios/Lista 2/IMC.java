import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

    private double altura;
    private double peso;

    private String arredondar(double valor){
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(valor);
    }

    private double imc(){
        return (this.peso / (Math.pow(this.altura, 2)));
    }

    public void calculaIMC(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print("Informe a altura, utilizando a vírgula para a separação dos decimais: ");
        this.altura = entrada.nextDouble();

        System.out.print("Informe o peso, utilizando a vírgula para a separação dos decimais: ");
        this.peso = entrada.nextDouble();
        System.out.println();

        if(imc() < 18.5) {
            System.out.println("RESULTADO");
            System.out.println("===========");
            System.out.println("Seu IMC é " + arredondar(imc()) + ". Você está abaixo do peso.");
        }
        else
            if(imc() >= 18.5 && imc() < 25) {
                System.out.println("RESULTADO");
                System.out.println("===========");
                System.out.println("Seu IMC é " + arredondar(imc()) + ". Você está com o peso adequado.");
            }
            else
                if(imc() >= 25 && imc() < 30) {
                    System.out.println("RESULTADO");
                    System.out.println("===========");
                    System.out.println("Seu IMC é " + arredondar(imc()) + ".Você está com sobrepeso.");
                }
                else
                    if(imc() > 30) {
                        System.out.println("RESULTADO");
                        System.out.println("===========");
                        System.out.println("Seu IMC é " + arredondar(imc()) + ".Tome cuidado isso já é obesidade.");
                    }
        System.out.println();
    }
}
