package iwwwdnw.spielzug.impl;

import java.awt.Color;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.spielzug.SpielzugFactory;
import iwwwdnw.spielzug.port.Spielzug;

public class SpielzugFactoryImpl implements SpielzugFactory{
	
	Spielzug spielzug;

	@Override
	public SpielBrettImpl createSpielBrettImpl(int anzahlSpieler) {
		SpielBrettImpl sb = null;
		sb = new SpielBrettImpl(anzahlSpieler);
		return sb;
	}

	@Override
	public SpielerImpl createSpielerImpl(int id, int alter, Color farbe, String name) {
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

	@Override
	public Spielzug spielzug() {
		
	}
	
}
