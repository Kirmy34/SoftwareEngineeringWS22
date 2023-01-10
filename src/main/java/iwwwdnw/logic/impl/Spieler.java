package iwwwdnw.logic.impl;



public class Spieler implements iwwwdnw.logic.port.Spieler {
	
	private int id;
	private int alter;
	private int[] wissensstandsanzeige;
	private Farben farbe;
	private String name;
	private WissensStreiter[] wissensstreiter;

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public Farben getFarbe() {
		return farbe;
	}

	public void setFarbe(Farben farbe) {
		this.farbe = farbe;
	}

	public int[] getWissensstandsanzeige() {
		return wissensstandsanzeige;
	}

	public void setWissensstandsanzeige(int[] wissensstandsanzeige) {
		this.wissensstandsanzeige = wissensstandsanzeige;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WissensStreiter[] getWissensstreiter() {
		return wissensstreiter;
	}

	public void setWissensstreiter(WissensStreiter[] wissensstreiter) {
		this.wissensstreiter = wissensstreiter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
