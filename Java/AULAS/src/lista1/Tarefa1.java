package lista1;

import java.util.*;

public class Tarefa1 {
	public static void main (String args []){
		
		// Variaveis 
		Scanner leia = new Scanner (System.in);
		double anos;
		double meses;
		double dias;
		double totalDias;
		
		// Processamentos
		System.out.print("Digite o numero de anos: ");
		anos = leia.nextDouble();
		System.out.print("Digite o numero de meses: ");
		meses = leia.nextDouble();
		System.out.printf("Digite o numero de dias: ");
		dias = leia.nextDouble();
		
		totalDias = (anos*365)+(meses*30)+dias;	
		
		// Saidas
		System.out.printf("Total de dias na terra: "+ totalDias);
		
	}

}
