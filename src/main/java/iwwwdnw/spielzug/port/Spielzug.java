package iwwwdnw.spielzug.port;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.statemachine.port.Subject;

public interface Spielzug extends Subject{
	public void wuerfeln();

	public void wissensstreiterBewegen(WissensStreiter wissensstreiter);

	public void vomHeimZumStartfeld(WissensStreiter wissensstreiter);
	
	public Spieler[] getSpieler();
	
	public int[] getWuerfel();

}
