package introducao;

public class Repetiçao1 {
	public static void main (String args []) {
		
		int x;
		int soma=0;
		
		// Laço de repetição
		
		for(x=1;x<=10;x++) {
			System.out.printf("\n %d",x); //%d - Para puxar um numero inteir.
			soma = soma +x;
		}
		System.out.printf("\n Soma total: %d",soma);
	}

}
