package iwwwdnw.statemachine;

import iwwwdnw.statemachine.StatemachineFactoryImpl;

import iwwwdnw.statemachine.port.StateMachinePort;
import iwwwdnw.statemachine.port.SubjectPort;

public interface StatemachineFactory {
	
	StatemachineFactory FACTORY = new StatemachineFactoryImpl();
	
	public SubjectPort subjectPort();

	public StateMachinePort stateMachinePort();

}
