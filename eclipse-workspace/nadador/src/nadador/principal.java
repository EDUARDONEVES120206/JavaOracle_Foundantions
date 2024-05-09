package nadador;

import java.util.Scanner;

public class principal {

		public static void main(String[] args) {
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		idade= entrada.nextInt();
		
		
		if(idade >=5 && idade<=7) {
			System.out.println("Você é nadador Infatil A com: "+idade +" anos");	
			
			}else if(idade >=8 && idade<=10) {
			System.out.println("Você é nadador Infatil B com: "+idade +" anos");
			
			}else if(idade >=11 && idade<=13) {
				System.out.println("Você é nadador Juvenil A com: "+idade +" anos");
			
			}else if(idade >=14 && idade<=17)  {
				System.out.println("Você é nadador Juvenil B com: "+idade +" anos");
			
			}else if(idade >=18)  {
				System.out.println("Você é nadador Sênior com: "+idade +" anos");
		}else {
			System.out.println("Idade Invalida");
		}

	}

}
