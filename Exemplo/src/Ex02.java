import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        /*
         *
         * Programa para calcular quantos anos a pessoa tem
         *
         * */

        /*
         * Integer -> Númerico inteiro
         * Double  -> Númerico decimais
         * String  -> Texto
         * */

        /*
         * Operadores:
         *   + -> Soma
         *   / -> Dividir
         *   * -> Multiplicação
         *   - -> Subtração
         * */

        /**
         *
         * */

        Scanner leitorDeVariaveis = new Scanner(System.in);

        Integer anoNascimento;
        Integer anoAtual;

        Integer idade;

        System.out.print("Informe seu ano de nascimento: ");
        anoNascimento = leitorDeVariaveis.nextInt();
        anoAtual = 2020;

        idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade);

        //--- Se idade maior ou igual 18
        if (idade > 18) {
            System.out.println("Você é adulto");
        } else {
            if (idade >= 14) {
                System.out.println("Você é aborrecente");
            } else {
                System.out.println("Você é uma criança");
            }
        }

        /*
        * Condições && -> E
        *           || -> Ou
        *            > -> maior
        *            < -> menor
        *           >= -> maior ou igual
        *           <= -> menor ou igual
        *           != -> diferente
        *            ! -> Não
        * */
//        if (idade >= 14 && idade <= 17) {
//            System.out.println("Você é aborrecente");
//        }
//
//        if (idade < 5 || idade > 10) {
//            System.out.println("Entrou no IF");
//        }

    }

}
