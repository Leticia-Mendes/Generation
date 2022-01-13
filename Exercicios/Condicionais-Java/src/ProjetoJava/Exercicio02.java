package ProjetoJava;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, numero3;
		Scanner ler = new  Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = ler.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = ler.nextInt();
		
		if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("Os números são iguais");
		} else if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1 + " é o maior número");
		}  else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println(numero2 + " é o maior número");
		} else if (numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(numero3 + " é o maior número");
		} 
	}
}
