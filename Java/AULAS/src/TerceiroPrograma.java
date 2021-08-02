import java.util.Locale;
import java.util.Scanner;

public class TerceiroPrograma {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US); // Mudar localidade para Estados Unidos 
		String Nome; // String é a cadeia
		double TemperaturaF; // Double é para numeros inteiros reais //
		double TemperaturaC;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu Nome: ");
		Nome = leia.next();
		System.out.print("Digite a temperatura em Celsius: ");
		TemperaturaC = leia.nextDouble();
		
		TemperaturaF = (TemperaturaC*1.8)+32;
		
		System.out.print("Olá, "+Nome+" a temperatura é "+TemperaturaF+" Graus Farenheit");
		
		
	}
	
	
	

}
