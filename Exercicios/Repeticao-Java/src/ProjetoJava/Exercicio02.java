package ProjetoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero, n, par=0, impar=0;
		
		Scanner ler = new  Scanner(System.in);
		
		for (n=1; n<=10; n++) {
			System.out.print("Digite o " + n + "º número: ");
			numero = ler.nextInt();
			if (numero%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Você digitou " + par + " números pares.");
		System.out.println("Você digitou " + impar + " números impares.");
		
	}
}
