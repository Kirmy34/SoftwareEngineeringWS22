package iwwwdnw.spielzug.port;

public interface WissensStreiter {
	
	
	public Spieler getSpieler();

	public void setSpieler(Spieler spieler);

	public Feld getPreviousFeld();

	public void setPreviousFeld(Feld previousFeld);
	
	public void setFeld(Feld feld);
	
	public Feld getFeld();

	public boolean istAufHeimatFeld();
}