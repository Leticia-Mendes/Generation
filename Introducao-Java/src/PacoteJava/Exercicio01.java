package PacoteJava;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, idadeDias;
		System.out.println("Digite a sua idade");
		System.out.print("Anos: ");
		anos = ler.nextInt();
		System.out.print("Meses: ");
		meses = ler.nextInt();
		System.out.print("Dias: ");
		dias = ler.nextInt();
		idadeDias = ((anos*365) + (meses*30) + dias);
		System.out.println("A sua idade em dias é "+ idadeDias + " dias.");
	
	}
}
