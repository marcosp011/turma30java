package lista1;

import java.util.*;

public class Tarefa2 {
	
	public static void main (String args []) {
		
		// Variaveis
		
		Scanner leia = new Scanner (System.in);
		double anos;
		double meses;
		double dias;
		double totalDias;
		
		// Entradas
		
		System.out.print("Digite a sua idade em total de dias: ");
		totalDias = leia.nextDouble();
		
		// Processamentos
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		// Saídas 
		
		System.out.println("Total de anos: "+anos);
		System.out.println("Total de meses: "+meses);
		System.out.println("Total de dias: "+dias);
				
		
	
		
		
		
	}

}
