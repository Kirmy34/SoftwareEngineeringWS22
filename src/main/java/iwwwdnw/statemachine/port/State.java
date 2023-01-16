package iwwwdnw.statemachine.port;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface State {
	public boolean isSubStateOf(State state);

	public boolean isSuperStateOf(State state);
	
}
