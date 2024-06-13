import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class Principal {

    static double valorTotal = 0;

    // Listas para armazenar os produtos cadastrados
    static List<Produto> bebidas = new ArrayList<>();
    static List<Produto> lanches = new ArrayList<>();
    static List<Produto> porcoes = new ArrayList<>();
    static List<Produto> sobremesas = new ArrayList<>();

    public static void main(String[] args) {

        int pedido = 0;
        List<String> itensPedido = new ArrayList<>();

        do {
            String input = JOptionPane.showInputDialog(null,
                    "Escolha uma opção do cardápio\n" +
                    "[1] Cadastrar Bebidas\n" +
                    "[2] Cadastrar Lanches\n" +
                    "[3] Cadastrar Porções\n" +
                    "[4] Cadastrar Sobremesas\n" +
                    "[5] Fazer pedido\n"+
                    "[0] Sair\n");
            pedido = Integer.parseInt(input);

            switch (pedido) {
                case 1:
                    cadastrarBebidas();
                    break;
                case 2:
                    cadastrarLanches();
                    break;
                case 3:
                    cadastrarPorcoes();
                    break;
                case 4:
                    cadastrarSobremesas();
                    break;
                case 5:
                    fazerPedido(itensPedido);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Você saiu do nosso programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida, retorne e digite uma opção válida.");
            }
        } while (pedido != 0);

        JOptionPane.showMessageDialog(null, "Resumo do Pedido:\n" + String.join("\n", itensPedido) + "\nTotal a pagar: R$" + valorTotal);
    }

    public static void cadastrarBebidas() {
        String nome = JOptionPane.showInputDialog("Nome da Bebida:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da Bebida:"));
        bebidas.add(new Produto(nome, preco));
    }

    public static void cadastrarLanches() {
        String nome = JOptionPane.showInputDialog("Nome do Lanche:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do Lanche:"));
        lanches.add(new Produto(nome, preco));
    }

    public static void cadastrarPorcoes() {
        String nome = JOptionPane.showInputDialog("Nome da Porção:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da Porção:"));
        porcoes.add(new Produto(nome, preco));
    }

    public static void cadastrarSobremesas() {
        String nome = JOptionPane.showInputDialog("Nome da Sobremesa:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da Sobremesa:"));
        sobremesas.add(new Produto(nome, preco));
    }

    public static void fazerPedido(List<String> itensPedido) {
        int categoria = Integer.parseInt(JOptionPane.showInputDialog("Adicionar item ao pedido:\n" +
                "Escolha uma categoria do cardápio\n" +
                "[1] Bebidas\n" +
                "[2] Lanches\n" +
                "[3] Porções\n" +
                "[4] Sobremesas\n"));

        List<Produto> produtos = new ArrayList<>();

        switch (categoria) {
            case 1:
                produtos = bebidas;
                break;
            case 2:
                produtos = lanches;
                break;
            case 3:
                produtos = porcoes;
                break;
            case 4:
                produtos = sobremesas;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida.");
                return;
        }

        StringBuilder produtosDisponiveis = new StringBuilder("Produtos disponíveis:\n");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            produtosDisponiveis.append((i+1)).append(". ").append(produto.nome).append(" - R$").append(produto.preco).append("\n");
        }

        int escolha = Integer.parseInt(JOptionPane.showInputDialog(produtosDisponiveis + "Escolha o número do produto:"));

        if (escolha > 0 && escolha <= produtos.size()) {
            Produto produtoEscolhido = produtos.get(escolha - 1);
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
            double precoTotal = quantidade * produtoEscolhido.preco;
            itensPedido.add(quantidade + "x " + produtoEscolhido.nome + " - Total: R$" + precoTotal);
            valorTotal += precoTotal; // Atualiza o valor total do pedido
        } else {
            JOptionPane.showMessageDialog(null, "Escolha inválida.");
        }
    }
}
