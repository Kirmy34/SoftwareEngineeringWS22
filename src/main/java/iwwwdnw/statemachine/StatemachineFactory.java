package iwwwdnw.statemachine;

import iwwwdnw.statemachine.impl.StatemachineFactoryImpl;

public interface StatemachineFactory {
	StatemachineFactory FACTORY = new StatemachineFactoryImpl();
}
