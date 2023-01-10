package iwwwdnw.duell.impl;


import java.util.Collection;
import java.util.List;

import iwwwdnw.logic.impl.Frage;
import iwwwdnw.logic.impl.Fragenkarte;
import iwwwdnw.logic.impl.Spieler;
import iwwwdnw.logic.impl.Wissenskategorie;

public class Duell implements iwwwdnw.duell.port.Duell{
	
	private Frage frage_spieler_1;
	private Frage frage_spieler_2;

	public void startDuell(Spieler spieler1, Spieler spieler2, Wissenskategorie wissenskategorie) 
	{
		Fragenkarte fragenkarte = wissenskategorie.getFragenkarte();
		this.setFrage_spieler_1(this.getFrage(spieler1, fragenkarte));
		this.setFrage_spieler_2(this.getFrage(spieler2, fragenkarte));
		
		
		
		
		
		
	}
	
	
	public Frage getFrage(Spieler spieler, Fragenkarte fragenkarte)
	{
		Frage fragen[] = fragenkarte.getFragen();
		
		
		if(spieler.getAlter() >= 4 && spieler.getAlter() <= 7)
		{
			return fragen[0];
		}
		else if(spieler.getAlter() >= 8 && spieler.getAlter() <= 14)
		{
			return fragen[1];
		}
		else 
		{
			return fragen[2];
		}
		
	}
	
	
	public Antwort antworten(Spieler spieler, boolean antworten[], Frage frage)
	{
		Boolean[] richtigeAntworten = (Boolean[])(frage.getAntworten().values().toArray());
		
		boolean alle_falsch = true;
		for(int i = 0; i < antworten.length; i++)
		{
			if(antworten[i])
			{
				alle_falsch = false;
			}
		}
		
		
		
		for(int i = 0; i < antworten.length; i++)
		{
			if(antworten[i] != richtigeAntworten[i] && alle_falsch)
			{
				return Antwort.KEINE_ANTWORT;
			}
			else if(antworten[i] != richtigeAntworten[i])
			{
				return Antwort.FALSCH;
			}
		}
		
		return Antwort.RICHTIG;
	}


	public Frage getFrage_spieler_1() {
		return frage_spieler_1;
	}


	public void setFrage_spieler_1(Frage frage_spieler_1) {
		this.frage_spieler_1 = frage_spieler_1;
	}
	
	public Frage getFrage_spieler_2() {
		return frage_spieler_2;
	}


	public void setFrage_spieler_2(Frage frage_spieler_2) {
		this.frage_spieler_2 = frage_spieler_2;
	}
	
	
}
