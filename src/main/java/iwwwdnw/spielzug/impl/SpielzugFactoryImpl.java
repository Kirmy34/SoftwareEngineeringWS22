package iwwwdnw.spielzug.impl;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.spielzug.SpielzugFactory;
import iwwwdnw.spielzug.port.Spielzug;

public class SpielzugFactoryImpl implements SpielzugFactory{
	public SpielBrettImpl createSpielbrett(int anzahlSpieler) {
		SpielBrettImpl sb = null;
		sb = new SpielBrettImpl(anzahlSpieler); 
		return sb;
	}
	
	public SpielerImpl createSpielerImpl(int id, int alter, Farben farbe, String name) {
		SpielerImpl s = null;
		s = new SpielerImpl(id, alter, farbe, name); 
		return s;
	}
	
	public StartFeldImpl createStartFeldImpl() {
		StartFeldImpl sf = null;
		sf = new StartFeldImpl();
		return sf;
	}
	
	public WissensStreiterImpl createWissensStreiterImpl() {
		WissensStreiterImpl ws = null;
		ws = new WissensStreiterImpl(); 
		return ws;
	}

}
