package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		System.out.println(" ---- Test ----");
		
//		Spil spil = new Spil();
		
//		spil.stampaj();
		
//		spil.sortiraj();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
//		spil.stampaj();
		testIgre();
		
		
		
//		System.out.println("sada ima: " + spil.velicina() + " karata");
//		System.out.println("Uzimamo naizmenicnu kartu: " + spil.uzmiIzSredine());
//		System.out.println("sada ima: " + spil.velicina() + " karata");
		
		
		
		
		

	}
	
	public static Igrac testIgre() {
		
		
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		
		Spil spil = new Spil();
		spil.promesaj();
		
		//prolazimo kroz imena, pravimo igrace i svakom dodeljujemo po jednu kartu sa vrha spila
		for(Ime i : Ime.values()) {
			igraci.add( new Igrac(i,spil.uzmiOdGore()));
		}
		
		for(Igrac ig : igraci) {
			System.out.println(ig);
		}
		
		Collections.sort(igraci,Collections.reverseOrder());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		for(Igrac ig : igraci) {
			System.out.println(ig);
		}
		
		
		
		
		
		return null;
	}//pokretanjeIgre

}
