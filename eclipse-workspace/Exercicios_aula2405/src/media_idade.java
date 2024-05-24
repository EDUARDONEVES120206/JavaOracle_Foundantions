import java.util.Scanner;

public class media_idade {

	public static void main(String[] args) {

		String p1;
		String sx;
		double idade;
		double totalPessoas = 0;
		int totalIdadeMulheres = 0;
		int totalIdadeHomens = 0;
		int countMulheres = 0;
		int countHomens = 0;

		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);

		while (totalPessoas < 6) {
			System.out.println("Digite seu nome");
			p1 = entrada1.nextLine();
			System.out.println("Digite seu sexo  \n[F] para Feminino \n[M] para Masculino");
			sx = entrada2.nextLine();
			System.out.println("Digite sua idade");
			idade = entrada3.nextDouble();

			totalPessoas++;

			if (sx.equalsIgnoreCase("f")) {
				totalIdadeMulheres += idade;
				countMulheres++;
			} else if (sx.equalsIgnoreCase("m")) {
				totalIdadeHomens += idade;
				countHomens++;
			}
		}

		double mediaMulheres = countMulheres > 0 ? (double) totalIdadeMulheres / countMulheres : 0;
		double mediaHomens = countHomens > 0 ? (double) totalIdadeHomens / countHomens : 0;
		double mediaGrupo = (totalIdadeMulheres + totalIdadeHomens) / totalPessoas;

		System.out.println("A média de idade das mulheres é: " + mediaMulheres);
		System.out.println("A média de idade das homens é: " + mediaHomens);
		System.out.println("A média de idade do Grupo é: " + mediaGrupo);
	}
}
