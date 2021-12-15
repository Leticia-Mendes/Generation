package POO_01;

public class Aviao {
	String _companhia;
	String _modelo;
	String _cor;
	private Boolean _ligado;
	
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
    		 System.out.print( "Pode iniciar processo de decolagem " );
    	 }
    	 else {
    		 System.out.print("O aviao está desligado");
    	 }
     }
	 
	 public void atributosAviao() {
    	 System.out.println("A aviao é da companhia "+this._companhia);
    	 System.out.println("O modelo do avião é "+this._modelo);
    	 System.out.println("A cor do aviao é "+this._cor);
     }
	 
	 
}
