package iwwwdnw.logic.impl;

import iwwwdnw.logic.LogicFactory;
import iwwwdnw.logic.port.Model;
import iwwwdnw.spielzug.impl.SpielzugImpl;
import iwwwdnw.statemachine.impl.StateMachineImpl;;


public class LogicFactoryImpl implements LogicFactory {

	Model model;

	@Override
	public Model model() {

		if (this.model == null) {
			this.model = new ModelImpl(new StateMachineImpl(), new SpielzugImpl());
		}

		return this.model;
	}

}
