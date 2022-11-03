package p1;

public enum Rang {

	DVA(2),
	TRI(3),
	CETIRI(4),
	PET(5),
	SEST(6),
	SEDAM(7),
	OSAM(8),
	DEVET(9),
	DESET(10),
	ZANDAR(12),
	KRALJICA(13),
	KRALJ(14),
	KEC(15),
	DZOKER(16);
	
	
	
	private int vrednost;
	
	Rang(int vrednsot){
		this.vrednost = vrednsot;
	}

	public int getVrednost() {
		return vrednost;
	}

	public void setVrednost(int vrednost) {
		this.vrednost = vrednost;
	}
	
	
	
}
