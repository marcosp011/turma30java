package lista3;

import java.util.*;
public class Tarefa2 {
	/*
	 * Exercicio 2 - Fazer um programa que leia 10 numeros
	 * imprimir quantos são pares e quantos são impares.
	 */
	public static void main (String args[]) {
		
		//variaveis
		Scanner leia = new Scanner (System.in);
		int numero;
		int numerosPares=0;
		int numerosImpares=0;
		
		//entradas
		for(int x=0; x<10; x++) {
			
			System.out.print("Digite o um numero:");
			numero = leia.nextInt();
			
			// Processamento
			
			if((numero%2)==0) {
				numerosPares++;
			}
			
			if((numero%2== 1)) {
				numerosImpares++;
			}
			
		}
		// Saidas
		
		System.out.printf("A quantidade de numeros pares é: %d \nA quantidade de numeros impares é: %d",numerosPares,numerosImpares);
		leia.close();	
	}
	
}
