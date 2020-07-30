import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntervaloNumeros {
    private Integer numero1, numero2;

    public List<Integer> ListaNumeros() {
        Scanner entrada = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();

        System.out.println();
        System.out.print("Entre com o primeiro número: ");
        this.numero1 = entrada.nextInt();

        System.out.print("Entre com o segundo número: ");
        this.numero2 = entrada.nextInt();

        if (this.numero1 == this.numero2)
            numeros = Collections.emptyList();
        else if (this.numero1 < this.numero2)
            for (int i = this.numero1 + 1; i < this.numero2; i++)
                numeros.add(i);
        else
            for (int i = this.numero2 + 1; i < this.numero1; i++)
                numeros.add(i);
        return numeros;
    }

    public void imprimeLista() throws IOException {
        List<Integer> lista = ListaNumeros();
        System.out.println();

        if(lista.isEmpty())
            System.out.println("Os números digitados são iguais, portanto não há um intervalo de números para este caso.");
        else {
            System.out.println("A lista de números contida entre os números " + this.numero1 + " e " + this.numero2 + " é ");
            System.out.println(lista);
        }
        System.out.println();
        System.out.print("Pressione ENTER para continuar...");
        System.in.read();
    }

    public void somaLista() throws IOException {
        List<Integer> lista = ListaNumeros();
        int soma = 0;

        for (Integer integer:lista) {
            soma += integer;
        }
        System.out.println();
        System.out.println("A soma dos números contidos entre " + this.numero1 + " e " + this.numero2 + " é " + soma);
        System.out.println();
        System.out.print("Pressione ENTER para continuar...");
        System.in.read();
    }

}


