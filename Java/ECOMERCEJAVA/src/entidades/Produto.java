package entidades;

import java.util.Scanner;

public class Produto {
	
	private String codigo;
	private String nome;
	private double valor;
	private int estoque;
	private char comprar;
	private char pagamento;
	Scanner entrada = new Scanner (System.in);
	
//CONSTRUTORES
	public Produto(String codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}


	public Produto(String codigo, String nome, double valor, int estoque) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if(estoque < 0) {
			this.estoque = 0;
		}
		else {
			
			this.estoque = estoque;
		}
	}
	
//ENCAPSULAMENTO


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getEstoque() {
		return estoque;
	}

//METODOS

	
	public void incluiEstoque (int quantidade) {
		if(quantidade < 0) {
			System.out.println("Digite uma quantia válida.");
		}
		else {
			this.estoque += quantidade;
		}
		
	}
	
	public void retiraEstoque (int quantidade) {
		if(quantidade > estoque) {
			
			System.out.println("Quantidade indisponível.");
		}
		else {
			
			this.estoque -= quantidade;
		}
		
	}
//
	public void escolherTamanho(String tamanho ) {
		
		
	}


	public void escolherCor(char cor) {
		
		
	}
	
	public void validarSimOuNao (char comprar ) {
		
		if(comprar == 'S'|| comprar =='N' ) {
			
			this.comprar = comprar;
		}
		else{
			
			System.out.printf("Resposta Inválida!\nDigite [S/N]:");
			comprar = entrada.nextLine().toUpperCase().charAt(0);
			validarSimOuNao(comprar);
			
		}
		
	
	}
		public void escolherFormaDePagamento (char pagamento) {
			
			if(pagamento == '1'|| pagamento =='2' || pagamento == '3') {
				
				this.pagamento = pagamento;
			}
			else{
				
				System.out.printf("Resposta Inválida!\nDigite [1/2/3]:");
				pagamento = entrada.nextLine().toUpperCase().charAt(0);
				escolherFormaDePagamento(pagamento);
				
			
			}
	
	
	}
	
}
	