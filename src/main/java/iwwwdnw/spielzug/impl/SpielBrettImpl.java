package iwwwdnw.spielzug.impl;

import java.util.ArrayList;
import java.util.List;

import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.SpielBrett;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.StartFeld;

public class SpielBrettImpl implements SpielBrett
{
	
	private Feld[] felder;
	private StartFeld[] startfelder;
	private List spielbrett[] = new List[300];
	
	
	
	
	public SpielBrettImpl(int anzahl_spieler)
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
	
	
	
	
	
	
	@Override
	public void erstelleSpielBrett(int anzahlSpieler, int felderAussen)
	{

		int anzahlSpielerInit = anzahlSpieler;
		//Feldinstanzen erstellen
		
		for(int i = 0; i < BEGINSTARTFELD; i++)
		{
			this.felder[i] = new FeldImpl();
			this.felder[i].setId(i);
		}
		
		for(int i = BEGINSTARTFELD; i < MAXAMOUNTFELDER; i++)
		{
			this.startfelder[i - 280] = new StartFeldImpl();
			this.startfelder[i].setId(i);
		}
		
		
		int sid = BEGINSTARTFELD; // sid: Startfeld-ID
		int fid = 0; // fid : Feld-ID
		
		
		
		// Äußerer Kreis:
		for(; anzahlSpieler > 1; anzahlSpieler--) // müsste stimmen!
		{
			
			// erstes Startfeld in Liste speichern und initialisieren:
			this.spielbrett[sid] = new ArrayList<Integer>();
			this.spielbrett[sid].add(fid);
			sid++;
			
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;
			
			
			for(int i = 1; i < felderAussen - 1; i++)
			{
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}
			
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(sid);
			this.spielbrett[fid].add(fid - 1);
			fid++;
			
		}
		
		if(anzahlSpieler == 1)
		{
			this.spielbrett[sid] = new ArrayList<Integer>();
			this.spielbrett[sid].add(fid);
			sid++;
			
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;
			
			
			for(int i = 1; i < felderAussen - 1; i++)
			{
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}
			
		
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(BEGINSTARTFELD);
			this.spielbrett[fid].add(fid -1);
			fid++;

		}
		
		
		// Innerer Kreis:
		
		felderAussen -= 4;
		anzahlSpieler = anzahlSpielerInit;
		int beginInnerCircle = sid;
		
		for(; anzahlSpieler > 1; anzahlSpieler--) // müsste stimmen!
		{
			
			// erstes Startfeld in Liste speichern und initialisieren:
			this.spielbrett[sid] = new ArrayList<Integer>();
			this.spielbrett[sid].add(fid);
			sid++;
			
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;
			
			
			for(int i = 1; i < felderAussen - 1; i++)
			{
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}
			
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(sid);
			this.spielbrett[fid].add(fid - 1);
			fid++;
			
		}
		
		if(anzahlSpieler == 1)
		{
			this.spielbrett[sid] = new ArrayList<Integer>();
			this.spielbrett[sid].add(fid);
			sid++;
			
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;
			
			
			for(int i = 1; i < felderAussen - 1; i++)
			{
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}
			
		
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(beginInnerCircle);
			this.spielbrett[fid].add(fid -1);
			fid++;


		}
		
		
		anzahlSpieler = anzahlSpielerInit;
		// Verbindungsfelder
		
		// Startfelder verbinden
		for(int i = 0,  s = BEGINSTARTFELD ; i < anzahlSpieler; i++, s++)
		{
			this.spielbrett[s].add(fid);
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(s);
			this.spielbrett[fid].add(fid + 1);
			fid++;
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[fid].add(sid);
			this.spielbrett[s + anzahlSpieler].add(fid);
			fid++;
			
		}
		
		// Mittelfelder verbinden
		
		int mitteAussen = felderAussen / 2;
		int mitteInnen = (felderAussen - 4) / 2;
		for(int i = 0, a = mitteAussen + 1, in = mitteInnen + 1; i < anzahlSpieler; i++)
		{
			this.spielbrett[a].add(fid);
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(a);
			fid++;
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[fid].add(in);
			this.spielbrett[in].add(fid);
			fid++;
			a += mitteAussen * 2;
			in += mitteInnen * 2;
			
		}
		
		
	}
	
	
	@Override
	public void setStartfeldOwner(iwwwdnw.logic.impl.Spieler spieler, int anzahlSpieler) {
		// TODO Auto-generated method stub
		
		
		for(int i = 0; i < startfelder.length; i++)
		{
			if(startfelder[i].getOwner() == null)
			{
				startfelder[i].setOwner(spieler);
				startfelder[i + anzahlSpieler].setOwner(spieler);
				break;
			}
		}
		
		
		
		
		
	}
	
	
	
	@Override
	public Feld[] getFelder() {
		return felder;
	}
	
	@Override
	public void setFelder(Feld[] felder) {
		this.felder = felder;
	}
	
	@Override
	public StartFeld[] getStartfelder() {
		return startfelder;
	}
	
	@Override
	public void setStartfelder(StartFeld[] startfelder) {
		this.startfelder = startfelder;
	}






	@Override
	public void setStartfelder(iwwwdnw.spielzug.port.StartFeld[] startfelder) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void setStartfeldOwner(Spieler spieler, int anzahlSpieler) {
		// TODO Auto-generated method stub
		
	}



	
	
	
}
