package JavaProject;

import java.util.Scanner;

public class Matrix03 {
	
	public static void main(String[] args) {
		int N1[][] = new int[4][6], N2[][] = new int[4][6], n1l, n1c, n2l, n2c;
		int M1[][] = new int[4][6], M2[][] = new int[4][6], m1l, m1c, m2l, m2c, l, c;
		Scanner ler = new  Scanner(System.in);
		
		//atribui valor para matriz N1
		for (l=0; l<4; l++) 
		{
			for (c=0; c<4; c++) 
			{
				System.out.print("Digite o valor [" + l + "][" + c + "] da matriz N1: ");
				N1[l][c] = ler.nextInt();
			}
		}
		
		System.out.println(("\n"));
		//atribui valor para matriz N2
		for (l=0; l<4; l++) 
		{
			for (c=0; c<4; c++) 
			{
				System.out.print("Digite o valor [" + l + "][" + c + "] da matriz N2: ");
				N2[l][c] = ler.nextInt();
			}
		}
		
		//atribui valor para matriz M1 = (N1+N2)
		for (l=0; l<4; l++) 
		{
			for (c=0; c<4; c++) 
			{
				M1[l][c] = N1[l][c] + N2[l][c];
			}
		}
		
		//atribui valor para matriz M2 = (N1-N2)
		for (l=0; l<4; l++) 
		{
			for (c=0; c<4; c++) 
			{
				M1[l][c] = N1[l][c] - N2[l][c];
			}
		}
		
		System.out.println(("\n"));
		//mostra a matriz M1
		for (l=0; l<4; l++)
		{
			for (c=0; c<6; c++)
			{
				System.out.print(M1[l][c]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println(("\n"));
		//mostra a matriz M2
		for (l=0; l<4; l++)
		{
			for (c=0; c<6; c++)
			{
				System.out.print(M2[l][c]+ "\t");
			}
			System.out.println();
		}
		
	}
}
