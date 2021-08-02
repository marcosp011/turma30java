programa
{
	funcao vazio imprime_linha(){
		escreva("\n-----------------------------------------\n")
	}
	
	funcao inicio()
	/*
	 * Exercicio 1 - Faça um programa que crie um vetor por leitura com 5 valores de 
	 * pontuação de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente
	 */
	{
		//Variaveis 
		
		const inteiro TOTAL_VALORES = 5
		real pontuacao [TOTAL_VALORES], maiorPontuacao = 0.00

		//Processamentos -  Condições 
		
		para (inteiro indice = 0; indice < TOTAL_VALORES; indice++){
			escreva("Por Favor insira a, ", indice+1,"ª pontuação : ")
			leia(pontuacao[indice])

			se (pontuacao[indice] > maiorPontuacao) {
				maiorPontuacao = pontuacao[indice]
			}

		
		}

		para (inteiro indice = 0; indice < TOTAL_VALORES; indice++){
			escreva(indice + 1, "ª pontuação - ", pontuacao[indice], "\n")
		}

		//Saída da pontuação

		imprime_linha()
		escreva("A maior pontuação foi : ",maiorPontuacao)
		imprime_linha()
		
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 463; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */