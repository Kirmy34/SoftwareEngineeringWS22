package iwwwdnw.spielzug.port;

public interface WissensStreiter {
	public Spieler getSpieler();

	public void setSpieler(Spieler spieler);

	public Feld getPreviousFeld();

	public void setPreviousFeld(Feld previousFeld);
}