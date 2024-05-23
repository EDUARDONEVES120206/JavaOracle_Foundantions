import java.util.Scanner;

public class tabuada {

	public static void tabuada() {
		Scanner entrada = new Scanner(System.in);
		int num;

		while (true) {
			System.out.println("Digite um número para ser feito sua tabuada ate 10 \n"
					+ "Observação: Digite um numero de 0 a 1000");
			num = entrada.nextInt();

			if (num == -1) {
				System.out.println("\nObrigado por utilizar nossa calculadora.");
				break;
			} else if (num >= 0 && num <= 1000) {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Seu número multiplicado por " + i + " é igual a: " + num * i);
				}
			} else {
				System.out.println("Por favor, digite um número entre 0 e 1000.");
			}
			break;
		}

	}

}
