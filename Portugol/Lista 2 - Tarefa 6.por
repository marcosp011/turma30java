programa
{
	

	funcao inicio()
	/*
	 *  Exercicio 6 - Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
	 */
	{
		cadeia nome 
		inteiro idade

		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite sua idade: ")
		leia(idade)

		
		limpa()

		se (idade <= 7){
			escreva("Nadador(a), ",nome," você esta na categoria Infantil A\n ")		
		}
		senao se (idade <= 11){
			escreva("Nadador(a), ",nome," você esta na categoria Infantil B\n ")	
		}
		senao se (idade <= 13){
			escreva("Nadador(a), ",nome," você esta na categoria Juvenil A\n ")
		}
		senao se (idade <= 17){
			escreva("Nadador(a), ",nome," você esta na categoria Juvenil B\n ")
		}
		senao {
			escreva("Nadador(a), ",nome," você é de maior e está na categoria Adulta\n ")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 474; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */