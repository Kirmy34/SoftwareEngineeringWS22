package iwwwdnw.logic.port;

import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.Spieler;

public interface Model {
	
	void service(int req);
	
	Spieler[] getSpieler();
	
	String getState();
}
