package programas;

public class Aluno {

	// atributos - parece variavel
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	
	//sobrecarga = mais do mesmo.
	// construtores
	// encapsulamento = seguran�a = getter and setters
	// metodos
	
	public void mostraIdade() {
		System.out.println("A idade �: "+(2021-anoNascimento));
	}
	//Sobrecarga de metodo
	public void mostraIdade(int anoAtual, int anoNasimento) {
		System.out.println("A idade �: "+(anoAtual- this.anoNascimento));
	}

	
	
	//polimorfismo 
	//heran�a
	//delega��o
	//override = annotation
	
}
