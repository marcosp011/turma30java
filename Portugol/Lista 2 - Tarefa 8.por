programa
{
	
//      for maior que 100, caso contrário imprimi-la com o valor zero.
	funcao inicio()
	{
		cadeia nome
		inteiro numero 

		escreva("Olá, por favor digite seu nome: ")
		leia(nome)
		escreva("Digite qualquer numero que venha a sua cabeça: ")
		leia(numero)
		
		limpa()

		se (numero > 100){
			escreva("Boa seu numero é: ",numero)
		}
		senao {
			escreva("0")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */