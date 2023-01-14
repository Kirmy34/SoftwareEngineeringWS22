package iwwwdnw.logic.impl;

import iwwwdnw.logic.LogicFactory;

public class LogicFactoryImpl implements LogicFactory{

	@Override
	public Wissenskategorie createWissenskategorie() {
		Wissenskategorie w = null;
		w = new Wissenskategorie(); 
		return w;
	}

	@Override
	public Frage createFrage() {
		Frage f = null;
		f = new Frage(); 
		return f;
	}

	@Override
	public Fragenkarte createFragenkarte() {
		Fragenkarte fk = null;
		fk = new Fragenkarte(); 
		return fk;
	}

}
