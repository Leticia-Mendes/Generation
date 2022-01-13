package ProjetoJava;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		int pessoa, idade, sexo, comportamento, calmo=0, mulheresNervosas=0, homensAgressivos=0, 
		outrosCalmos=0, nervosas40=0, calmos18=0;
		
		Scanner ler = new  Scanner(System.in);
		
		System.out.print("Digite o numero de cadastro do indivíduo (0 - 150). Para sair digite um número maior que 150. ");
		pessoa = ler.nextInt();
		
			while(pessoa<=150)  {
				System.out.println("Digite a idade: ");
				idade = ler.nextInt();
				System.out.println("Selecione o sexo: ");
				System.out.println("[1] Feminino - [2] Masculino - [3] Outro ");
				sexo = ler.nextInt();
				System.out.println("Selecione o comportamento: ");
				System.out.println("[1] Calmo - [2] Nervosa - [3] Agressivo ");
				comportamento = ler.nextInt();
				if (comportamento == 1) {
					calmo++;
				} 
				
				if (sexo == 1 && comportamento == 2) {
					mulheresNervosas++;
				}  else if (sexo == 2 && comportamento == 3) {
					homensAgressivos++;
				} else if (sexo == 3 && comportamento == 1) {
					outrosCalmos++;
				} else if (comportamento == 2 && idade >= 40) {
					nervosas40++;
				} else if (comportamento == 1 && idade <= 18) {
					calmos18++;
				}
				System.out.print("Digite o numero de cadastro do indivíduo (0 - 150). Para sair digite um número maior que 150. ");
				pessoa = ler.nextInt();
			}
			
			System.out.println("Análise das pessoas cadastradas.");
			System.out.println(calmo + " pessoa(s) calma(s).");
			System.out.println(mulheresNervosas + " mulher(es) nervosa(s).");
			System.out.println(homensAgressivos + " homem(ns) agressivo(s).");
			System.out.println(outrosCalmos + " outro(s) calmo(s).");
			System.out.println(nervosas40 + " pessoa(s) nervosa(s) com mais de 40 anos.");
			System.out.println(calmos18 + " pessoa(s) calma(s) com menos de 18 anos.");
	
	}

}
