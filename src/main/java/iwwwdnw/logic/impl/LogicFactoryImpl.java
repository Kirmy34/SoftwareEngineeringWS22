package iwwwdnw.logic.impl;

import iwwwdnw.logic.LogicFactory;
import iwwwdnw.logic.port.Model;
import iwwwdnw.spielzug.SpielzugFactory;
import iwwwdnw.spielzug.impl.SpielzugImpl;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.impl.StateMachineImpl;
import iwwwdnw.statemachine.port.Subject;


public class LogicFactoryImpl implements LogicFactory {

	Model model;

	@Override
	public Model model() {

		if (this.model == null) {
			this.model = new ModelImpl(new StateMachineImpl(), new SpielzugImpl());
		}

		return this.model;
	}

//	@Override
//	public Subject subject() {
//		return spielzug();
//	}

}
