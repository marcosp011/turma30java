package lista4programas;

import lista4classes.Aviao;

public class Lista4Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * 2 - Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
		 *  em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as
		 *   informa��es deste objeto no console.
		 */
		
		Aviao maquina1 = new Aviao("Boeing-747", "John Travolta");
		
		maquina1.manutencao = true;
		
		maquina1.possibilidadeVoar();
		
		maquina1.ligarMotor('S');
		
		if (maquina1.motor) {
			System.out.println("Decolagem j� vai come�ar!");
			System.out.printf("A viagem durar� cerca de %.2f horas.",(maquina1.horasViagem(18460, 988)));
		}
		
		
		
		

	}

}