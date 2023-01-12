package iwwwdnw.spielzug;

import iwwwdnw.spielzug.impl.SpielzugFactoryImpl;

public interface SpielzugFactory {
	SpielzugFactory FACTORY = new SpielzugFactoryImpl();
}
