programa
{
	
	funcao inicio()
	{
		inteiro ponto[5], n, maiorPonto=0

		para (n=0; n<5; n++)
		{
			escreva("Digite a ", n+1, "ª pontuação: ")
			leia(ponto[n])
			 se (ponto[n] > maiorPonto)
			 {
			 	maiorPonto = ponto[n]
			 }
			
		}
		limpa()
			para (n=0; n<5; n++)
		{
			escreva("\nA ", n+1, "ª pontuação é ", ponto[n])			
		}
		escreva("\n")
		escreva("\nA maior pontuação é ", maiorPonto)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */