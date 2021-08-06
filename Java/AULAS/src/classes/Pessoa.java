package classes;

public class Pessoa {
	
	// Atributos 
	public String nome;
	public int anoNascimento;
	public String cpf;
	public char pronome; // M- Masculino, F- Feminino, E- elo.
	public boolean ativo;
	
	
	
	// get and setters 
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	// Construtores = metodo que constroi a regra da classe
	
	
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getPronome() {
		return pronome;
	}
	public void setPronome(char pronome) {
		this.pronome = pronome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	
	
	public Pessoa(String nome, int anoNascimento, String cpf, boolean ativo) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.cpf = cpf;
		this.ativo = ativo;
	}
	
	// Tudo é método. porque sei que é um método? pelo ()
	
	public void mostrarIdade() {
		System.out.println(2021-anoNascimento);
		
	}
	public int calcIdade(int anoAtual);{
		
		return anoAtual - anoNascimento;
	}
	
}
