package ProjetoJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero, n, par=0, impar=0;
		
		Scanner ler = new  Scanner(System.in);
		
		for (n=1; n<=10; n++) {
			System.out.print("Digite o " + n + "� n�mero: ");
			numero = ler.nextInt();
			if (numero%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Voc� digitou " + par + " n�meros pares.");
		System.out.println("Voc� digitou " + impar + " n�meros impares.");
		
	}
}
