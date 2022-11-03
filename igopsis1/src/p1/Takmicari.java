package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Takmicari {

	ArrayList<Igrac> igraci = new ArrayList<Igrac>();
	
	
	public void dodaj(Igrac i ) {
		igraci.add(i);
	}
	
	
	
	public void sortirajOdNajjaceg() {
		Collections.sort(igraci,Collections.reverseOrder());
	}
	
	
	public ArrayList<Igrac> vratiPobednike(){
		
		ArrayList<Igrac> pobednici = new ArrayList<Igrac>();
		
		Igrac pom = new Igrac();
		
		pom = igraci.remove(0);
		
		pobednici.add(pom);
		
		//prolazimo kroz preostale igrace
		for(int j = 0; j < igraci.size() ; j++) {
			
		}
		
		//kako da iteriram igrace
		//while( pom.compareTo(igraci) == 0)
		
		
		
		
		return null;
	}//vratiPobednike
	
	
}
