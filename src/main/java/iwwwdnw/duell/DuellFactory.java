package iwwwdnw.duell;

import iwwwdnw.duell.impl.DuellFactoryImpl;

public interface DuellFactory {
	DuellFactory FACTORY = new DuellFactoryImpl();
	
}
