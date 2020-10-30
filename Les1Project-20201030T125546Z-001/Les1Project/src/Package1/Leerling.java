package Package1;

public class Leerling {
	public String naam;
	public int leeftijd;
	
	public Leerling(String nm, int lft) {
		setNaam(nm);
		setLeeftijd(lft);
	}

	public void setLeeftijd(int lft) {
		if (lft > 10 && lft < 65) {
			leeftijd = lft;
			System.out.println("Leeftijd aangepast");
		} else {
			System.out.println("De leeftijd voldoet niet aan de eisen");
		}
	}
	
	public void setNaam(String nm) {
		naam = nm;
	}
	public String getNaam() {
		return naam;
	}
	
	public int getLeeftijd() {
		return leeftijd;
	}
	
	public String stelJeVoor() {
		return String.format("Mijn naam is %s en ik ben %d jaar oud", getNaam(), getLeeftijd() );
	}
}
