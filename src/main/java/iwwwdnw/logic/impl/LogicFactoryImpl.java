package iwwwdnw.logic.impl;

import iwwwdnw.logic.LogicFactory;
import iwwwdnw.spielzug.SpielzugFactory;
import iwwwdnw.spielzug.impl.SpielzugImpl;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.port.Subject;

public class LogicFactoryImpl implements LogicFactory {

	SpielzugImpl spielzug;

	@Override
	public Spielzug spielzug() {

		if (this.spielzug == null) {
			this.spielzug = new SpielzugImpl();
		}

		return this.spielzug;
	}

	@Override
	public Subject subject() {
		return spielzug();
	}

}
