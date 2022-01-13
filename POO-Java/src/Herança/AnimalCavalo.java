package Herança;

public class AnimalCavalo extends Animal {
private Boolean corre;
	
	public AnimalCavalo(String _nome, int _idade, String _som, Boolean corre) {
		super(_nome, _idade, _som);
		this.corre = corre;
	}
	
	public  void  corre() {
   	 	corre = true ;
    }
	
	public  String correr() {
		if(corre == true ) {
			return ("corre bem rápido.");
   	 	} else {
   	 		return ("não corre.");
   	 	}
   	}
		
}
