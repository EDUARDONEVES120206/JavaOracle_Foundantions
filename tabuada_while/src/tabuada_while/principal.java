package tabuada_while;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

			int num;
	
			Scanner entrada = new Scanner(System.in);
			
			int i=1;
			while (i<=10) {
			System.out.println("Digite um número entre 0 a 1000, e se quiser parar digite: [-1]");
			num = entrada.nextInt();
			if (num == -1) {
				System.out.println("\n Obrigado por utilizar nossa calculadora.");
				break;
			}

			else if (num >=0 &&num <= 1000) {
				System.out.println("Seu número multiplicado por 1 é igual a: " + num * 1);
				System.out.println("Seu número multiplicado por 2 é igual a: " + num * 2);
				System.out.println("Seu número multiplicado por 3 é igual a: " + num * 3);
				System.out.println("Seu número multiplicado por 4 é igual a: " + num * 4);
				System.out.println("Seu número multiplicado por 5 é igual a: " + num * 5);
				System.out.println("Seu número multiplicado por 6 é igual a: " + num * 6);
				System.out.println("Seu número multiplicado por 7 é igual a: " + num * 7);
				System.out.println("Seu número multiplicado por 8 é igual a: " + num * 8);
				System.out.println("Seu número multiplicado por 9 é igual a: " + num * 9);
				System.out.println("Seu número multiplicado por 10 é igual a: " + num * 10);
				

			} else {
				System.out.println("Por favor, Digite um número entre 0 a 1000");
			}
		}
	}

}
