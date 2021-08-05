package lista2;

import java.util.*;

public class Tarefa2 {
	
	public static void main (String args[]) {
		
		// Variaveis 
		
		Scanner leia = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		// Entradas
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero3 = leia.nextInt();
		
		// Processamentos
		
		if (numero1 > numero2 && numero1 > numero3) {
			if (numero2 > numero3) {
				System.out.println(numero3+ " " +numero2+ " " + numero1);
				
			} 
			else {
				System.out.println(numero2+ " " +numero3 +" "+numero1);
			}
			
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			
			if (numero1 > numero3) {
				System.out.println(numero3+ " " +numero1+ " " +numero2);
			}
			else {
				System.out.println(numero1+ " " +numero3+ " " +numero2);
			}
		}
		else {
			if (numero2 > numero1) {
				System.out.println(numero1+ " " +numero2+ " " +numero3);
			}
			else {
				System.out.println(numero2+ " " +numero1+ " " +numero3);
			}
		}
	leia.close();
			
		}
		
	}


