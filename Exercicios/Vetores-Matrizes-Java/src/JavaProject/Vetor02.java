package JavaProject;

import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		int dado[] = new int[10], d, maior=0, soma=0, media=0, maiorVezes=0;
		Scanner ler = new  Scanner(System.in);
		
		for (d=0; d<10; d++) 
		{
			System.out.print("Digite o " + (d+1) + "� n�mero sorteado no dado: ");
			dado[d] = ler.nextInt();
			soma = soma + dado[d];
			if (dado[d] > maior) {
				maior = dado[d];
			}
		}
		
		//verifica qts vezes apareceu o maior 
		for (d=0; d<10; d++) 
		{
			if (dado[d] == maior) 
			{
				maiorVezes++;
			}
		}
		
		for (d=0; d<10; d++) 
		{
			System.out.println(dado[d] + "\t");
		}
		media=soma/d;
		
		System.out.println("\nA m�dia aritm�tica dos n�meros lan�ados � " + media);
		System.out.println("\nO maior n�mero lan�ado � " + maior + ", ele apareceu " + maiorVezes + " vezes");
	}
}
