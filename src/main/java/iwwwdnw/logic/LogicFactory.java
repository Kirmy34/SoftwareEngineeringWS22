package iwwwdnw.logic;

import iwwwdnw.logic.impl.LogicFactoryImpl;

public interface LogicFactory {
	LogicFactory FACTORY = new LogicFactoryImpl();
}
