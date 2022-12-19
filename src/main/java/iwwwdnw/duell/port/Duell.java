package iwwwdnw.duell.port;

import Analyse.ObjectModel.Fragenkarte;
import Analyse.ObjectModel.Wissenskategorie;

public interface Duell 
{

	public Fragenkarte bestimmeWissenskategorie();
	public boolean antworten(String antwort);
	public void wissenstandzeigerErhoehen(Wissenskategorie kategorie);
	public void wissenstandzeigerVerringern(Wissenskategorie kategorie);
	
	
	
	
	
}
