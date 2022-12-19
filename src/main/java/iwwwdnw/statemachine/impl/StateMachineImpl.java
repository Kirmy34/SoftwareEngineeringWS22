package iwwwdnw.statemachine.impl;

import java.util.ArrayList;
import java.util.List;

import iwwwdnw.logic.port.Subject;
import iwwwdnw.statemachine.port.Observer;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.StateMachine;

public class StateMachineImpl implements StateMachine, Subject
{
	
	private List<Observer> observers = new ArrayList<>( );
	private State currentState;
	public StateMachineImpl(){this.currentState = State.S.InitGame;}
	public void attach(Observer obs) {this.observers.add(obs); obs.update(currentState);}
	public void detach(Observer obs) {this.observers.remove(obs);}
	public State getState() {return this.currentState;}
	
	
	public void setState(State state) 
	{
		currentState = state;
		observers.forEach(obs -> obs.update(state));
	}
	

}