public class Teste {

    public static void main(String[] args) {

        /*
        *
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

        // Aqui está criando uma váriavel númerico inteiro
        Double nomeQualquerVariavel;

        nomeQualquerVariavel = 10.0 - 2.0;

        System.out.println(nomeQualquerVariavel);

        //--- Declaração de variável -> Tipo NomeVariavel
         String variavelTexto;

         //--- Texto sempre vai dentro de aspas "texto aqui"
         variavelTexto = "Olá Mundo";
         System.out.println(variavelTexto);

         variavelTexto = "A minha variavel nomeQualquerVariavel vale: " + nomeQualquerVariavel;
         System.out.println(variavelTexto);

    }
}
