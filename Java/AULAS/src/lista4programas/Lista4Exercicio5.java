package lista4programas;

import lista4classes.Patinete;

public class Lista4Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 5 -  Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, 
		 * em seguida crie um objeto patinete, defina as instancias deste objeto e apresente as
		 *  informa��es deste objeto no console. 
		 */ 
		Patinete meuPatinete = new Patinete("Scooter", "Killer of the Road", "sombrio com chamas" );
		
		meuPatinete.fabricacao = 1990;
		
		meuPatinete.setConservacao('S');
		
		System.out.println("Meu patinete est� h� "+meuPatinete.tempoUso(2021)+" anos arrasando nas estradas"+((meuPatinete.conservacao)?" e est� perfeito!":" e est� destru�do, por�m continua mortal!!!"));
		
		System.out.println("O design do patinete � "+meuPatinete.estilo+"! E se chama "+meuPatinete.apelido+"!!!");
		
	}

}