package iwwwdnw.spielzug.port;

import java.util.List;




public interface SpielBrett {
	public final int BEGINSTARTFELD = 280;
	public final int MAXAMOUNTFELDER = 300;

	public void erstelleSpielBrett(int anzahlSpieler, int felderAussen);

	public void setStartfeldOwner(Spieler spieler);
	
	public boolean wissensstreiterBewegen(Feld startfeld, Feld zielfeld);
	
	public boolean vomHeimZumStartfeld(WissensStreiter wissensstreiter, StartFeld startfeld);
	
	public List<Feld> getPossibleWays(WissensStreiter wissensstreiter);
	
	public void spielzugVorbei(WissensStreiter wissensstreiter); //nur, um previousFeld zu löschen

	public boolean duellVerloren(WissensStreiter wissensstreiter);
	
	public List[] getSpielBrett();
	

	
}