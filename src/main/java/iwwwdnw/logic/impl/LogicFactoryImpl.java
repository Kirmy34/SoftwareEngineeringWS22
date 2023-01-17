package iwwwdnw.logic.impl;

import iwwwdnw.logic.LogicFactory;
import iwwwdnw.logic.port.Model;
import iwwwdnw.logic.port.Subject;
import iwwwdnw.spielzug.impl.SpielzugImpl;
import iwwwdnw.statemachine.impl.StateMachineImpl;;


public class LogicFactoryImpl implements LogicFactory {

	ModelImpl model;

	@Override
	public Model model() {

		if (this.model == null) {
			this.model = new ModelImpl(new StateMachineImpl(), new SpielzugImpl());
		}

		return this.model;
	}
	
	public Subject subject() {

		if (this.model == null) {
			this.model = new ModelImpl(new StateMachineImpl(), new SpielzugImpl());
		}

		return this.model;
	}

}
