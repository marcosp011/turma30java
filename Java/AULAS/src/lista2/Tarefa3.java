package lista2;

import java.util.*;
public class Tarefa3 {
	public static void main (String args []) {
		
		// Variaveis
		
		Scanner leia = new Scanner (System.in);
		String nome;
		double idade = 0;
		
		//Entradas
		
		System.out.println("Digite o seu nome Jogador(a): ");
		nome = leia.nextLine();
		System.out.println("Digite a sua idade Jogador(a): ");
		idade = leia.nextDouble();
		
		// Processamento
		
		
		if (idade >=10 && idade <=14 ) {
			System.out.printf(nome+", voce está na categoria Infantil !");
		} 
		
		else if (idade >14 && idade <= 17) {
			System.out.printf(nome+", voce está na categoria Juvenil !");
		}
		
		else if (idade > 17 && idade <25) {
			System.out.printf(nome+", voce está na categoria Adulto(a) !");
		} 
		
		else {
			System.out.println(nome+", não temos categoria para sua idade.");
		}
		
		
		
	}

}
