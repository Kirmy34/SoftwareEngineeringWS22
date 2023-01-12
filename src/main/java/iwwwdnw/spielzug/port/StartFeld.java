package iwwwdnw.spielzug.port;

public interface StartFeld extends Feld
{
	public Spieler getOwner();
	public void setOwner(Spieler owner);
}