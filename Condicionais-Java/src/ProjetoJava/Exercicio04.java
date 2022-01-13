package ProjetoJava;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner ler = new  Scanner(System.in);
		int numero;
		double raizQuadrada, elevadoQuadrado;
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
			raizQuadrada = Math.sqrt(numero);
			System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);
		} else {
			System.out.println("O número " + numero + " é impar.");
			elevadoQuadrado = numero * numero;
			System.out.println(numero + " elevado ao quadrado é " + elevadoQuadrado);
		}
	}

}
