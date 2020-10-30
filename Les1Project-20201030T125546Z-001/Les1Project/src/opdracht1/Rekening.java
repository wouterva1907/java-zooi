package opdracht1;

public class Rekening {
	
	//variabelen
	private String rekeningNummer;
	private double saldo;
	private boolean geblokkeerd;
	
	//constructor
	public Rekening(String nmr, double sld, boolean blk) {
		setRekeningNummer(nmr);
		setSaldo(sld);
		setGeblokkeerd(blk);
	}
	
	//setters
	public void setRekeningNummer(String nmr) {
		rekeningNummer = nmr;
	}
	
	public void setSaldo(double sld) {
		saldo = sld;
	}
	
	public void setGeblokkeerd(boolean blk) {
		geblokkeerd = blk;
	}
	
	//getters
	public String getRekeningNummer() {
		return rekeningNummer;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean getGeblokkeerd() {
		return geblokkeerd;
	}
	
	//tostring
	public String toString() {
		return String.format("rekening %s heeft een saldo van %d en is " + getGeblokkeerd(), getRekeningNummer(), getSaldo() );
	}
}


