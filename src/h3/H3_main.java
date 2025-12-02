package h3;

public class H3_main {

	public static void main(String[] args) {
		
		Mensch Menschenobjekt1 = new Mensch();
		
		String name = "jojo";
		int gebJahr = 2006;

		Menschenobjekt1.setName(name);
		Menschenobjekt1.setGebJahr(gebJahr);
		Menschenobjekt1.setAlter();
		
		
		System.out.println("Name: " + Menschenobjekt1.getName());
		System.out.println("Geburtsjahr: " + Menschenobjekt1.getGebJahr());
		System.out.println("Alter: " + Menschenobjekt1.getAlter());
	}
}
