
public class ProjetoEcomerce {
	
/*
 *  (FIM) 4 - (faça - enquanto) valida a pergunta continuar compras.
				} enquanto(Texto.caixa_alta(continuarCompras) == "S")

				para (x=0 ; x < DIVERSIDADE_PRODUTOS ; x++) {
				// novo estoque inicial é formado pelos produtos que não foram retirados da compra anterior.
				estoqueInicial[x] -= estoqueSelecionado[x]

				// no fim da compra o carrinho se esvazia
				carrinho[x] = 0 
				}

 */

		while(Texto.caixa_alta(continuarComparas)== 'S')
			
			for(x=0; x < DIVERSIDADE_PRODUTOS; x++) {
				estoqueInicial[x] -= estoqueSelecionado [x];
				carrinho[x]=0;
		}
		
		/*
		 * //NOTA FISCAL APÓS A COMPRA SER FINALIZADA ---------------------------------------------------------------------------------------------------------------------------------------------------------- //
				paginaDeCompras(x, codigo, produto, valor, estoqueInicial, carrinho, estoqueSelecionado, carrinhoVazio)

				notaFiscal(x, estoqueSelecionado, valorFatura, quantidadeFaturas, codigo, valor, produto, Tipos.cadeia_para_inteiro(numeroNotaFiscal, 10)+1, contadorNotaFiscal) 
				contadorNotaFiscal ++
				numeroNotaFiscal = Tipos.inteiro_para_cadeia(contadorNotaFiscal-1, 10)
		 */
		
		paginaDeCompras(x, codigo, produto, valor, estoqueInicial, estoqueSelecionado, carrinhoVazio);
		contadorNotafiscal++;		
		numeroNotaFiscal = Tipos.intero_paracadeia(contadorNotaFiscal-1,10);
		
		
		/*
		 * faca {
				// 10 - (faça - enquanto) valida a resposta para voltar à página inicial.
					escreva("\n Voltar para a página inicial? [S/N]: ")
					leia(respostaVoltarInicio)
					
					se (Texto.caixa_alta(respostaVoltarInicio) == "N") {
						escreva("  ATÉ BREVE!!!")
						pare
					}
					senao se (Texto.caixa_alta(respostaVoltarInicio) != "S") {
						escreva("Digite uma resposta válida!\n")
					}

				// (FIM) 10 - (faça - enquanto) valida a resposta para voltar à página inicial.	
				} enquanto(Texto.caixa_alta(respostaVoltarInicio) != "N" e Texto.caixa_alta(respostaVoltarInicio) != "S")
		 */
		
		  do {
			  System.out.println("\nVoltar para a pagina inicial? [S/N]");
			  respostaVoltaInicio= leia.nextln;
			  
			  if(Texto.caixa_alta(respostaVoltarInicio) == 'N'){
			   System.out.println("ATÉ BREVE!!");
			  }
			  else if (Texto.caixa_alta(respostaVoltarInicio) != 'S') {
				  System.out.println("Escreva uma operação valida!");
			  }
			  
			  
			  
		  } while(Texto.caixa_alta(respostaVoltarInicio) != 'N' && Texto.caixa_alta(respostaVoltarInicio) != 'S') {
			  
			  /*
			   * // condicional responsável pela respostas [S/N]
			senao se (Texto.caixa_alta(fazerCompras) == "N") {
				escreva("  ATÉ BREVE!!!")
				pare
			} 
			senao {
				limpa()
				cabecalho(3)
				escreva("  Digite uma resposta válida!\n")
			   */
			  
		  } else if(Texto.caixa_alta(fazerCompras)== 'N') {
			  System.out.println("ATÉ BREVE!!");
			  
		  }
		  else {
			  cabecalho(3);
			  System.out.println("Digite uma resposta Válida!");
		  }
		  /*
		   * 	// 1 - (laço faça - enquanto) valida "fazer compras".
		} enquanto (Texto.caixa_alta(fazerCompras) != "N" e Texto.caixa_alta(fazerCompras) != "S")
		

	//a compra foi finalizada, então quando retornar ao início, o estoque selecionado será igual a zero.
	para (x=0 ; x < DIVERSIDADE_PRODUTOS ; x++) {
		estoqueSelecionado[x] = 0
	}
		   */
		  while (Texto.caixa_alta(fazerCompras) != 'N' && Texto.caixa_alta(fazerCompras) != 'S') {
			  for (x=0; < DIVERSIDADE_PRODUTOS; x++) {
				  estoqueSelecionado[x]= 0;
				  continuarCompras = 'S';
			  }
		  }
		  while (Texto.caixa_alta(respostaVoltarInicio) == 'S');

}

/*  compra foi finalizada, então quando retornar ao início, a resposta continuar compras volta a ser SIM.
	continuarCompras = "S"

	//(laço faça - enquanto) responsável por retornar ao início após a compra.	
	} enquanto(Texto.caixa_alta(respostaVoltarInicio) == "S")
	
} // FIM DO PROGRAMA -------------------------------------------------------------------- //


