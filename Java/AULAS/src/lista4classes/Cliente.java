package lista4classes;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public double dinheiro;
	public boolean interesseCompra;
	
	
	public String maiorIdade (int anoAtual) {
		int idade = anoAtual - anoNascimento; 
		if (idade >= 18) {
		return "Voc� pode comprar nossos produtos. \nVoc� tem "+idade+" anos, ent�o � maior de idade";
		}
		else {
			return "Voc� n�o pode comprar nossos produtos. \nParece que voc� tem somente "+idade+" anos de idade";
		}
			
	}
}