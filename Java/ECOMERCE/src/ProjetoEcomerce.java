
public class ProjetoEcomerce {
	
/*
 *  (FIM) 4 - (fa�a - enquanto) valida a pergunta continuar compras.
				} enquanto(Texto.caixa_alta(continuarCompras) == "S")

				para (x=0 ; x < DIVERSIDADE_PRODUTOS ; x++) {
				// novo estoque inicial � formado pelos produtos que n�o foram retirados da compra anterior.
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
		 * //NOTA FISCAL AP�S A COMPRA SER FINALIZADA ---------------------------------------------------------------------------------------------------------------------------------------------------------- //
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
				// 10 - (fa�a - enquanto) valida a resposta para voltar � p�gina inicial.
					escreva("\n Voltar para a p�gina inicial? [S/N]: ")
					leia(respostaVoltarInicio)
					
					se (Texto.caixa_alta(respostaVoltarInicio) == "N") {
						escreva("  AT� BREVE!!!")
						pare
					}
					senao se (Texto.caixa_alta(respostaVoltarInicio) != "S") {
						escreva("Digite uma resposta v�lida!\n")
					}

				// (FIM) 10 - (fa�a - enquanto) valida a resposta para voltar � p�gina inicial.	
				} enquanto(Texto.caixa_alta(respostaVoltarInicio) != "N" e Texto.caixa_alta(respostaVoltarInicio) != "S")
		 */
		
		  do {
			  System.out.println("\nVoltar para a pagina inicial? [S/N]");
			  respostaVoltaInicio= leia.nextln;
			  
			  if(Texto.caixa_alta(respostaVoltarInicio) == 'N'){
			   System.out.println("AT� BREVE!!");
			  }
			  else if (Texto.caixa_alta(respostaVoltarInicio) != 'S') {
				  System.out.println("Escreva uma opera��o valida!");
			  }
			  
			  
			  
		  } while(Texto.caixa_alta(respostaVoltarInicio) != 'N' && Texto.caixa_alta(respostaVoltarInicio) != 'S') {
			  
			  /*
			   * // condicional respons�vel pela respostas [S/N]
			senao se (Texto.caixa_alta(fazerCompras) == "N") {
				escreva("  AT� BREVE!!!")
				pare
			} 
			senao {
				limpa()
				cabecalho(3)
				escreva("  Digite uma resposta v�lida!\n")
			   */
			  
		  } else if(Texto.caixa_alta(fazerCompras)== 'N') {
			  System.out.println("AT� BREVE!!");
			  
		  }
		  else {
			  cabecalho(3);
			  System.out.println("Digite uma resposta V�lida!");
		  }
		  /*
		   * 	// 1 - (la�o fa�a - enquanto) valida "fazer compras".
		} enquanto (Texto.caixa_alta(fazerCompras) != "N" e Texto.caixa_alta(fazerCompras) != "S")
		

	//a compra foi finalizada, ent�o quando retornar ao in�cio, o estoque selecionado ser� igual a zero.
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

/*  compra foi finalizada, ent�o quando retornar ao in�cio, a resposta continuar compras volta a ser SIM.
	continuarCompras = "S"

	//(la�o fa�a - enquanto) respons�vel por retornar ao in�cio ap�s a compra.	
	} enquanto(Texto.caixa_alta(respostaVoltarInicio) == "S")
	
} // FIM DO PROGRAMA -------------------------------------------------------------------- //


