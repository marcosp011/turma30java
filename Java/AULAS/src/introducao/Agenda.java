package introducao;


import java.util.Scanner;

public class Agenda {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		String agenda [][] = new String[24][31]; // Linha 0-23 Coluna 0-30
		int auxDia, auxHora;
		char op;
		do {
			
			System.out.print("Digite o dia do evento: ");
			auxDia = leia.nextInt()-1;
			System.out.print("Digite a hora do evento: ");
			auxHora = leia.nextInt();
			leia.nextLine();
			System.out.print("Digite o evendo: ");
			agenda [auxHora][auxDia] = leia.nextLine();
			System.out.print("Continua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			
		} while (op == 'S');
		
		System.out.println("mostrando agenda");
		
		for (int dia=0;dia<31;dia++) {
			for (int hora=0;hora<24;hora++) {
				System.out.printf("Dia %d - hora %d : %s\n",dia+1,hora,agenda[hora][dia]);
				if (agenda[hora][dia] != null) {
					System.out.printf("Dia %d - hora %d : %s\n",dia+1,hora,agenda[hora][dia]);
				}
				
			}
		}
	}

}
