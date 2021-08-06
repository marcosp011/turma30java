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
	// encapsulamento = segurança = getter and setters
	// metodos
	
	public void mostraIdade() {
		System.out.println("A idade é: "+(2021-anoNascimento));
	}
	//Sobrecarga de metodo
	public void mostraIdade(int anoAtual, int anoNasimento) {
		System.out.println("A idade é: "+(anoAtual- this.anoNascimento));
	}

	
	
	//polimorfismo 
	//herança
	//delegação
	//override = annotation
	
}
