package lista4programas;

import lista4classes.ContaBancaria;

public class Lista4Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 6 - Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe,
		 *  em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as 
		 *  informa��es deste objeto no console.
		 */ 
		ContaBancaria minhaConta = new ContaBancaria("Carlinhos", 500);
		
		
		minhaConta.setValorTotal(300);
		
		minhaConta.setDividas(900);
		
		if (minhaConta.dividas) {
		System.out.println("Parece que voc� est� endividado!");
		}
		else {
		System.out.println("Tudo certo com a sua conta.");
		}
	}

}