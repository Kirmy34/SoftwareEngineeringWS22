package iwwwdnw.logic;

import iwwwdnw.logic.impl.Frage;
import iwwwdnw.logic.impl.Fragenkarte;
import iwwwdnw.logic.impl.LogicFactoryImpl;
import iwwwdnw.logic.impl.Wissenskategorie;

public interface LogicFactory {
	LogicFactory FACTORY = new LogicFactoryImpl();
	
	Wissenskategorie createWissenskategorie();
	Frage createFrage();
	Fragenkarte createFragenkarte();
	
}
