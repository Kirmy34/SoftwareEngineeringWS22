package iwwwdnw.spielzug.port;

public interface Spielzug {
	public void wuerfeln();

	public boolean vomHeimZumStartfeld(int feldId);

	public Spieler[] getSpieler();

	public int[] getWuerfel();

	public Spieler getSpielerAmZug();

	public int getBewegungen();

	Feld getFeld(int id);

	public boolean waehleStart(int id);

	boolean zielAuswaehlen(int id);

	void spielerWechseln();
	
	boolean spielerHatFreiesStartFeld(int spielerID);

}
