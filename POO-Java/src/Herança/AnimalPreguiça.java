package Heran�a;

public class AnimalPregui�a extends Animal {
	private Boolean sobeEmArvore;
	
	public AnimalPregui�a(String _nome, int _idade, String _som, Boolean sobeEmArvore) {
		super(_nome, _idade, _som);
		this.sobeEmArvore = sobeEmArvore;
	}

	public  void  sobeEmArvore() {
		sobeEmArvore = true ;
    }
	
	public  String subirEmArvore() {
		if(sobeEmArvore == true ) {
			return ("sobe em �rvore");
   	 	} else {
   	 		return ("n�o sobe em �rvore.");
   	 	}
   	}
}
