package iwwwdnw.logic;

import java.util.LinkedHashMap;
import java.util.List;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.logic.port.Frage;
import iwwwdnw.logic.port.Fragenkarte;
import iwwwdnw.logic.port.IWWWDNW;
import iwwwdnw.logic.port.Spielmanager;
import iwwwdnw.logic.port.Wissenskategorie;
import iwwwdnw.statemachine.StatemachineFactoryImpl;
import iwwwdnw.statemachine.port.StateMachine;

/***
 * 
 * TODO
 */
public class LogicFacade implements Frage, Fragenkarte, IWWWDNW, Spielmanager, Wissenskategorie {
	//private Spielzug spielzugImpl;
	StatemachineFactoryImpl smf = new StatemachineFactoryImpl();
	private StateMachine sm = smf.stateMachine();
	
}
