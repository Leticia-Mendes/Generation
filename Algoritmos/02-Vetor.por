programa
{
	
	funcao inicio()
	{
		inteiro dado[10], d, maior=0, soma=0, media=0, maiorvezes=0

		para (d=0; d<10; d++)
		{
			escreva("Digite o ", d+1, "º número sorteado no dado: ")
			leia(dado[d])
			soma=soma + dado[d]
			se (dado[d] > maior)
				{
					maior = dado[d]
				}
		}
		//verifica qts vezes apareceu o maior 
		para (d=0; d<10; d++)
		{
			se (dado[d] == maior)
			{
				maiorvezes++
			}
		}
		
		limpa()
		para (d=0; d<10; d++)
		{
			escreva(dado[d], "\t")
		}
		media=soma/d
		escreva("\n")
		escreva("\nA média aritmética dos números lançados é ", media)
		escreva("\nO maior número lançado é ", maior, ", ele apareceu ", maiorvezes, " vezes")
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */