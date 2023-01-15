package iwwwdnw.spielzug.impl;

import java.awt.Color;

import Analyse.ObjectModel.WissensStreiter;
import iwwwdnw.spielzug.port.SpielBrett;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.port.Observer;
import iwwwdnw.statemachine.port.Subject;

public class SpielzugImpl implements Spielzug, Subject {

	private SpielBrett spielbrett;
	private Spieler[] spielerListe;
	private Spieler amZug;
	private int[] wuerfel;
	private int bewegungenNochÜbrig;

	public SpielzugImpl() {
		Spieler[] temp = { new SpielerImpl(0, 11, Color.RED.darker().darker(), "Simon"),
				new SpielerImpl(1, 12, Color.RED, "Franz"),
				new SpielerImpl(2, 13, Color.RED.brighter().brighter(), "Dietrich"),
				new SpielerImpl(3, 14, Color.RED.darker(), "Daniel") };
		this.spielerListe = temp;

		this.spielbrett = new SpielBrettImpl(4);
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
	public void wissensstreiterBewegen(WissensStreiter wissensstreiter) {

		// Bewegungs stuff

		this.bewegungenNochÜbrig--;

	}

	@Override
	public void vomHeimZumStartfeld(WissensStreiter wissensstreiter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attach(Observer obs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void detach(Observer obs) {
		// TODO Auto-generated method stub

	}

	@Override
	public Spieler[] getSpieler() {
		return this.spielerListe;
	}

	@Override
	public int[] getWuerfel() {
		return this.wuerfel;
	}

}
