package PacoteJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tempoSegundos, horas, minutos, segundos;
		System.out.print("Digite o tempo de dura��o do evento em segundos: ");
		tempoSegundos = ler.nextInt();
		
		horas = (tempoSegundos/3600);
		minutos = (tempoSegundos%3600)/60;
		segundos = ((tempoSegundos%3600)%60);
		System.out.println("A dura��o do evento � " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	}
}
