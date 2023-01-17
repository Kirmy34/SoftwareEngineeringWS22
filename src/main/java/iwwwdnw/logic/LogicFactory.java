package iwwwdnw.logic;

import iwwwdnw.logic.impl.LogicFactoryImpl;
import iwwwdnw.logic.port.Model;


public interface LogicFactory {
	LogicFactory FACTORY = new LogicFactoryImpl();

	Model model();

//	Subject subject();

}
