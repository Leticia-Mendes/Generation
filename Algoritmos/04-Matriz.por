programa
{
	
	funcao inicio()
	{
		inteiro N[3][3], linha, coluna, soma=0, diagonal

		para(linha=0; linha<3; linha++)
		{
			para(coluna=0; coluna<3; coluna++)
			{
				escreva("Digite um número: ")
				leia(N[linha][coluna])
				soma=soma+N[linha][coluna]
			}
		}
		limpa()
		para(linha=0; linha<3; linha++)
		{
			para(coluna=0; coluna<3; coluna++)
			{
				escreva(N[linha][coluna], "\t")
			}
			escreva("\n")
		}
		diagonal=(N[0][0]+N[1][1]+N[2][2])
		
		escreva("\nA soma de todos os valores da matriz é ", soma)
		escreva("\nA soma dos valores da diagonal principal é ", diagonal)
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 610; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */