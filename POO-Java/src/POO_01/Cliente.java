package POO_01;

public class Cliente {
	private String _nome;
	private String _sobrenome;
	private String _genero;
	
	
	//método construtor
	public Cliente (String nome, String sobrenome, String genero)
	{
		_nome = nome;
		_sobrenome = sobrenome;
		_genero = genero;
		
	}
	
	//get
	public String getDadosCliente()
	{
		String dadosCliente = _nome + " " + _sobrenome + ", " + _genero;
		return dadosCliente;
	}
	
}


