import java.util.ArrayList;
import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList numeros = new ArrayList();
		ArrayList numerosPares = new ArrayList();
		ArrayList numerosImpares = new ArrayList();

		System.out.println("Digite números Digite [0] para sair");
		int numero;
		do {
			numero = scanner.nextInt();
			if (numero != 0) {
				numeros.add(numero);
				if (numero % 2 == 0) {
					numerosPares.add(numero);
				} else {
					numerosImpares.add(numero);
				}
			}
		} while (numero != 0);

		ordenarLista(numeros);
		ordenarLista(numerosPares);
		ordenarLista(numerosImpares);

		System.out.println("Números Digitados: " + numeros);
		System.out.println("Números Pares: " + numerosPares);
		System.out.println("Números Impares: " + numerosImpares);
	}

	private static void ordenarLista(ArrayList<Integer> lista) {
		int n = lista.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (lista.get(j) > lista.get(j + 1)) {
					int temp = lista.get(j);
					lista.set(j, lista.get( j + 1));
					lista.set(j + 1, temp);
				}
			}
		}

	}

}