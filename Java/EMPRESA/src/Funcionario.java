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
	prote��o
	construtor completo
	subclasse terceiro
	double atributo adicional
	construtor completo
	prote�ao 
	salario terceiro � quase igual do funcionario, precisa somar o valor adicional
	m�todo vai se chamar salario()
	 */
	