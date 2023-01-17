package iwwwdnw.logic;

import iwwwdnw.logic.impl.LogicFactoryImpl;
import iwwwdnw.logic.port.Model;
import iwwwdnw.logic.port.Subject;


public interface LogicFactory {
	LogicFactory FACTORY = new LogicFactoryImpl();

	Model model();

	Subject subject();

//	Subject subject();

}
