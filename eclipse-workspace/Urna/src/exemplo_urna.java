import java.util.Scanner;

public class exemplo_urna {
	
	public static void Voto() {
		int votos = 0;
		int total_votos = 0;
		int valorTotal = 0;
		// variaveis__Reprsentantes_dos_votos
		int votosBranco = 0,votosNulo = 0, votosKiko = 0,votosChaves = 0,votosChiquinha = 0, votosSeuMadruga = 0 ;
		

		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("Escolha em quem votar\n" + "[1] Branco\n" + "[2] Nulo\n" + "[3] Kiko\n" + "[4] Chaves\n"
					+ "[5] Chiquinha\n" + "[6] Seu Madruga\n" + "[666] Sair\n");
			votos = entrada.nextInt();

			switch (votos) {
			case 1:
				System.out.println("Você votou Branco");
				System.out.println("Deseja voltar e mais alguem? ");
				votosBranco++;
				total_votos += 1;
				break;
			case 2:
				System.out.println("Você votou Nulo");
				System.out.println("Deseja voltar e mais alguem? ");
				votosNulo++;
				total_votos += 1;
				break;
			case 3:
				System.out.println("Você votou no Kiko");
				System.out.println("Deseja voltar e mais alguem? ");
				votosKiko++;
				total_votos += 1;
				break;
			case 4:
				System.out.println("Você votou no Chaves.");
				System.out.println("Deseja voltar e mais alguem? ");
				votosChaves++;
				total_votos += 1;
				break;
			case 5:
				System.out.println("Você votou na chiquinha");
				System.out.println("Deseja voltar e mais alguem? ");
				votosChiquinha++;
				total_votos += 1;
				break;
			case 6:
				System.out.println("Você votou no Seu Madruga");
				System.out.println("Deseja voltar e mais alguem? ");
				votosSeuMadruga++;
				total_votos += 1;
				break;
			case 666:
				System.out.println("Você saiu do nosso programa");
				break;
			default:
				System.out.println("Opção Invalida, retorne e digite uma opção valida.");
			}
		} while (votos != 666);

		System.out.println("Total de votos para Branco: " + votosBranco);
		System.out.println("Total de votos para Nulo: " + votosNulo);
		System.out.println("Total de votos para Kiko: " + votosKiko);
		System.out.println("Total de votos para Chaves: " + votosChaves);
		System.out.println("Total de votos para Chiquinha: " + votosChiquinha);
		System.out.println("Total de votos para Seu Madruga: " + votosSeuMadruga);
		System.out.println("o Total de votos feitos foram: " + total_votos);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
