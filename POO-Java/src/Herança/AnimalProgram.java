package Herança;

public class AnimalProgram {
	public static void main(String[] args) {
		
		AnimalCachorro cachorro1 = new AnimalCachorro("Clifford", 13, "late", true);
		System.out.println("Cachorro: " + cachorro1.get_nome() + ", " + cachorro1.get_idade() + " anos, " + cachorro1.get_som() + ", " + cachorro1.correr());
	
		AnimalCavalo cavalo1 = new AnimalCavalo("Ventania", 6, "relincha", true);
		System.out.println("Cavalo: "+ cavalo1.get_nome() + ", " + cavalo1.get_idade() + " anos, " + cavalo1.get_som() + ", " + cavalo1.correr());
		
		AnimalPreguiça preguiça1 = new AnimalPreguiça("Preguicinha", 8, "emite som", true);
		System.out.println("Preguiça: " + preguiça1.get_nome() + ", " + preguiça1.get_idade() + ", anos " + preguiça1.get_som() + ", " + preguiça1.subirEmArvore());
	
	}

}
