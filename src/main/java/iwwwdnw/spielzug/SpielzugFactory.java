package iwwwdnw.spielzug;

import iwwwdnw.spielzug.impl.SpielBrettImpl;
import iwwwdnw.spielzug.impl.SpielerImpl;
import iwwwdnw.spielzug.impl.SpielzugFactoryImpl;
import iwwwdnw.spielzug.impl.StartFeldImpl;
import iwwwdnw.spielzug.impl.WissensStreiterImpl;

public interface SpielzugFactory {
	SpielzugFactory FACTORY = new SpielzugFactoryImpl();
	
	SpielBrettImpl spielBrettImpl(int anzahlSpieler);
	SpielerImpl spielerImpl();
	StartFeldImpl startFeldImpl();
	WissensStreiterImpl wissensStreiterImpl();
}
