package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Takmicari {

	ArrayList<Igrac> igraci = new ArrayList<Igrac>();
	
	
	public void dodaj(Igrac i ) {
		igraci.add(i);
	}
	
	
	
	public void sortirajOdNajjaceg() {
		Collections.sort(igraci,Collections.reverseOrder());
	}
	
	
	public void izracunajPobednike(){
				
		Collections.sort(igraci,Collections.reverseOrder());
		final Igrac pom = igraci.get(0);
		
		List lista = igraci.stream()
				.filter(o -> o.getKarta().getRang().equals(pom.getKarta().getRang()) )
				.collect(Collectors.toList());
		
		igraci = new ArrayList<Igrac>(lista);
				
		
		
		System.out.println("\nPreostali rakmicari su: ");
		for(Igrac i : igraci) {
			System.out.print(i+", ");
		}
			
	}//izracunaj
	
	
	public void dodeliKarte(Spil s) {
		System.out.println("\n ----- NOVO IZVLACENJE -----");
		s.promesaj();

		for(Igrac ig : igraci) {
			ig.setKarta(s.uzmiOdGore());
			System.out.println(ig.getIme() + " je izvukao/la " + ig.getKarta());
		}
		System.out.println();
	}//dodeliKarte
	
	
	public void napraviIgrace() {
		
		for(Ime i : Ime.values()) {
			igraci.add( new Igrac(i,null));
		}
		
	}//napraviIgraceIDodajKarte
	
	
}
