package ProjetoJava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		int numero;
		double soma=0, media3, multiplo3=0;
		Scanner ler = new  Scanner(System.in);
		
		do {
			System.out.println("Digite um número. Para sair digite 0.");
			numero = ler.nextInt();
			
			if (numero%3==0 && numero!=0) {
				soma += numero;
				multiplo3++;
			}
		}while(numero!=0);
		
		media3 = soma/multiplo3;
		System.out.println("A média dos números multiplo de 3 é " + media3);
		
	}
}
