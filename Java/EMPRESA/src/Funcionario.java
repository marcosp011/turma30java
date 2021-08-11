package >;

public class Funcionario {
	private String matricula;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	//Construtor
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
}
	/*
	 * Strin matricula
	int = horasTrabalhadas
	double valorPorHora
	double calculoSalario
	
	
	horasTrabalhadas*valorporHora
	proteção
	construtor completo
	subclasse terceiro
	double atributo adicional
	construtor completo
	proteçao 
	salario terceiro é quase igual do funcionario, precisa somar o valor adicional
	método vai se chamar salario()
	 */
	