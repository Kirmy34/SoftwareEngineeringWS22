package iwwwdnw.spielzug;

import iwwwdnw.spielzug.impl.Farben;
import iwwwdnw.spielzug.impl.SpielBrettImpl;
import iwwwdnw.spielzug.impl.SpielerImpl;
import iwwwdnw.spielzug.impl.SpielzugFactoryImpl;
import iwwwdnw.spielzug.impl.StartFeldImpl;
import iwwwdnw.spielzug.impl.WissensStreiterImpl;

public interface SpielzugFactory {
	SpielzugFactory FACTORY = new SpielzugFactoryImpl();
	
	SpielBrettImpl createSpielBrettImpl(int anzahlSpieler);
	SpielerImpl createSpielerImpl(int id, int alter, Farben farbe, String name);
	StartFeldImpl createStartFeldImpl();
	WissensStreiterImpl createWissensStreiterImpl();
}
