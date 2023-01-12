package iwwwdnw.statemachine.impl;

import iwwwdnw.logic.port.Observer;
import iwwwdnw.statemachine.StatemachineFactory;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.StateMachine;
import iwwwdnw.statemachine.port.Subjekt;

public class StatemachineFactoryImpl implements StatemachineFactory, Observer, State, StateMachine, Subjekt{

	@Override
	public void attach(iwwwdnw.statemachine.port.Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(iwwwdnw.statemachine.port.Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setState(State state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSubStateOf(State state) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSuperStateOf(State state) {
		// TODO Auto-generated method stub
		return false;
	}

}
