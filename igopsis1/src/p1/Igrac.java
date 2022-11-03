package p1;

public class Igrac implements Comparable<Igrac>{

	Ime ime;
	Karta karta;
	
	
	
	public Igrac(Ime ime, Karta karta) {
		super();
		this.ime = ime;
		this.karta = karta;
	}

	public Igrac()
	{}


	public Ime getIme() {
		return ime;
	}



	public void setIme(Ime ime) {
		this.ime = ime;
	}



	public Karta getKarta() {
		return karta;
	}



	public void setKarta(Karta karta) {
		this.karta = karta;
	}



	@Override
	public String toString() {		
		return String.format("Igrac %6s ima: %s", ime, karta);
	}
	
	
	@Override
	public int compareTo(Igrac i) {
		return this.karta.compareTo(i.karta) ;
	}
	
	
}
