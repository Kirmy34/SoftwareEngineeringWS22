package iwwwdnw.spielzug.port;

import Analyse.ObjectModel.WissensStreiter;

public interface Spielzug 
{
	public int wuerfeln();
	public void wissensstreiterBewegen(WissensStreiter wissensstreiter);
	public void vomHeimZumStartfeld(WissensStreiter wissensstreiter);

	
}
