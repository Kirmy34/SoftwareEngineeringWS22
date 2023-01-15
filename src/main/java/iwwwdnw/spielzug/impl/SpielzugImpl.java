package iwwwdnw.spielzug.impl;

import java.util.List;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.spielzug.port.*;

public class SpielzugImpl implements Spielzug{

	private SpielBrett spielbrett;
	private List<Spieler> spielerListe;
	private Spieler amZug;
	private int[] wuerfel;
	private int bewegungenNochÜbrig;
	
	
	@Override
	public void wuerfeln() {
		
		this.bewegungenNochÜbrig = 0;
		
		for(int i  = 0; i < 2; i++)
		{
			this.wuerfel[i] = getZufallszahl();
			this.bewegungenNochÜbrig += this.wuerfel[i];
		}		

		

		
	}
	
	
	private int getZufallszahl()
	{

		return (int)(6.0 * Math.random() + 1);
	
	}
	
	
	

	@Override
	public void wissensstreiterBewegen(WissensStreiter wissensstreiter) 
	{
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
	}

	@Override
	public void vomHeimZumStartfeld(WissensStreiter wissensstreiter) {
		// TODO Auto-generated method stub
		
	}

}
