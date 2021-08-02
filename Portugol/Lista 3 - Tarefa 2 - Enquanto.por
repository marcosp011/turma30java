programa
{
	inclua biblioteca Matematica --> Mat
		
	funcao inicio()
	{
	/*
	 * 2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	 * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
	 * deveremos observar na tela a seguinte sequência: 5 15 45 135
	 */


      // Variáveis 
	 cadeia nome
	 real numeroDigitado

	 //Processamento

	 escreva("Digite nome do usuario: ")
	 leia(nome)
	 escreva("Digite um numero para multiplicarmos até 100: ")
	 leia(numeroDigitado)

	 //laço de repetição enquanto
	 
	 enquanto(numeroDigitado < 100){
	 	numeroDigitado = numeroDigitado * 3
	 	escreva(Mat.arredondar(numeroDigitado, 2), "  ")
	 	
	 
	 }
	 
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 723; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */