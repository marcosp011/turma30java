package introducao;

import java.util.Scanner;

public class Matrizes1 {
	
	public static void main(String[] args) {
		int[][] matriz = new int [3][3]; // Criando a matriz do código.
		
		Scanner entrada  = new Scanner (System.in);
		System.out.println("Matriz M[3][3]\n");
		
		
		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				System.out.printf("Insira o elemento M [%d][%d]: ",linha+1,coluna+1); //%d - pega uma variavel da sequencia.
				matriz[linha][coluna] = entrada.nextInt();
			}
			
		}
		
		System.out.println("\n A matriz ficou:\n");
			for (int linha=0; linha<3; linha++) {
				for (int coluna=0; coluna<3; coluna++) {
					System.out.printf("\t %d \t",matriz[linha][coluna]); // \t é um Tab para deixar os numeros separados.
				}
				
				System.out.println();
			}
	}

}
