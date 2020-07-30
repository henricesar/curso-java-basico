import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Integer opcaoSelecionada = -1;

        Comparador numeros  = new Comparador();
        Idade idade = new Idade();
        Aniversario data = new Aniversario();
        Tabuada tabuada = new Tabuada();
        IMC imc = new IMC();

        while(opcaoSelecionada != 0) {
            try {
                opcaoSelecionada = menu.apresentarMenu();

                switch (opcaoSelecionada) {
                    case 1:
                        numeros.comparaValoresInteiros();
                        break;
                    case 2:
                        idade.verificaIdade();
                        break;
                    case 3:
                        data.validaData();
                        break;
                    case 4:
                        tabuada.calcularTabuadaSolicitandoNumero();
                        break;
                    case 5:
                        imc.calculaIMC();
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println();
                System.out.println("!!!ERRO!!!");
                System.out.println("===============");
                System.out.println("Por favor, entrar com um número inteiro");
                System.out.println();
            }
        }
    }
}
