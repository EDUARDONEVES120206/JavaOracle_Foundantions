import javax.swing.JOptionPane;

public class Funcoes_cadastro {
	String nomep, tipo, conftipo;


public void Produtos(){
    nomep = JOptionPane.showInputDialog("digite o nome do produto que deseja cadastrar?");
    do {
        String tipo = (JOptionPane.showInputDialog("Insira o tipo do produto "));
        String conftipo = (JOptionPane.showInputDialog("confirme o tipo do produto: "));
    } while (conftipo != tipo);
    conftipo = JOptionPane.showInputDialog("insira novamente o tipo do profuto");
    JOptionPane.showMessageDialog(null, "cliente cadastrado com sucesso.");
}}
