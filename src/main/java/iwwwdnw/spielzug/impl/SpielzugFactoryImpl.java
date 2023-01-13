package iwwwdnw.spielzug.impl;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.spielzug.SpielzugFactory;
import iwwwdnw.spielzug.port.Spielzug;

public class SpielzugFactoryImpl implements SpielzugFactory, Spielzug{

	@Override
	public int[] wuerfeln() {
		int rueckgabe[] = new int[2];
		
		for(int i  = 0; i < 2; i++)
		{
			rueckgabe[i] = getZufallszahl();
		}		

		return rueckgabe;
	}
	
	public int getZufallszahl()
	{

		return (int)(6.0 * Math.random() + 1);
	
	}

	@Override
	public void wissensstreiterBewegen(WissensStreiter wissensstreiter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vomHeimZumStartfeld(WissensStreiter wissensstreiter) {
		// TODO Auto-generated method stub
		
	}

}
