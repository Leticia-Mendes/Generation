package Herança;

public class Animal {
	private String _nome;
	private int _idade;
	private String _som;
	
	public Animal(String nome, int idade, String som) {
		this._nome = nome;
		this._idade = idade;
		this._som = som;
	}

	public String get_nome() {
		return _nome;
	}

	public void set_nome(String _nome) {
		this._nome = _nome;
	}

	public int get_idade() {
		return _idade;
	}

	public void set_idade(int _idade) {
		this._idade = _idade;
	}

	public String get_som() {
		return _som;
	}

	public void set_som(String _som) {
		this._som = _som;
	}

		
}
