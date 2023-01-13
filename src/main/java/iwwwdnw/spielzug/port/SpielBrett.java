package iwwwdnw.spielzug.port;

import java.util.List;

import iwwwdnw.spielzug.impl.SpielBrettImpl;

public interface SpielBrett {
	public final int BEGINSTARTFELD = 280;
	public final int MAXAMOUNTFELDER = 300;

	public void erstelleSpielBrett(int anzahlSpieler, int felderAussen);

	public void setStartfeldOwner(Spieler spieler);
	
	public boolean wissensstreiterBewegen(Feld startfeld, Feld zielfeld);
	
	public boolean vomHeimZumStartfeld(WissensStreiter wissensstreiter, StartFeld startfeld);
	
	public List<Feld> getPossibleWays(WissensStreiter wissensstreiter);
	
	public void duellVorbei(WissensStreiter w1, WissensStreiter w2);
	
	public void spielzugVorbei(WissensStreiter wissensstreiter); //nur, um previousFeld zu löschen

	
	
	
	
	public SpielBrettImpl getSpielBrettImpl();
	
	public List[] getSpielBrett();

}