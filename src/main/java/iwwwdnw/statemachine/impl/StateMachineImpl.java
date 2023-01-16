package iwwwdnw.statemachine.impl;

import java.util.ArrayList;
import java.util.List;

import iwwwdnw.statemachine.port.Observer;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.StateMachine;
import iwwwdnw.statemachine.port.Subject;

public class StateMachineImpl implements StateMachine, Subject {

	private List<Observer> observers = new ArrayList<>();
	private StateEnum currentState;

	public StateMachineImpl() {
		this.currentState = StateEnum.am_Wuerfeln;
	}

	public void attach(Observer obs) {
		this.observers.add(obs);
		obs.update(currentState);
	}

	public void detach(Observer obs) {
		this.observers.remove(obs);
	}

	public StateEnum getState() {
		return this.currentState;
	}

	public void setState(StateEnum state) {
		currentState = state;
		observers.forEach(obs -> obs.update(state));
	}

}