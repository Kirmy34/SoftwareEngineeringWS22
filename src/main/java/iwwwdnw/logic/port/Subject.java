package iwwwdnw.logic.port;

import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.Spieler;

public interface Subject {

	Spieler[] getSpieler();
	
	int[] getWuerfel();
	
	String getMessage();
	
	Feld getFeld(int id);

}
