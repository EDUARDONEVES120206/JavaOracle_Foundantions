package soma_media_5numero;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int contador = 0;
		int soma = 0;

		Scanner entrada = new Scanner(System.in);

		while (contador < 5) {
			System.out.println("Digite um número:");
			int numero = entrada.nextInt();
			soma += numero;
			contador++;
		}

		double media = soma / 5.0;

		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é: " + media);
		;

	}

}
