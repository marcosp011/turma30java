import java.util.Locale;
import java.util.Scanner;

public class TerceiroPrograma {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US); // Mudar localidade para Estados Unidos //
		String Nome; // String � a cadeia //
		double TemperaturaF; // Double � para numeros inteiros reais //
		double TemperaturaC; // Double � para numeros inteiros reais //
		Scanner leia = new Scanner(System.in); // Scanner � Para ler teclado // 
		
		System.out.println("Digite o seu Nome: "); // Println leitura de string //
		Nome = leia.next(); // Leitura = precisa criar o Scanner para ler
		System.out.print("Digite a temperatura em Celsius: "); // Print ler numeros // 
		TemperaturaC = leia.nextDouble();
		
		TemperaturaF = (TemperaturaC*1.8)+32;
		
		System.out.print("Ol�, "+Nome+" a temperatura � "+TemperaturaF+" Graus Farenheit");
		
		
	}
	
	
	

}
