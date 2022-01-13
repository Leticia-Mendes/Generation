package POO_01;

public class Aviao {
	String _companhia;
	String _modelo;
	String _cor;
	Boolean _ligado;
	
	 public  void  ligar() 
	 {
    	 _ligado = true ;
     }
	
	 public  void  desligar() 
	 {
    	 _ligado = false ;
     }
	
	 public  void  decolar() 
	 {
    	 if(_ligado == true ) {
    		 System.out.printf("\nPode iniciar processo de decolagem.");
    	 }
    	 else {
    		 System.out.printf("\nO aviao está desligado.");
    	 }
     }
	 
	 public void atributosAviao() 
	 {
    	 System.out.printf("\nA aviao é da companhia "+ this._companhia);
    	 System.out.printf("\nO modelo do avião é " + this._modelo);
    	 System.out.printf("\nA cor do aviao é " + this._cor);
     }
	 
	 
}
