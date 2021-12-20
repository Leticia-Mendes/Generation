package Collection;

import java.util.HashSet;
import java.util.Set;

public class ListaEstoque {

	public static void main(String[] args) {
		
		Set<Estoque> conjunto = new HashSet<Estoque>();
		
		Estoque a = new Estoque("camiseta", "p", "branca", 20);
		Estoque b = new Estoque("camiseta", "m", "preta", 28);
		Estoque c = new Estoque("camiseta", "g", "azul", 25);
		Estoque d = new Estoque("camiseta", "gg", "verd", 20);
		Estoque e = new Estoque("shorts", "m", "jeans", 16);
		Estoque f = new Estoque("shorts", "g", "jeans", 22);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		conjunto.add(e);
		conjunto.add(f);
		
		System.out.println("Produtos no estoque: ");
		
		System.out.println("\n" + conjunto);

		
		
		
	}
}
