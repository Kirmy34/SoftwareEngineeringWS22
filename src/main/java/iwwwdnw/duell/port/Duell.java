package iwwwdnw.duell.port;

import iwwwdnw.logic.impl.Frage;
import iwwwdnw.logic.impl.Fragenkarte;
import iwwwdnw.logic.impl.Wissenskategorie;
import iwwwdnw.spielzug.port.SpielBrett;
import iwwwdnw.spielzug.impl.Spieler;

public interface Duell 
{
	
	
	public void startDuell(SpielBrett spieler1, Spieler spieler2, Wissenskategorie wissenskategorie);
	public Frage getFrage(Spieler spieler, Fragenkarte fragenkarte);
	public enum Antwort{ RICHTIG, FALSCH, KEINE_ANTWORT}
	public Antwort antworten(Spieler spieler, boolean antworten[], Frage frage);
	public Frage getFrage_spieler_1();
	public void setFrage_spieler_1(Frage frage_spieler_1);
	public Frage getFrage_spieler_2();
	public void setFrage_spieler_2(Frage frage_spieler_2);
	
	
	
	
	
	
}
