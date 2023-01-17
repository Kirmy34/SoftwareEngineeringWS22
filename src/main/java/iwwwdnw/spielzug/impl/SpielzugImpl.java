package iwwwdnw.spielzug.impl;

import java.awt.Color;

import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.SpielBrett;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.Spielzug;

public class SpielzugImpl implements Spielzug {

	private SpielBrett spielbrett;
	private Spieler[] spielerListe;
	private Spieler amZug;
	private int[] wuerfel;
	private int bewegungenNochÜbrig;
	private Feld startfeld;

	public SpielzugImpl() {
		Spieler[] temp = { new SpielerImpl(0, 11, Color.RED, "Simon"), new SpielerImpl(1, 12, Color.BLUE, "Franz"),
				new SpielerImpl(2, 13, Color.GREEN, "Dietrich"), new SpielerImpl(3, 14, Color.ORANGE, "Daniel") };
		this.spielerListe = temp;

		this.spielbrett = new SpielBrettImpl(4, this.spielerListe);
		this.amZug = this.spielerListe[0];
		int[] temp1 = { 0, 0 };
		this.wuerfel = temp1;
	}

	@Override
	public void wuerfeln() {
		this.bewegungenNochÜbrig = 0;
		for (int i = 0; i < 2; i++) {
			this.wuerfel[i] = getZufallszahl();
			this.bewegungenNochÜbrig += this.wuerfel[i];
		}
	}

	private int getZufallszahl() {
		return (int) (6.0 * Math.random() + 1);
	}

	@Override
	public boolean wissensstreiterBewegen(int feldId) {

		// Bewegungs stuff

		this.bewegungenNochÜbrig--;

		return true;

	}

	@Override
	public boolean vomHeimZumStartfeld(int feldId) {
		if (feldId < 280 || feldId > 300) {
			return false;
		}

		if (!this.spielbrett.istStartFeldvonSpieler(amZug, feldId)) {
			return false;
		}

		this.spielbrett.vomHeimZumStartfeld(amZug.getNextFreeWissensStreiter(), feldId);
		return true;

	}

	public boolean waehleStart(int id) {
		if (id > 300 ) {
			return false;
		}
		
		Feld feld = this.spielbrett.getFeld(id);
		if (feld.istFrei()) {
			return false;
		}
		if (feld.getWissensstreiter().getSpieler().getId() != this.amZug.getId()) {
			return false;
		}

		this.startfeld = feld;
		return true;
	}
	
	public boolean zielAuswaehlen(int id) {
		Feld feld = this.spielbrett.getFeld(id);
		if (feld.istFrei()) {
			this.spielbrett.wissensstreiterBewegen(startfeld, feld);
			this.bewegungenNochÜbrig--;
			return true;
		}
		
		// TODO Check for Duell 
		
		return false;
	}

//	@Override
//	public void attach(Observer obs) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void detach(Observer obs) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public Spieler[] getSpieler() {
		return this.spielerListe;
	}

	@Override
	public int[] getWuerfel() {
		return this.wuerfel;
	}

	public Spieler getSpielerAmZug() {
		return this.amZug;
	}

	@Override
	public int getBewegungen() {
		return this.bewegungenNochÜbrig;
	}

	public Feld getFeld(int id) {
		return this.spielbrett.getFeld(id);
	}

	@Override
	public void spielerWechseln() {
		int nextId = amZug.getId();
		
		if (++nextId == spielerListe.length) {
			nextId = 0;
		}
		this.amZug = this.spielerListe[nextId];
		
	}

}
