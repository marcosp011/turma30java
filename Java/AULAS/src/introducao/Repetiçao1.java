package introducao;

public class Repeti�ao1 {
	public static void main (String args []) {
		
		int x;
		int soma=0;
		
		// La�o de repeti��o
		
		for(x=1;x<=10;x++) {
			System.out.printf("\n %d",x); //%d - Para puxar um numero inteir.
			soma = soma +x;
		}
		System.out.printf("\n Soma total: %d",soma);
	}

}
