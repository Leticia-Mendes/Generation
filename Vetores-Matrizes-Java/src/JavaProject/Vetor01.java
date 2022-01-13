package JavaProject;

import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		int ponto[] = new int[5], n, maiorPonto=0;
		Scanner ler = new  Scanner(System.in);
		
		for (n=0; n<5; n++) 
		{
			System.out.print("Digite a "+ (n+1) + "ª pontuação: ");
			ponto[n] = ler.nextInt();
			if (ponto[n] > maiorPonto) 
			{
				maiorPonto = ponto[n];
			}
		}
		
		for (n=0; n<5; n++) 
		{
			System.out.println("\nA "+ (n+1) + "ª pontuação é " + ponto[n]);
		}
		System.out.println("\nA maior pontuação é "+ maiorPonto);
	}
}
