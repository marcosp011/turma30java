package lista1;


import java.util.*;

public class Tarefa8 {
	public static void main (String args[]) {
		
		// Variaveis 
		
		Scanner leia = new Scanner (System.in);
		double valorInicial;
		double valorFinal;
		double imposto;
		double distribuicao;
		
		// Entradas
		
		System.out.print("Digite o valor de F�brica: R$");
		valorInicial = leia.nextDouble();
		
		// Processamentos
		
		imposto = valorInicial*0.45;
		distribuicao = valorInicial*0.28;
		valorFinal = valorInicial+imposto+distribuicao;
		
		// Sa�das
		
		System.out.println("Valor do imposto �: R$"+imposto);
		System.out.println("Valor do distribuidor: R$"+distribuicao);
		System.out.printf("Valor final: R$"+valorFinal);
		
	
		
	}

}
