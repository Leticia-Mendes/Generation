package Collection;

public class Estoque {
	private String produto;
	private String tamanho;
	private String cor;
	private int quantidade;
	
	public Estoque(String produto, String tamanho, String cor, int quantidade) {
		this.produto = produto;
		this.tamanho = tamanho;
		this.cor = cor;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}