package ProjetoJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, r, s, d;
		System.out.println("Defina valores númericos para A, B e C");
		System.out.print("Digite valor de A: ");
		a = ler.nextInt();
		System.out.print("Digite valor de B: ");
		b = ler.nextInt();
		System.out.print("Digite valor de C: ");
		c = ler.nextInt();
		
		r = (a + b)*(a + b);
		s = (b + c)*(b + c);
		d = (r + s) / 2;
		System.out.println("R = A + B² portanto o valor de R é " + r);
		System.out.println("S = B + C² portanto o valor de S é " + s);
		System.out.println("D = (R + S) / 2 portanto o valor de D é " + d);
	}
}
