programa
{
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], n1l, n1c, n2l, n2c, M1[4][6], m1l, m1c, M2[4][6], m2l, m2c, l, c
		
		//atribui valor para matriz N1
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva("Digite o valor [", l,"][", c, "] da matriz N1: ")
				leia(N1[l][c])
			}
		}
		escreva("\n")
		//atribui valor para matriz N2
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva("Digite o valor ", l, c, " da matriz N2: ")
				leia(N2[l][c])
			}
		}
		
		limpa()
		//mostra a matriz N1
		escreva("Matriz N1:\n")
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva(N1[l][c], "\t")
			}
			escreva("\n")
		}
		escreva("\n")
		//mostra a matriz N2
		escreva("Matriz N2:\n")
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva(N2[l][c], "\t")
			}
			escreva("\n")
		}

		//Atribui valor para matriz M1 (N1+N2)
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				
				M1[l][c] = N1[l][c] + N2[l][c]
			}
		}
		escreva("\n")
		//mostra a matriz M1
		escreva("Matriz M1 = N1 + N2:\n")
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva(M1[l][c], "\t")
			}
			escreva("\n")
		}

		//Atribui valor para matriz M2 (N1-N2)
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				
				M2[l][c] = N1[l][c] - N2[l][c]
			}
		}
		escreva("\n")
		//mostra a matriz M2
		escreva("Matriz M2 = N1 - N2:\n")
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva(M2[l][c], "\t")
			}
			escreva("\n")
		}
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 257; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */