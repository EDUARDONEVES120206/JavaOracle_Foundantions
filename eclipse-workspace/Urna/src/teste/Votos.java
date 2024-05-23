package teste;
import java.util.Scanner;

public class Votos {
    public static void Voto() {
        int votos;

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Escolha em quem votar\n" + "[1] Branco\n" + "[2] Nulo\n" + "[3] Kiko\n" + "[4] Chaves\n"
                    + "[5] Chiquinha\n" + "[6] Seu Madruga\n" + "[666] Sair\n");
            votos = entrada.nextInt();

            switch (votos) {
                case 1:
                    vila_chaves.branco();
                    break;
                case 2:
                    vila_chaves.nulo();
                    break;
                case 3:
                    vila_chaves.kiko();
                    break;
                case 4:
                    vila_chaves.chaves();
                    break;
                case 5:
                    vila_chaves.chiquinha();
                    break;
                case 6:
                    vila_chaves.madruga();
                    break;
                case 666:
                    System.out.println("Você saiu do nosso programa");
                    break;
                default:
                    System.out.println("Opção Invalida, retorne e digite uma opção valida.");
            }
        } while (votos != 666);
        System.out.println("Total de votos para Branco: " + vila_chaves.getVotosBranco());
		System.out.println("Total de votos para Nulo: " + vila_chaves.getVotosNulo());
		System.out.println("Total de votos para Kiko: " + vila_chaves.getVotosKiko());
		System.out.println("Total de votos para Chaves: " + vila_chaves.getVotosChaves());
		System.out.println("Total de votos para Chiquinha: " + vila_chaves.getVotosChiquinha());
		System.out.println("Total de votos para Seu Madruga: " + vila_chaves.getVotosSeuMadruga());
		System.out.println("O total de votos feitos foram: " + vila_chaves.getTotal_votos());
    }
}
