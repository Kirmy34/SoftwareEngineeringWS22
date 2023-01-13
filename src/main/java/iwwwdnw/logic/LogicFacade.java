package iwwwdnw.logic;

import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.StatemachineFactoryImpl;
import iwwwdnw.statemachine.port.StateMachine;

public class LogicFacade {
	private Spielzug spielzugImpl;
	StatemachineFactoryImpl smf = new StatemachineFactoryImpl();
	private StateMachine sm = smf.stateMachine();
}
