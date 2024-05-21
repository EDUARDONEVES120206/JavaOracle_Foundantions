package calculos;

import java.util.Scanner;

public class calculos {
	public static void soma() {
		int n1 = 0;
		int n2 = 0;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);

		System.out.println("Soma dos números \n");

		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada2.nextInt();

		int resul = n1 + n2;
		System.out.println(" a soma dos números é igual á: " + resul + "\n");

	}

	public static void mul() {
		int n1 = 0;
		int n2 = 0;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Multiplicação dos números \n");

		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada2.nextInt();

		int resul = n1 * n2;
		System.out.println(" a soma dos números é igual á: " + resul + "\n");
	}

	public static void sub() {
		int n1 = 0;
		int n2 = 0;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Subtração dos números \n");

		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada2.nextInt();

		int resul = n1 - n2;
		System.out.println(" a subtração dos números é igual á: " + resul + "\n");
	}

	public static void div() {
		double n1 = 0;
		double n2 = 0;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("divisão dos números \n");

		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite o segundo número: ");
		n2 = entrada2.nextDouble();

		double resul = n1 / n2;
		System.out.println(" a soma dos números é igual á: " + resul + "\n");
	}

	public static void raiz() {
		// Importaçã_biblioteca_Math_funcao_sqrt
		double n1 = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Raiz de um numeros \n");

		System.out.println("Digite um número: ");
		n1 = entrada.nextDouble();

		System.out.println("A raiz do número " + n1 + " e igual a: " + Math.sqrt(n1));
	}

	public static void expo() {
		double n1 = 0;
		double expoente = 0;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Exponenciação de um número\n");

		System.out.println("Digite um número: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite o expoente ");
		expoente = entrada2.nextDouble();

		double resultado = Math.pow(n1, expoente);

		System.out.println("O resultado da exponenciação de " + n1 + " elevado a" + expoente + " é: " + resultado);

	}
}
