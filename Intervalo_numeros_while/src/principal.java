import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		numero1 = entrada.nextInt();

		System.out.println("Digite o segundo número:");
		numero2 = entrada1.nextInt();

		// Determina o menor e o maior número entre os dois digitados
		int menorNumero = Math.min(numero1, numero2);
		int maiorNumero = Math.max(numero1, numero2);

		System.out.println("Números no intervalo entre " + menorNumero + " e " + maiorNumero + ":");

		// Inicia um loop com o menor número e continua até o maior número
		int atual = menorNumero;
		while (atual <= maiorNumero) {
			System.out.println(atual);
			atual++;
		}

	}
}
