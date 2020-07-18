import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Integer opcaoSelecionada = -1;






        while(opcaoSelecionada != 0) {
            try {
                opcaoSelecionada = menu.apresentarMenu();

                switch (opcaoSelecionada) {
                    case 1:
                        Comparador numeros  = new Comparador();
                        numeros.comparaValoresInteiros();
                        break;
                    case 2:
                        Idade idade = new Idade();
                        idade.verificaIdade();
                        break;
                    case 3:
                        Aniversario data = new Aniversario();
                        data.validaData();
                        break;
                    case 4:
                        Tabuada tabuada = new Tabuada();
                        tabuada.calcularTabuadaSolicitandoNumero();
                        break;
                    case 5:
                        IMC imc = new IMC();
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
