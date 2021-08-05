package lista1;

import java.util.Scanner;

public class Tarefa6 {

	public static void main (String[]args) {
	
			
		Scanner leia = new Scanner(System.in);
		
		double x1;
		double x2;
		double y1;
		double d;
		double y2;
		double p1;
		double p2;
		
		//% - Double //
		//% - Inteiro //
		//% - String //
		//% - Boolean //
		
		System.out.print("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
				
				System.out.println("\nA tal da distancia é "+d);
		
	
	}
	
	
}
	
	

