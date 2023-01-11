package iwwwdnw.logic.port;

import java.util.Vector;



public interface SpielBrett 
{
	public final int BEGINSTARTFELD = 280;
	public final int MAXAMOUNTFELDER = 300;
	public iwwwdnw.logic.impl.Feld[] getFelder();
	public void setFelder(iwwwdnw.logic.impl.Feld[] felder);
	public iwwwdnw.logic.impl.StartFeld[] getStartfelder();
	public void setStartfelder(iwwwdnw.logic.impl.StartFeld[] startfelder);
	public void erstelleSpielBrett(int anzahlSpieler, int felderAussen);
	public void setStartfeldOwner(iwwwdnw.logic.impl.Spieler spieler, int anzahlSpieler);
	
	
}