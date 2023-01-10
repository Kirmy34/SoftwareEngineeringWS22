package iwwwdnw.logic.port;

import iwwwdnw.logic.impl.Feld;

public interface WissensStreiter
{
	public iwwwdnw.logic.impl.Spieler getSpieler();
	public void setSpieler(iwwwdnw.logic.impl.Spieler spieler);
	public Feld getPreviousFeld();
	public void setPreviousFeld(Feld previousFeld);
}