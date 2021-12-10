package ProjetoJava;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		int numero, soma=0;
		Scanner ler = new  Scanner(System.in);
		
		do {
			System.out.println("Digite um número. Para encerrar digite 0.");
			numero = ler.nextInt();
			soma += numero;
		}while(numero!=0);
		
		System.out.println("A soma dos números digitados é " + soma);
	}

}
