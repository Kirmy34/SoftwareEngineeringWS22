package iwwwdnw.spielzug.port;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.statemachine.port.Subject;

public interface Spielzug extends Subject{
	public void wuerfeln();

	public boolean wissensstreiterBewegen(int feldId);

	public boolean vomHeimZumStartfeld(int feldId);
	
	public Spieler[] getSpieler();
	
	public int[] getWuerfel();
	
	public Spieler getSpielerAmZug();
	
	public int getBewegungen();
	
	Feld getFeld(int id);
	
	public boolean waehleStart(int id);
	
	boolean zielAuswaehlen(int id);
	
	void spielerWechseln();

}
