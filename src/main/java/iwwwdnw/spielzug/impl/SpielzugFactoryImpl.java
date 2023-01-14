package iwwwdnw.spielzug.impl;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.spielzug.SpielzugFactory;
import iwwwdnw.spielzug.port.Spielzug;

public class SpielzugFactoryImpl implements SpielzugFactory{
	@Override
	public SpielBrettImpl spielBrettImpl(int anzahlSpieler) {
		SpielBrettImpl sb = null;
		sb = new SpielBrettImpl(anzahlSpieler); 
		return sb;
	}
	
	public SpielerImpl createSpielerImpl(int id, int alter, Farben farbe, String name) {
		SpielerImpl s = null;
		s = new SpielerImpl(id, alter, farbe, name); 
		return s;
	}

	@Override
	public StartFeldImpl startFeldImpl() {
		StartFeldImpl sf = null;
		sf = new StartFeldImpl();
		return sf;
	}

	@Override
	public WissensStreiterImpl wissensStreiterImpl() {
		WissensStreiterImpl ws = null;
		ws = new WissensStreiterImpl(); 
		return ws;
	}

	@Override
	public SpielerImpl spielerImpl() {
		// TODO Auto-generated method stub
		return null;
	}

}
