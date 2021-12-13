package JavaProject;

import java.util.Scanner;

public class Matriz04 {

	public static void main(String[] args) {
		int N[][] = new int[3][3], linha, coluna, soma=0, diagonal;
		Scanner ler = new  Scanner(System.in);
		
		for (linha=0; linha<3; linha++) 
		{
			for (coluna=0; coluna<3; coluna++) 
			{
				System.out.print("Digite um número: ");
				N[linha][coluna] = ler.nextInt();
				soma=soma+N[linha][coluna];
			}
		}
		
		for (linha=0; linha<3; linha++) 
		{
			for (coluna=0; coluna<3; coluna++) 
			{
				System.out.print(N[linha][coluna] + "\t");
			}
			System.out.println();
		}
		
		diagonal=(N[0][0]+N[1][1]+N[2][2]);
		
		System.out.println("\nA soma de todos os valores da matriz é " + soma);
		System.out.println("\nA soma dos valores da diagonal principal é " + diagonal);
	}
}
