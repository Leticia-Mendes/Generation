package POO_01;

import java.util.Scanner;

public class AviaoExemplo {
	
	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		Aviao aviao1 = new Aviao ();
		System.out.print("Digite o modelo do avi�o: ");
		aviao1._modelo = ler.nextLine();
		System.out.print("Digite a companhia a�rea: ");
		aviao1._companhia = ler.nextLine();
		System.out.print("Digite a cor do avi�o: ");
		aviao1._cor=ler.nextLine();
		
		System.out.print(aviao1.atributosAviao());
		aviao1.ligar();
		aviao1.decolar();
	}
}
