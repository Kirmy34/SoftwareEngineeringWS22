package iwwwdnw.logic.impl;

import java.util.Vector;

public class SpielBrett implements iwwwdnw.logic.port.SpielBrett
{
	
	private Feld[] felder;
	private StartFeld[] startfelder;
	private Vector spielbrett;
	
	
	
	
	
	public SpielBrett(int anzahl_spieler)
	{
		switch(anzahl_spieler)
		{
		case 2: this.erstelleSpielBrett(2, 17);
			break;
		case 3:	this.erstelleSpielBrett(3, 15);
			break;
		case 4:	this.erstelleSpielBrett(4, 13);
			break;
		case 5:	this.erstelleSpielBrett(5, 11);
			break;
		default:	this.erstelleSpielBrett(6, 9);  // 6 Spieler oder Abfangen ungültiger Eingabe.
		}
	}
	
	
	
	
	
	public void erstelleSpielBrett(int anzahlSpieler, int felderInnen)
	{
		for(; anzahlSpieler > 1; anzahlSpieler--) // müsste stimmen!
		{
			
		}
		
		if(anzahlSpieler == 1)
		{
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	public Feld[] getFelder() {
		return felder;
	}
	public void setFelder(Feld[] felder) {
		this.felder = felder;
	}
	public StartFeld[] getStartfelder() {
		return startfelder;
	}
	public void setStartfelder(StartFeld[] startfelder) {
		this.startfelder = startfelder;
	}

	public Vector getSpielbrett() {
		return spielbrett;
	}

	public void setSpielbrett(Vector spielbrett) {
		this.spielbrett = spielbrett;
	}
	
	
	
	
	
	
}
