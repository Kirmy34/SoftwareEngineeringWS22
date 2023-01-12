package iwwwdnw.statemachine;

import iwwwdnw.statemachine.StatemachineFactory;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.StateMachine;
import iwwwdnw.statemachine.port.StateMachinePort;
import iwwwdnw.statemachine.port.Subject;
import iwwwdnw.statemachine.port.SubjectPort;
import iwwwdnw.statemachine.impl.StateMachineImpl;

public class StatemachineFactoryImpl
		implements StatemachineFactory, Subject, SubjectPort, StateMachine, StateMachinePort {

	private StateMachineImpl stateMachine;

	private void mkStateMachine() {
		if (this.stateMachine == null)
			this.stateMachine = new StateMachineImpl();
	}

	@Override
	public void attach(iwwwdnw.statemachine.port.Observer obs) {
		this.stateMachine.attach(obs);
	}

	@Override
	public void detach(iwwwdnw.statemachine.port.Observer obs) {
		this.stateMachine.detach(obs);
	}

	@Override
	public void setState(State state) {
		this.stateMachine.setState(state);
	}

	@Override
	public State getState() {
		return this.stateMachine.getState();
	}

	@Override
	public SubjectPort subjectPort() {
		return this;
	}

	@Override
	public StateMachinePort stateMachinePort() {
		return this;
	}

	@Override
	public StateMachine stateMachine() {
		this.mkStateMachine();
		return this;
	}

	@Override
	public Subject subject() {
		this.mkStateMachine();
		return this;
	}

}
