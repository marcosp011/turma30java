package lista3;
import java.util.*;

public class Tarefa6 {
	
	public static void main (String args []) {
		
		//Variaveis
		Scanner leia = new Scanner (System.in);
		int numero;
		int contadorNumero=0;
		int soma=0;
		double media=0;
		
		//Entradas
		
		do {
			System.out.println("Digite n�meros inteiros (Digite [0] para parar): ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				contadorNumero++;
				soma += numero;				
			}
		}
		while (numero != 0);
		
		media = (soma / contadorNumero);
		
		System.out.printf("A m�dia dos n�meros digitados que s�o multiplos de 3 s�o: %.2f.",media);
		leia.close();	
	}
}
