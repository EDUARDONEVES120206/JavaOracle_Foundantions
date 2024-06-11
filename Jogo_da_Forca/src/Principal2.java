import java.util.Random;

import javax.swing.JOptionPane;

public class Principal2 {

    public static void main(String[] args) {
        // Menu principal
        int opcaoMenu = menuDeOpcoes();

        switch (opcaoMenu) {
            case 1:
                jogarContraAMaquina();
                break;
            case 2:
                jogarComUmAmigo();
                break;
            case 3:
                sairDoJogo();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                break;
        }
    }

    // Métodos_para as_opções do menu
    private static int menuDeOpcoes() {
        String opcaoTexto = JOptionPane.showInputDialog("Escolha uma opção:\n\n" +
                "1. Jogar contra a máquina\n" +
                "2. Jogar com um amigo\n" +
                "3. Sair do jogo");
        try {
            return Integer.parseInt(opcaoTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número.");
            return 0;
        }
    }
    //jogp_contra_a_maquina
    private static void jogarContraAMaquina() {
        
    	String[] palavras = {"senai", "ewerson", "eduardo", "python", "java", "Aluno"};
        Random random = new Random();
        String palavraSecreta = palavras[random.nextInt(palavras.length)];
        String palavraAtual = "_".repeat(palavraSecreta.length());
        String letrasDigitadas = "";
        int tentativas = 5;

        while (tentativas > 0 && palavraAtual.contains("_")) {
            JOptionPane.showMessageDialog(null, "Palavra: " + palavraAtual +
                    "\nTentativas restantes: " + tentativas +
                    "\nLetras digitadas: " + letrasDigitadas);
            String letra = JOptionPane.showInputDialog("Digite uma letra: ").toLowerCase();

            if (letrasDigitadas.contains(letra)) {
                JOptionPane.showMessageDialog(null, "Você já digitou essa letra. Tente outra.");
            } else {
                letrasDigitadas += letra + "-";

                if (palavraSecreta.contains(letra)) {
                    JOptionPane.showMessageDialog(null, "Letra correta!");
                    for (int i = 0; i < palavraSecreta.length(); i++) {
                        if (palavraSecreta.charAt(i) == letra.charAt(0)) {
                            palavraAtual = palavraAtual.substring(0, i) + letra + palavraAtual.substring(i + 1);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Letra errada. Tente novamente.");
                    tentativas--;
                }
            }
        }

        if (tentativas == 0) {
            JOptionPane.showMessageDialog(null, "Você perdeu! A palavra era: " + palavraSecreta);
        } else {
            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou a palavra: " + palavraSecreta);
        }
        
    }

    //jogo_contra_alguem
    private static void jogarComUmAmigo() {
      
    	String palavraSecreta = JOptionPane.showInputDialog("Digite a palavra secreta: ").toLowerCase();
        String palavraAtual = "_".repeat(palavraSecreta.length());
        String letrasDigitadas = "";
        int tentativas = 5;

        while (tentativas > 0 && palavraAtual.contains("_")) {
            JOptionPane.showMessageDialog(null, "Palavra: " + palavraAtual +
                    "\nTentativas restantes: " + tentativas +
                    "\nLetras digitadas: " + letrasDigitadas);
            String letra = JOptionPane.showInputDialog("Digite uma letra: ").toLowerCase();

            if (letrasDigitadas.contains(letra)) {
                JOptionPane.showMessageDialog(null, "Você já digitou essa letra. Tente outra.");
            } else {
                letrasDigitadas += letra + "-";

                if (palavraSecreta.contains(letra)) {
                    JOptionPane.showMessageDialog(null, "Letra correta!");
                    for (int i = 0; i < palavraSecreta.length(); i++) {
                        if (palavraSecreta.charAt(i) == letra.charAt(0)) {
                            palavraAtual = palavraAtual.substring(0, i) + letra + palavraAtual.substring(i + 1);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Letra errada. Tente novamente.");
                    tentativas--;
                }
            }
        }

        if (tentativas == 0) {
            JOptionPane.showMessageDialog(null, "Você perdeu! A palavra era: " + palavraSecreta);
        } else {
            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou a palavra: " + palavraSecreta);
        }
    }
    //sair_do_jogo
    private static void sairDoJogo() {
        JOptionPane.showMessageDialog(null, "Obrigado por jogar! Até a próxima.");
       
    }
}


