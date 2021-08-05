package introducao;

import java.util.*;

public class Condicional1 {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.printf("Entre com o seu nome: ");
		nome = leia.next();
		leia.nextLine(); // Limpando o buffering de memoria 
		System.out.printf("Entre com o sua idade: ");
		idade = leia.nextInt();
		System.out.printf("\nSeu nome: %s",nome); // %s = Pega um valor do tipo Sting
		System.out.printf("\nSua idade: %d",idade); // %d = Representa um numero inteiro
		
		if (idade >= 18 ) {
			System.out.println(" Voce é maior de idade!");
		} 
		else if (idade >=1 && idade <18) {
			System.out.println(" Então voce é menor de idade!");
		}
		else {
			System.out.println(" Voce digitou uma idade inválida!");
		}
	
				
	}

}
