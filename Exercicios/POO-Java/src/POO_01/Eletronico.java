package POO_01;

public class Eletronico {
	String produto;
	String fabricante;
	String cor;

	void ligar() {
		System.out.println("A " + this.produto + " está ligada.");
	}
	
	public String getDadosEletronico() {
		String dadosEletronico = produto + " da fabricante " + this.fabricante;
		return dadosEletronico;
	}
	
	void desligar() {
	System.out.println("A " + this.produto + " foi desligado.");
	}
}
