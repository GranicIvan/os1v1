package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Spil {

	
	
	ArrayList<Karta> karte = new ArrayList<Karta>();

	public Spil() {
		
		
		for(Rang r : Rang.values()) {
			for(Boja b : Boja.values()) {
				karte.add(new Karta(b,r)  );
			}
		}
		karte.remove(karte.size()-1);//Ovde brisemo dva dzokera koja su nam visak
		karte.remove(karte.size()-1);//jer smo napravili 56 karata sa 4 dzokera
		
	}//konstruktor
	
	int velicina() {
		return karte.size();
	}
	
	Karta uzmiOdGore() {
		Karta k = karte.remove(0);
		
		return k;
	}
	
	Karta uzmiOdDole() {
		Karta k = karte.remove(karte.size());
		return k;
	}
	
	Karta uzmiIzSredine() {
		Random r = new Random();
		int mesto = r.nextInt(karte.size());
		
		Karta k = karte.remove(mesto);
		return k;
	}
	
	void staviGore(Karta k) {
		karte.add(karte.size(), k);
	}
	
	void staviDole(Karta k)  {
		karte.add(k);
	}
	
	void staviUSredinu(Karta k) {
		Random r = new Random();
		int mesto = r.nextInt(karte.size());
		
		karte.add(mesto, k);
		
	}
	
	
	void promesaj() {
		Collections.shuffle(karte);
	}
	
	
	void stampaj() {
		for(Karta k : karte) {
			System.out.println(k);
		}
	}
	
	void sortiraj() {
		Collections.sort(karte ,Collections.reverseOrder());
	}
	
}
