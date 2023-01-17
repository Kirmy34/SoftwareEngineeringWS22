package iwwwdnw.statemachine.port;

public interface State {
	public boolean isSubStateOf(State state);

	public boolean isSuperStateOf(State state);

}
