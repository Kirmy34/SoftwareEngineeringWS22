package iwwwdnw.logic.port;

import java.util.Vector;

import iwwwdnw.logic.impl.Feld;
import iwwwdnw.logic.impl.StartFeld;

public interface SpielBrett 
{
	
	public Feld[] getFelder();
	public void setFelder(Feld[] felder);
	public StartFeld[] getStartfelder();
	public void setStartfelder(StartFeld[] startfelder);
	public Vector getSpielbrett();
	public void setSpielbrett(Vector spielbrett);
	public void erstelleSpielBrett(int anzahlSpieler, int felderInnen);
	
	
}