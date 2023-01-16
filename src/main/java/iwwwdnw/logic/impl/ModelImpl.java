package iwwwdnw.logic.impl;

import iwwwdnw.logic.port.Model;
import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.impl.StateEnum;
import iwwwdnw.statemachine.port.Observer;
import iwwwdnw.statemachine.port.State;
import iwwwdnw.statemachine.port.StateMachine;

public class ModelImpl implements Model {

	private StateMachine sm;
	private Spielzug spielzug;
	private String message;

	ModelImpl(StateMachine sm, Spielzug sp) {
		this.sm = sm;
		this.spielzug = sp;
		this.message = "Spieler " + sp.getSpielerAmZug().getName() + " ist an der Reihe, bitte würfeln!";
	}

	/*
	 * ===================================================
	 */

	@Override
	public void service(int req) {

		System.out.println("Current State: " + this.sm.getState().toString());
		this.message = "Es wurde button " + req + " gedrückt.";

		switch (sm.getState()) {
		case am_Wuerfeln:
			serviceAmWuerfeln(req);
			break;
		case von_Heim_zum_Start:
			serviceVonHeimZumStart(req);
			break;
		case WissensStreiterAuswaehlen:
			serviceWissensStreiterAuswaehlen(req);
			break;
		case ZielAusfaehlen:
			serviceZielAuswaehlen(req);
			break;
		default:
			break;
		}
	}

	private void serviceAmWuerfeln(int req) {
		if (req == 1000) {
			spielzug.wuerfeln();

			int[] w = this.getWuerfel();
			int sum = w[0] + w[1];

			if (sum == 7) {
				// TODO: Check ob Startfelder frei und WissensStreiter in Heimfeld > 0

				sm.setState(StateEnum.von_Heim_zum_Start);
				this.message = "Du hast eine 7 du Mongo, bringe eine Figur auf ein Startfeld";
			} else {
				// TODOL: Check ob WissensStreiter auf Spielbrett

//				sm.setState(StateEnum.WissensStreiterAuswaehlen);
			}
		} else {
			this.message = "Du musst würfeln du Mongo";
		}
	}

	private void serviceVonHeimZumStart(int req) {

		if (this.spielzug.vomHeimZumStartfeld(req)) {

			this.message = "Du hast noch " + this.spielzug.getBewegungen() + " übrig";
			this.sm.setState(StateEnum.WissensStreiterAuswaehlen);
		} else {
			this.message = "Du Mongo weisst wohl nicht was ein Startfeld ist...";
		}
	}

	private void serviceWissensStreiterAuswaehlen(int req) {
		if (this.spielzug.waehleStart(req)) {
			this.sm.setState(StateEnum.ZielAusfaehlen);
			this.message = "Waehle ein Zielfeld... bitte";
		} else {
			this.message = "Du Mongo musst auf einene deiner Wissensstreiter klicken...";
		}
	}

	private void serviceZielAuswaehlen(int req) {
		if (this.spielzug.zielAuswaehlen(req)) {

			// TODO: Check ob noch bewegungen uebrig
			if (this.spielzug.getBewegungen() == 0) {
				this.sm.setState(StateEnum.am_Wuerfeln);
				this.spielzug.spielerWechseln();
				this.message = "Spieler " + spielzug.getSpielerAmZug().getName() + " ist an der Reihe, bitte würfeln!";
				return;
			}

			// TODO: Check ob Duell

			this.message = "Du hast noch " + this.spielzug.getBewegungen() + " übrig";
			this.sm.setState(StateEnum.WissensStreiterAuswaehlen);
		}
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
		return this.spielzug.getSpieler();
	}

	@Override
	public int[] getWuerfel() {
		return this.spielzug.getWuerfel();
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	public Feld getFeld(int id) {
		return this.spielzug.getFeld(id);
	}

}
