

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class principal {
    public static void main(String[] args) {
        ArrayList<Integer> randNumeros = new ArrayList<>();
        Random random = new Random();
        
        while (randNumeros.size() < 4) {
            int numero = random.nextInt(60) + 1;
            if (!randNumeros.contains(numero)) {
                randNumeros.add(numero);
            }
        }

        System.out.println("Números sorteados (para teste): " + randNumeros);

        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> userNumeros = new ArrayList<>();
        int tentativas = 0;

        while (tentativas < 20) {
            System.out.println("Insira um número entre 1 e 60 ou digite 'encerrar' para sair:");
            String input = entrada.nextLine();

            if (input.equalsIgnoreCase("encerrar")) {
                System.out.println("Obrigado por jogar!");
                break;
            }

            try {
                int numero = Integer.parseInt(input);
                if (numero > 0 && numero <= 60 && !userNumeros.contains(numero)) {
                    userNumeros.add(numero);
                    tentativas++;

                    int acertos = 0;
                    for (int num : userNumeros) {
                        if (randNumeros.contains(num)) {
                            acertos++;
                        }
                    }

                    if (acertos == 4) {
                        System.out.println("BINGO!!! \n Você acertou todos os 4 números!");
                        break;
                    } else {
                        System.out.println("Você acertou " + acertos + " números. Faltam " + (4 - acertos) + " para o BINGO!");
                    }
                } else {
                    System.out.println("Número inválido ou repetido. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número entre 1 e 60.");
            }

            if (tentativas == 20) {
                System.out.println("Você atingiu o número máximo de tentativas. O jogo acabou.");
                break;
            }
        }

        entrada.close();
    }
}
