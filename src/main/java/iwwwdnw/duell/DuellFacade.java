package iwwwdnw.duell;

import iwwwdnw.duell.port.Duell;
import iwwwdnw.logic.impl.Frage;
import iwwwdnw.logic.impl.Fragenkarte;
import iwwwdnw.logic.impl.Wissenskategorie;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.StatemachineFactoryImpl;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.StateMachine;

public class DuellFacade implements Duell {
	private Spielzug spielzugImpl;
	StatemachineFactoryImpl smf = new StatemachineFactoryImpl();
	private StateMachine sm = smf.stateMachine();
	
	@Override
	public void startDuell(Spieler spieler1, Spieler spieler2, Wissenskategorie wissenskategorie) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return;	
		}
		//
	}
	@Override
	public Frage getFrage(Spieler spieler, Fragenkarte fragenkarte) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return null;	
		}
		return null;//todo
	}
	@Override
	public Antwort antworten(Spieler spieler, boolean[] antworten, Frage frage) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return null;	
		}
		return null;//todo
	}
	@Override
	public Frage getFrage_spieler_1() {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return null;	
		}
		return null;//todo
	}
	@Override
	public void setFrage_spieler_1(Frage frage_spieler_1) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return;	
		}
		//todo
	}
	@Override
	public Frage getFrage_spieler_2() {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return null;	
		}
		return null;
	}
	@Override
	public void setFrage_spieler_2(Frage frage_spieler_2) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return;	
		}
		//todo
	}
}
