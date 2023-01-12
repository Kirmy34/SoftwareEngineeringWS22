package iwwwdnw.spielzug.port;

public interface SpielBrett {
	public final int BEGINSTARTFELD = 280;
	public final int MAXAMOUNTFELDER = 300;

	public Feld[] getFelder();

	public void setFelder(Feld[] felder);

	public StartFeld[] getStartfelder();

	public void setStartfelder(StartFeld[] startfelder);

	public void erstelleSpielBrett(int anzahlSpieler, int felderAussen);

	public void setStartfeldOwner(Spieler spieler, int anzahlSpieler);
	
	

}