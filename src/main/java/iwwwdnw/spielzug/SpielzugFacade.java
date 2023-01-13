package iwwwdnw.spielzug;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.statemachine.port.StateMachine;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.StatemachineFactoryImpl;


public class SpielzugFacade implements Spielzug {
	private Spielzug spielzugImpl;
	StatemachineFactoryImpl smf = new StatemachineFactoryImpl();
	private StateMachine sm = smf.stateMachine();

	@Override
	public int[] wuerfeln() {
		if(! sm.getState().isSubStateOf(State.StateEnum.am_Wuerfeln)) {
			return null;	
		}
		return this.spielzugImpl.wuerfeln();
		
	}

	@Override
	public void wissensstreiterBewegen(WissensStreiter wissensstreiter) {
		if(! sm.getState().isSubStateOf(State.StateEnum.Bewegen)) {
			return;	
		}
		this.spielzugImpl.wissensstreiterBewegen(wissensstreiter);
		
	}

	@Override
	public void vomHeimZumStartfeld(WissensStreiter wissensstreiter) {
		if(! sm.getState().isSubStateOf(State.StateEnum.von_Heim_zum_Start)) {
			return;	
		}
		this.spielzugImpl.vomHeimZumStartfeld(wissensstreiter);
		
	}


}
