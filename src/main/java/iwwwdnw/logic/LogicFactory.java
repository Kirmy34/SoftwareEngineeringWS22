package iwwwdnw.logic;

import iwwwdnw.logic.impl.LogicFactoryImpl;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.port.Subject;

public interface LogicFactory {
	LogicFactory FACTORY = new LogicFactoryImpl();

	Spielzug spielzug();

	Subject subject();

}
