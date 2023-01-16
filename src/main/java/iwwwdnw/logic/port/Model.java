package iwwwdnw.logic.port;

import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.statemachine.port.Subject;

public interface Model extends Subject {
	
	void service(int req);
	
	Spieler[] getSpieler();
	
	int[] getWuerfel();
	
	String getMessage();
	
	Feld getFeld(int id);
}
