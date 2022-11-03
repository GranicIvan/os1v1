package p1;

public class Karta implements Comparable<Karta>{

	Boja boja;
	Rang rang;
	

	
	public Boja getBoja() {
		return boja;
	}
	public void setBoja(Boja boja) {
		this.boja = boja;
	}
	public Rang getRang() {
		return rang;
	}
	public void setRang(Rang rang) {
		this.rang = rang;
	}
	
	public Karta(Boja boja, Rang rang) {
		super();
		this.boja = boja;
		this.rang = rang;
	}
	@Override
	public int compareTo(Karta o) {
		return this.rang.getVrednost()  - o.rang.getVrednost();
	}
	@Override
	public String toString() {
		return String.format("%-4s %s", boja, rang);
	}
	
	
	

	
	
	
}// kalsa
