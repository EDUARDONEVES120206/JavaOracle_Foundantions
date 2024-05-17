package tabuada_while;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		int num ;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número , e se quiser parar digite: [-1]");
		num = entrada.nextInt();
		
		int i=1;
		while (i<=10) {
			if (num == -1) {
				System.out.println("\n Obrigado por utilizar nossa calculadora.");
				break;
			}
			System.out.println(num +"x"+ i+"="+ num * i);
			i++;
			
			
		}

	}

}
