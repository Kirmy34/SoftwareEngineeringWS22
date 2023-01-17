package iwwwdnw.statemachine.port;

import iwwwdnw.statemachine.impl.StateEnum;

public interface StateMachine {

	public void setState(StateEnum state);

	public StateEnum getState();

}
