import java.util.Scanner;

public class Menu {

	public static void menu() {
		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.println("Digite uma das opções a seguir:" + "\n [1] Soma de números de 1 a 10" + "\n [2] Tabuada"
					+ "\n [3] Encerrar o Programa");

			int escolha = entrada.nextInt();

			switch (escolha) {
			case 1:
				soma_1_a_10.soma();
				break;
			case 2:
				tabuada.tabuada();
				break;
			case 3:
				System.out.println("Obrigado por usar nosso Programa!");
				return;
			default:
				System.out.println("Opção inválida");
			}

			System.out.println("\n Deseja encerrar o Programa? Sim ou Não");
			entrada.nextLine();
			String opc = entrada.nextLine();
			if (opc.equalsIgnoreCase("sim")) {
				System.out.println("Obrigado por usar nosso Programa!");
				break;
			}
		}
	}

}
