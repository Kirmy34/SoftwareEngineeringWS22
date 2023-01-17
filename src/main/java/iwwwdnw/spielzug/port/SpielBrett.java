package iwwwdnw.spielzug.port;

import java.util.List;




public interface SpielBrett {
	public final int BEGINSTARTFELD = 280;
	public final int MAXAMOUNTFELDER = 300;

	public void setStartfeldOwner(Spieler spieler);
	
	public boolean wissensstreiterBewegen(Feld startfeld, Feld zielfeld);
	
	public boolean vomHeimZumStartfeld(WissensStreiter wissensstreiter, int id);
	
	public List<Feld> getPossibleWays(WissensStreiter wissensstreiter);
	
	public void spielzugVorbei(WissensStreiter wissensstreiter); //nur, um previousFeld zu löschen

	public boolean duellVerloren(WissensStreiter wissensstreiter);
	
	public StartFeld[] getStartfelder();
	
	boolean istStartFeldvonSpieler(Spieler sp, int feldId);
	
	Feld getFeld(int id);

	boolean spielerHatFreiesStartFeld(int spielerID);
	
}