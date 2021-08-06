package programas;

import classes.Pessoa;

public class ListaBalada {

	public static void main(String[] args) {
		
		
		Pessoa primeiroFila = new Pessoa("Marcos");
		Pessoa sicrano1 = new Pessoa("Cassia, A Dev");
		
		primeiroFila.nome = "Paulo";
		primeiroFila.anoNascimento = 2000;
		
		
		System.out.println("Quem é o primeiro da fila: "+primeiroFila.nome);
		System.out.println("idade"+ (2021-primeiroFila.anoNascimento));
		System.out.println(primeiroFila.anoNascimento+"Sua idade é"+primeiroFila.calcIdade(2021));

	}

}
