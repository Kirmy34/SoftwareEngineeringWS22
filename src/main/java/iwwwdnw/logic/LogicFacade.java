package iwwwdnw.logic;

import iwwwdnw.statemachine.StatemachineFactoryImpl;
import iwwwdnw.statemachine.port.StateMachine;

/***
 * 
 * TODO
 */
public class LogicFacade {
	// private Spielzug spielzugImpl;
	StatemachineFactoryImpl smf = new StatemachineFactoryImpl();
	private StateMachine sm = smf.stateMachine();

}
