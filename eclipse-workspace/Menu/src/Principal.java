public class Principal {
	public static void main(String[] args) {
		// Instacição_objetos
		Menu menu = new Menu();
		// Exibe_o menu_na_tela_para_que_o_usuário_veja_as_opções_disponíveis
		menu.exibirMenu();
		// Lê_a_opção_escolhida_pelo_usuário_e_armazena_a_na_variável_opcao
		int opcao = menu.lerOpcao();
		// Exibi_a_opcao_que_foi_escolhida_no_menu
		System.out.println("Você escolheu a opção: " + opcao);
	}
}
