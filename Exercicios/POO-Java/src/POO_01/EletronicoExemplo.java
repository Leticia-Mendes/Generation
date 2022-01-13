package POO_01;


public class EletronicoExemplo {
	
	public static void main(String[] args) {
		
		Eletronico eletronico1 = new Eletronico();

		eletronico1.produto = "Fritadeira elétrica";
		eletronico1.fabricante = "Eletrolux";
		eletronico1.cor = "preta";
		
		System.out.println(eletronico1.getDadosEletronico());
		eletronico1.ligar();
		eletronico1.desligar();
		
	}

}
