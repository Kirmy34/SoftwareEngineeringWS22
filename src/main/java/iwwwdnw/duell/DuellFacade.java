package iwwwdnw.duell;

import iwwwdnw.duell.port.Duell;
import iwwwdnw.logic.impl.Frage;
import iwwwdnw.logic.impl.Fragenkarte;
import iwwwdnw.logic.impl.Wissenskategorie;
import iwwwdnw.spielzug.port.SpielBrett;
import iwwwdnw.statemachine.StatemachineFactoryImpl;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.StateMachine;

public class DuellFacade implements Duell {
	private Duell duellImpl;
	StatemachineFactoryImpl smf = new StatemachineFactoryImpl();
	
	private StateMachine sm = smf.stateMachine();
	@Override
	public void startDuell(SpielBrett spieler1, iwwwdnw.spielzug.impl.Spieler spieler2,
			Wissenskategorie wissenskategorie) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return;	
		}
		this.duellImpl.startDuell(spieler1, spieler2, wissenskategorie);
		
	}
	@Override
	public Frage getFrage(iwwwdnw.spielzug.impl.Spieler spieler, Fragenkarte fragenkarte) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return null;	
		}
		return this.duellImpl.getFrage(spieler, fragenkarte);
	}
	@Override
	public Antwort antworten(iwwwdnw.spielzug.impl.Spieler spieler, boolean[] antworten, Frage frage) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return null;	
		}
		return this.duellImpl.antworten(spieler, antworten, frage);
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
		this.duellImpl.setFrage_spieler_1(frage_spieler_1);
	}
	@Override
	public Frage getFrage_spieler_2() {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return null;	
		}
		return this.duellImpl.getFrage_spieler_2();
	}
	@Override
	public void setFrage_spieler_2(Frage frage_spieler_2) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Duell)) {
			return;	
		}
		this.duellImpl.setFrage_spieler_2(frage_spieler_2);
	}
}
