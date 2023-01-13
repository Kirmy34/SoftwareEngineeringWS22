package iwwwdnw.gui;

import iwwwdnw.statemachine.StatemachineFactoryImpl;
import iwwwdnw.statemachine.port.StateMachine;

public class GuiFacade {
	StatemachineFactoryImpl smf = new StatemachineFactoryImpl();
	private StateMachine sm = smf.stateMachine();
}
