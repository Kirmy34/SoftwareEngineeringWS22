package iwwwdnw.spielzug.impl;

public class WissensStreiter implements iwwwdnw.spielzug.port.WissensStreiter{
	
	private Spieler spieler;
	private Feld previousFeld = null;

	public Spieler getSpieler() {
		return spieler;
	}

	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}

	public Feld getPreviousFeld() {
		return previousFeld;
	}

	public void setPreviousFeld(Feld previousFeld) {
		this.previousFeld = previousFeld;
	}
	
}
