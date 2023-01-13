package iwwwdnw.spielzug.impl;

public class WissensStreiter implements iwwwdnw.spielzug.port.WissensStreiter{
	
	private Spieler spieler;
	private Feld previousFeld = null;
	private Feld feld = null;

	
	@Override
	public Spieler getSpieler() {
		return spieler;
	}

	@Override
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}

	
	@Override
	public Feld getPreviousFeld() {
		return previousFeld;
	}

	
	@Override
	public void setPreviousFeld(Feld previousFeld) {
		this.previousFeld = previousFeld;
	}
	
	@Override
	public void setFeld(Feld feld)
	{
		this.feld = feld;
	}
	
	
	@Override
	public Feld getFeld()
	{
		return this.feld;
	}
	
}
