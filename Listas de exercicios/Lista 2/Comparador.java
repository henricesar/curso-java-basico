import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Comparador {

    private List<Integer> numeros = new ArrayList<Integer>();

    public void comparaValoresInteiros(){
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite a quantidade de números que deseja comparar: ");
        int qtdNumeros = entrada.nextInt();
        if(qtdNumeros < 2) {
            System.out.println();
            System.out.println("O número não pode ser menor que 2");
            System.out.println();
        }else {
            for (int i = 1; i <= qtdNumeros; i++) {
                System.out.print("Digite o " + i + "º numero: ");
                numeros.add(entrada.nextInt());
            }
            System.out.println();
            System.out.println("RESULTADO");
            System.out.println("==========");

            if (verificaIgualdade())
                System.out.println("Os números informados são iguais e o valor é: " + this.numeros.get(0));
            else {
                System.out.println("O maior número digitado é: " + verificaMaior());
                System.out.println("O menor número digitado é: " + verificaMenor());
            }
            System.out.println();
            numeros.clear();

            System.out.println("A lista original é: " + numeros);
            System.out.println();
            //System.out.println("A lista invertida é: " + Collections.reverse(numeros));
        }
    }

    private Integer verificaMaior() {
        return Collections.max(this.numeros);
    }

    private Integer verificaMenor(){
        return Collections.min(this.numeros);
    }

    private boolean verificaIgualdade(){
        if (verificaMaior() == verificaMenor())
            return true;
        else
            return false;
    }
}
