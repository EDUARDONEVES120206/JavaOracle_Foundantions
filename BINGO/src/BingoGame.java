import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BingoGame {

    static int MAX_NUMEROS = 60;
    static int MAX_SORTEIOS = 20;

    public static void main(String[] args) {
        int[] numerosSorteados = new int[MAX_SORTEIOS];
        int numSorteadosCount = 0;
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.print("Escolha uma opção: \n");
            System.out.println("1. Sortear pedra");
            System.out.println("2. Encerrar programa");

            int opcao = entrada.nextInt();

            switch (opcao) {
            case 1:
                if (numSorteadosCount < MAX_SORTEIOS) {
                    int numero = sortearNumero(random, numerosSorteados, numSorteadosCount);
                    numerosSorteados[numSorteadosCount++] = numero;
                    System.out.println("Número sorteado: " + numero);
                    System.out.println(numerosSorteados(numerosSorteados, numSorteadosCount));
                } else {
                    System.out.println("Já foram sorteados " + MAX_SORTEIOS + " números. O jogo terminou.");
                    return;
                }
                break;
            case 2:
                System.out.println("Encerrando o programa, obrigado por jogar.");
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static int sortearNumero(Random random, int[] numerosSorteados, int count) {
        int numero;
        do {
            numero = random.nextInt(MAX_NUMEROS) + 1;
        } while (foiSorteado(numerosSorteados, count, numero));
        return numero;
    }

    public static boolean foiSorteado(int[] numerosSorteados, int count, int numero) {
        for (int i = 0; i < count; i++) {
            if (numerosSorteados[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static String numerosSorteados(int[] numerosSorteados, int count) {
        int[] sortedNumeros = Arrays.copyOf(numerosSorteados, count);
        ordenarArray(sortedNumeros);

        StringBuilder sb = new StringBuilder();
        sb.append("Números Sorteados: ");

        for (int i = 0; i < count; i++) {
            sb.append(sortedNumeros[i] + " ");
        }

        return sb.toString();
    }

    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }
}
