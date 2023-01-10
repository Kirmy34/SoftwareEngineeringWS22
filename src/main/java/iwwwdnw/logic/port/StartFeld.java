package iwwwdnw.logic.port;

import iwwwdnw.logic.impl.Spieler;

public interface StartFeld 
{
	public Spieler getOwner();
	public void setOwner(Spieler owner);
}