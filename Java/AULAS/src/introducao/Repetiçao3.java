package introducao;

import java.util.*;

public class Repeti�ao3 {
	public static void main (String args []) {
		
		Scanner leia = new Scanner (System.in);
		int idade;
		
			do {
				
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			System.out.printf("Sua idade: %d",idade);
			
			if(idade>=18) { 
				System.out.println(" Voce � de maior..");
			}
			
			else {
				System.out.println(" Voce � de menor..");
			}
			
		}	
			while (idade>=1);
			
	}

}