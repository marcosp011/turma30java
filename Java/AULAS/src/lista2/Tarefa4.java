package lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		// Exercicio 4 da lista 2 
		
		// Variaveis - Ingredientes 
		
		Scanner leia = new Scanner (System.in);
		double numero;
		
		
		// Entradas
		
		System.out.print("Digite um numero: ");
		numero = leia.nextDouble();
		
		// Processamentos
		if(numero<0) {
			System.out.println("Impossivel realizar, numero negativo!");
		}
		else if(numero==0.00) {
			System.out.println("Zero � Neutro!");
			
		}
		else if ((numero%2)==0){
			System.out.println("O numero � par!");
			System.out.printf("A raiz quadrada de %.2f � %.2f !!!",numero,(Math.sqrt(numero)));
			
		} 
		else if ((numero%2)==1) {
			System.out.println("O numero � impar!!"); 
			// println - pula linha mas n�o pode usar a ","  usa o " + ".
			System.out.printf("O numero %.2f ao quadrado � %.2f !!",numero,(Math.pow(numero, 2)));
			// PrintF - usado para imprimir e utilizar as " , " ao inves do " + ".
		}
		
		
		
		

	}

}
