package Herança;

public class AnimalCachorro extends Animal {
	private Boolean corre;
	
	public AnimalCachorro(String _nome, int _idade, String _som, Boolean corre) {
		super(_nome, _idade, _som);
		this.corre = corre;
	}

	public  void  corre() {
   	 	corre = true ;
    }
	
	public  String correr() {
		if(corre == true ) {
			return ("corre.");
   	 	} else {
   	 		return ("não corre.");
   	 	}
   	}
}
