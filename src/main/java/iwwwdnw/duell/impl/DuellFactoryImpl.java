package iwwwdnw.duell.impl;

import iwwwdnw.duell.DuellFactory;
import iwwwdnw.duell.port.Duell;
import iwwwdnw.logic.impl.Frage;
import iwwwdnw.logic.impl.Fragenkarte;
import iwwwdnw.logic.impl.Spieler;
import iwwwdnw.logic.impl.Wissenskategorie;

public class DuellFactoryImpl implements DuellFactory, Duell {

	@Override
	public void startDuell(Spieler spieler1, Spieler spieler2, Wissenskategorie wissenskategorie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Frage getFrage(Spieler spieler, Fragenkarte fragenkarte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Antwort antworten(Spieler spieler, boolean[] antworten, Frage frage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Frage getFrage_spieler_1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFrage_spieler_1(Frage frage_spieler_1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Frage getFrage_spieler_2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFrage_spieler_2(Frage frage_spieler_2) {
		// TODO Auto-generated method stub
		
	}

}
