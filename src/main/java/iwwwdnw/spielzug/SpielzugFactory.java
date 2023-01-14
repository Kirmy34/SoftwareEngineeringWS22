package iwwwdnw.spielzug;

import java.awt.Color;

import iwwwdnw.spielzug.impl.SpielBrettImpl;
import iwwwdnw.spielzug.impl.SpielerImpl;
import iwwwdnw.spielzug.impl.SpielzugFactoryImpl;
import iwwwdnw.spielzug.impl.StartFeldImpl;
import iwwwdnw.spielzug.impl.WissensStreiterImpl;

public interface SpielzugFactory {
	SpielzugFactory FACTORY = new SpielzugFactoryImpl();
	
	SpielBrettImpl createSpielBrettImpl(int anzahlSpieler);
	SpielerImpl createSpielerImpl(int id, int alter, Color farbe, String name);
	StartFeldImpl createStartFeldImpl();
	WissensStreiterImpl createWissensStreiterImpl();
}
