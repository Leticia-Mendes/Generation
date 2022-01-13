package Herança;

public class AnimalPreguiça extends Animal {
	private Boolean sobeEmArvore;
	
	public AnimalPreguiça(String _nome, int _idade, String _som, Boolean sobeEmArvore) {
		super(_nome, _idade, _som);
		this.sobeEmArvore = sobeEmArvore;
	}

	public  void  sobeEmArvore() {
		sobeEmArvore = true ;
    }
	
	public  String subirEmArvore() {
		if(sobeEmArvore == true ) {
			return ("sobe em árvore");
   	 	} else {
   	 		return ("não sobe em árvore.");
   	 	}
   	}
}
