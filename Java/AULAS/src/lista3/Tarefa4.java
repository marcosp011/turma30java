package lista3;

import java.util.*;

public class Tarefa4 {
	
	public static void main (String arg [] ) {
		
		
		// Variaveis
		
		Scanner leia = new Scanner (System.in);
		int idade;
		char sexo; // (1- feminino / 2- masculino / 3 - Outros)
		char opcoes; // (1- pessoa calma / 2- pessoa nervosa / 3 pessoa agressiva).
		int contadorPessoas=0; // (contador de pessoas)
		char op='S';
		final int LIMITE_PESSOAS_ENTREVISTADAS=3;
		int numeroPessoasCalmas=0;
		int numeroMulheresNervosas=0;
		int numeroHomensAgressivos=0;
		int numeroOutrosCalmos=0;
		int numeroPessoasNervosasMais40Anos=0;
		int numeroPessoasCalmasMenos18Anos=0;
		
				
		// Entradas
		while(contadorPessoas < LIMITE_PESSOAS_ENTREVISTADAS && op=='S' ) {
			
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite \n1- feminino\n2- masculino\n3- Outros: ");
			sexo = leia.next().charAt(0);
			System.out.println("Digite a op��o\n1- pessoa calma\n2- pessoa nervosa\n3- pessoa agressiva ");
			opcoes = leia.next().charAt(0);
			contadorPessoas++;
			System.out.println("Continuar S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			
			// Processamentos
			if(opcoes == '1') {
				numeroPessoasCalmas++;
				
			}
			if (sexo == '1' && opcoes == '2') {
				numeroMulheresNervosas++;
				
				
			}
			if (sexo == '2' && opcoes == '3') {
				numeroHomensAgressivos++;
			}
			if (sexo == '3' && opcoes == '1') {
				numeroOutrosCalmos++;
				
			}
			if (opcoes =='2' && idade > 40) {
				numeroPessoasNervosasMais40Anos++;
				
			}
			if (opcoes == '1' && idade < 18 ) {
				numeroPessoasCalmasMenos18Anos++;
				
			}
		}
		
		
		// Saidas
		
		System.out.println("Pessoas calmas: "+numeroPessoasCalmas);
		System.out.println("Mulheres nervosas: "+numeroMulheresNervosas);
		System.out.println("Homens agressivos: "+numeroHomensAgressivos);
		System.out.println("Outros calmos: "+numeroOutrosCalmos);
		System.out.println("Pessoas nervosas acima 40 anos: "+numeroPessoasNervosasMais40Anos);
		System.out.println("Pessoas calmas abaixo de 18 anos: "+numeroPessoasCalmasMenos18Anos);
		
	}
	

}
