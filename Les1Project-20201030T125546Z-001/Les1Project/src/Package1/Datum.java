package Package1;

public class Datum {
	
	private int dag;
	private int maand;
	private int jaar;
	
	//constructor datum
	public Datum(int dg, int mnd, int jr) {
		setDag(dg);
		setMaand(mnd);
		setJaar(jr);
	}
	
	//setters
	public void setDag(int dg) {
		dag = dg;
	}
	
	public void setMaand(int mnd) {
		maand = mnd;
	}
	
	public void setJaar(int jr) {
		jaar = jr;
	}
	
	//getters
	public int getDag() {
		return dag;
	}
	
	public int getMaand() {
		return maand;
	}
	
	public int getJaar() {
		return jaar;
	}
	
	//print
	public String printDatum(Datum datum1) {
		return String.format("%02d/%02d/%d", getDag(), getMaand(), getJaar());
		
		
	}
	

}
	
