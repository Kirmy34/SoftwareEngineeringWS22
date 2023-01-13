package iwwwdnw.statemachine.port;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface State {
	public boolean isSubStateOf(State state);
	public boolean isSuperStateOf(State state);
	
	public enum StateEnum implements State {
		InitGame, am_Wuerfeln, von_Heim_zum_Start, Bewegen, Duell, Figuren_umplatzieren,
		MakeATurn(am_Wuerfeln, von_Heim_zum_Start, Bewegen, Duell, Figuren_umplatzieren), AwardCeremony, Spieler_wechseln;
		private List<State> subStates;
		private StateEnum(State... subS) {this.subStates = new ArrayList<>(Arrays.asList(subS));}
		public boolean isSuperStateOf(State s) {
		boolean result = s == null || this == s; // self contained
		for (State state : this.subStates) // or
		result |= state.isSuperStateOf(s); // contained in a substate!
		return result;}
		public boolean isSubStateOf(State state) {return state == null ? false : state.isSuperStateOf(this);}
		}
}
