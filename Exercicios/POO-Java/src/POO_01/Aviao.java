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
    		 System.out.printf("\nO aviao est� desligado.");
    	 }
     }
	 
	 public void atributosAviao() 
	 {
    	 System.out.printf("\nA aviao � da companhia "+ this._companhia);
    	 System.out.printf("\nO modelo do avi�o � " + this._modelo);
    	 System.out.printf("\nA cor do aviao � " + this._cor);
     }
	 
	 
}
