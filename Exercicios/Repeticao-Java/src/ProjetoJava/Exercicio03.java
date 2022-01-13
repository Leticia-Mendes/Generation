package ProjetoJava;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int idade, menor21=0, maior50=0;
		Scanner ler = new  Scanner(System.in);
		
		System.out.print("Para encerrar o programa digite '-99', para iniciar digite outro número: ");
		idade = ler.nextInt();
		
		while(idade!=-99)  {
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			if (idade<21) {
				menor21++;
			}
			if (idade>=50) {
				maior50++;
			}
			System.out.println(" ");
		}
		
		System.out.println(menor21 + " pessoas cadastradas tem menos de 21 anos.");
		System.out.println(maior50 + " pessoas cadastradas tem mais de 50 anos ou mais.");
	}

}
