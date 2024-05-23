package teste;

public class vila_chaves {
	static int total_votos = 0;
	static int votosBranco = 0;
	static int votosNulo = 0;
	static int votosKiko = 0;
	static int votosChaves = 0;
	static int votosChiquinha = 0;
	static int votosSeuMadruga = 0;

	public static int getTotal_votos() {
		return total_votos;
	}

	public static int getVotosBranco() {
		return votosBranco;
	}

	public static int getVotosNulo() {
		return votosNulo;
	}

	public static int getVotosKiko() {
		return votosKiko;
	}

	public static int getVotosChaves() {
		return votosChaves;
	}

	public static int getVotosChiquinha() {
		return votosChiquinha;
	}

	public static int getVotosSeuMadruga() {
		return votosSeuMadruga;
	}

	public static void branco() {
		System.out.println("Você votou Branco");
		votosBranco++;
		total_votos++;
	}

	public static void nulo() {
		System.out.println("Você votou Nulo");
		votosNulo++;
		total_votos++;
	}

	public static void kiko() {
		System.out.println("Você votou no Kiko");
		votosKiko++;
		total_votos++;
	}

	public static void chaves() {
		System.out.println("Você votou no Chaves.");
		votosChaves++;
		total_votos++;
	}

	public static void chiquinha() {
		System.out.println("Você votou na Chiquinha");
		votosChiquinha++;
		total_votos++;
	}

	public static void madruga() {
		System.out.println("Você votou no Seu Madruga");
		votosSeuMadruga++;
		total_votos++;
	}
}
