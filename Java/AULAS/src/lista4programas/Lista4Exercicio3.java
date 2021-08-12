package lista4programas;

import lista4classes.ProdutoEletronico;

public class Lista4Exercicio3 {

	public static void main(String[] args) {
	
		/*
		 * 3 - Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe,
		 *  em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as
		 *   informa��es deste objeto no console.
		 */
		
		ProdutoEletronico televisor = new ProdutoEletronico("LG", 2999.90);
		
		televisor.setEstoque(3);
		
		televisor.getEstoque();
		
		televisor.valorImposto(15);
		
		System.out.printf("A nossa mais nova TV %s est� custando %.2f reais"
				+ " (Sendo desse valor, %.2f reais de imposto).\nAinda temos %d no nosso estoque.",
				televisor.getNome(), televisor.getValorReais(), 
				televisor.valorImposto(15), televisor.getEstoque() );

	}

}