package introducao;

import java.util.*;

public class Repeti�ao2 {
	public static void main (String args []) {
		
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		
		while (idade>=1) {
			System.out.printf("Sua idade: %d",idade);
			
			if(idade>=18) { 
				System.out.println(" Voce � de maior..");
			}
			
			else {
				System.out.println(" Voce � de menor..");
			}
			
			System.out.println(" Entre com a sua idade: ");
			idade = leia.nextInt();
		}
			
	}

}
