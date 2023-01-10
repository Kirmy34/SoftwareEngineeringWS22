package iwwwdnw.logic.port;

import iwwwdnw.logic.impl.Feld;
import iwwwdnw.logic.impl.StartFeld;
import iwwwdnw.logic.impl.WissensStreiter;
import iwwwdnw.logic.impl.Wissenskategorie;

public interface IWWWDNW 
{
	public int[] wuerfeln();
	public int getZufallszahl();
	public boolean wissensstreiterBewegen(WissensStreiter wissensstreiter, Feld startfeld, Feld zielfeld);
	public void vomHeimZumStartfeld(WissensStreiter wissensStreiter, StartFeld startFeld);
	public Wissenskategorie[] getWissenskategorien();
	public void setWissenskategorien(Wissenskategorie[] wissenskategorien);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}