import java.util.Random;
public class principal {

	public static void main(String[] args) {
		
		

		class Palavras {

		    private String[] palavras = {"cachorro", "baleia", "arara", "chevrolet", "volksvagen", "samsung", "colher", "tablet", "espanha", "senegal"};
		    private String palavra;
		    private String letra;
		    private Random palavraSorteada = new Random();


		    public Palavras() {
		        palavra = palavras[palavraSorteada.nextInt(palavras.length)];
		    }

		    public String getPalavra() {
		        return palavra;
		    }

		    public void setPalavra(String palavra) {
		        this.palavra = palavra;
		    }

		    public String getLetra() {
		        return letra;
		    }

		    public void setLetra(String letra) {
		        this.letra = letra;
		    }

		    public char[] codificarPalavra() {
		        char[] traco = new char[palavra.length()];
		        for (int i = 0; i < palavra.length(); i++) {
		            traco[i] ='_';

		        }
		        return traco;

		    }

		    public String dica() {
		        String dica="";
		        if (palavra.equals(palavras[0]) || palavra.equals(palavras[1]) || palavra.equals(palavras[2])) { //etc
		            dica = "Animal";
		        }
		        if(palavra.equals(palavras[3]) || palavra.equals(palavras[4]) || palavra.equals(palavras[5])){
		            dica = "Marca";
		        }
		        if(palavra.equals(palavras[6])){
		            dica = "cozinha";
		        }
		        if(palavra.equals(palavras[7])){
		            dica = "eletrônico";
		        }
		        if(palavra.equals(palavras[8]) || palavra.equals(palavras[9])){
		            dica = "país";
		        }

		        return dica;
		    }

		    public boolean verifica(char letra) {
		        // char[] l = letra.toCharArray();
		        for (int i = 0; i < palavra.length(); i++) {
		            if (palavra.charAt(i) == letra) {
		               
		                return true;
		            }

		        }
		        return false;
		    }


		}
		
		
		
		

	}

}
