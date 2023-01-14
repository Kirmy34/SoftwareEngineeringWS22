package iwwwdnw.spielzug.impl;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.spielzug.Farben;
import iwwwdnw.spielzug.SpielzugFactory;
import iwwwdnw.spielzug.port.Spielzug;

public class SpielzugFactoryImpl implements SpielzugFactory{

	@Override
	public SpielBrettImpl createSpielBrettImpl(int anzahlSpieler) {
		SpielBrettImpl sb = null;
		sb = new SpielBrettImpl(anzahlSpieler);
		return sb;
	}

	@Override
	public SpielerImpl createSpielerImpl(int id, int alter, Farben farbe, String name) {
		SpielerImpl s = null;
		s = new SpielerImpl(id,alter,farbe,name);
		return s;
	}

	@Override
	public StartFeldImpl createStartFeldImpl() {
		StartFeldImpl sf = null;
		sf = new StartFeldImpl();
		return sf;
	}

	@Override
	public WissensStreiterImpl createWissensStreiterImpl() {
		WissensStreiterImpl w = null;
		w = new WissensStreiterImpl();
		return w;
	}
	
}
