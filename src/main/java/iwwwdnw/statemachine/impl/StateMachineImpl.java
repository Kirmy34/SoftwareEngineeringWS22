package iwwwdnw.statemachine.impl;

import iwwwdnw.statemachine.port.StateMachine;

public class StateMachineImpl implements StateMachine {

//	private List<Observer> observers = new ArrayList<>();
	private StateEnum currentState;

	public StateMachineImpl() {
		this.currentState = StateEnum.am_Wuerfeln;
	}

//	public void attach(Observer obs) {
//		this.observers.add(obs);
//		obs.update(currentState);
//	}
//
//	public void detach(Observer obs) {
//		this.observers.remove(obs);
//	}

	public StateEnum getState() {
		return this.currentState;
	}

	public void setState(StateEnum state) {
		currentState = state;
//		observers.forEach(obs -> obs.update(state));
	}

}