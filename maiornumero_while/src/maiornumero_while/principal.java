package maiornumero_while;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int num1 = 1, num2 = 1, num3 = 1, num4 = 1, num5 = 1;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);

		while (true) {

			System.out.println("Digite o primiero numero entre 1 a 10: " + "\n Ou se quiser sair digite 00");
			num1 = entrada.nextInt();
			if (num1 == 00) {
				System.out.println("\n Obrigado por utilizar nosso programa.");
				break;
			}
			System.out.println("Digite o segundo numero entre 1 a 10: ");
			num2 = entrada.nextInt();
			System.out.println("Digite o terceiro numero entre 1 a 10: ");
			num3 = entrada.nextInt();
			System.out.println("Digite o quarto numero entre 1 a 10: ");
			num4 = entrada.nextInt();
			System.out.println("Digite o quinto numero entre 1 a 10: ");
			num5 = entrada.nextInt();
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				System.out.println("O maior número foi: " + num1);
				break;
			} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
				System.out.println("O maior número foi: " + num2);
				break;
			} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
				System.out.println("O maior número foi: " + num3);
				break;
			} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
				System.out.println("O maior número foi: " + num4);
				break;
			} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
				System.out.println("O maior número foi: " + num5);
				break;
			} else {
				System.out.println("Algum número está invalido, digite novamente por favor ");
			}

		}

	}

}
