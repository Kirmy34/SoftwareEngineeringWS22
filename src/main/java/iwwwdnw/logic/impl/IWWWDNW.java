package iwwwdnw.logic.impl;

import iwwwdnw.duell.impl.Duell;


public class IWWWDNW implements iwwwdnw.logic.port.IWWWDNW {


	private Wissenskategorie[] wissenskategorien;


	/**
	* @link composition
	*/
	private iwwwdnw.logic.impl.WissensStreiter wissensStreiter;
	/**
	* @link composition
	*/
	private iwwwdnw.logic.impl.Feld feld;
	/**
	* @link composition
	*/
	private Duell duell;
	


	public int[] wuerfeln()
	{

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
	
	

	public boolean wissensstreiterBewegen(WissensStreiter wissensstreiter, Feld startfeld, Feld zielfeld)

	{
		if(wissensstreiter.getPreviousFeld().equals(zielfeld))
		{
			return false;
		}
		
		if (zielfeld.istFrei()) {
			
			if(startfeld != null)
			{
				startfeld.setWissensstreiter(null);
			}
			
			zielfeld.setWissensstreiter(wissensstreiter);
			return true;
		}

		if (zielfeld.vonGegnerBesetzt(wissensstreiter)) {
			this.duell.startDuell(this.wissensStreiter.getSpieler(), zielfeld.getWissensstreiter().getSpieler());
			return true;

		}

		return false;

	}
	
	public void vomHeimZumStartfeld(WissensStreiter wissensStreiter, StartFeld startFeld)
	{
		this.wissensstreiterBewegen(wissensStreiter, null, startFeld);
	}

	public Wissenskategorie[] getWissenskategorien() {
		return wissenskategorien;
	}

	public void setWissenskategorien(Wissenskategorie[] wissenskategorien) {
		this.wissenskategorien = wissenskategorien;
	}
	
	
	
	
	
	
	
	
}
