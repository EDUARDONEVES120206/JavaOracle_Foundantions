package nota_while;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		int num = 1;
		int num2 = 1;
		int res;
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);

		while (true) {
			
			System.out.println("Digite o primiero numero entre 0 a 10: "+"\n \n Ou se quiser sair digite 00");
			num = entrada.nextInt();
			if (num == 00) {
				System.out.println("\nObrigado por utilizar nossa calculadora.");
				break;
			}
			System.out.println("Digite o segundo numero entre 1 a 10: ");
			num2 = entrada2.nextInt();
			

			if (num >= 0 && num <= 10 && num2 >= 0 && num2 <= 10) {
				res= (num+num2)/2;
				System.out.println("sua media foi: "+ res);
			} else {
				System.out.println("Algum número está invalido, digite novamente por favor ");
			}

		}
	}
}