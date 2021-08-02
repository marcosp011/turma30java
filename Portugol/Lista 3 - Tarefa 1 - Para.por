programa
{
	
	funcao inicio()
	{
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  

		 */
		 // Variaveis - todas que forem numerica, colocar o valor. (evita problemas)
		 const inteiro HABITANTES = 20
		 real salario = 0.00
		 real numeroFilhos = 0.00
		 real mediaSalarios = 0.00
		 real totalSalarios = 0.00
		 real mediaFilhos = 0.00
		 real totalFilhos = 0.00
		 real percentualSalario100 = 0.00
		 real contadorSalarioAte100 = 0.00
		 real maiorSalario = 0.00
		 // Entradas
		 	para (inteiro x=1; x<=HABITANTES; x++){
		 		escreva("Digite o salarios:")
		 		leia(salario)
		 		escreva("digite o numero de filhos:")
		 		leia(numeroFilhos)
		 		
		 // Processamentos 	

		 totalSalarios = totalSalarios + salario
		 totalFilhos = totalFilhos + numeroFilhos

		 se (salario > maiorSalario){
		 	maiorSalario = salario
		 }

		 se (salario <= 100.00){
		 	contadorSalarioAte100++
		 }
		 }
		 // O Laço terminal 
		 percentualSalario100 = (contadorSalarioAte100 / HABITANTES) * 100
		 mediaFilhos = (totalFilhos / HABITANTES)
		 mediaSalarios = (totalSalarios / HABITANTES)

		 // Saidas

		 escreva("\nTotal salarial: R$", totalSalarios)
		 escreva("\nMedia salarial: R$", mediaSalarios)
		 escreva("\nTotal de Filhos: ", totalFilhos)
		 escreva("\nMedia de Filhos: ", mediaFilhos)
		 escreva("\nMaior Salário: R$", maiorSalario)
		 escreva("\nPercentual até R$100,00 de Salário: % ", percentualSalario100)
		 
		 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */