package iwwwdnw.logic.impl;

import iwwwdnw.logic.port.Model;
import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.Spielzug;
import iwwwdnw.statemachine.impl.StateEnum;
import iwwwdnw.statemachine.port.StateMachine;

public class ModelImpl implements Model {

	private StateMachine sm;
	private Spielzug spielzug;
	private String message;

	public ModelImpl(StateMachine sm, Spielzug sp) {
		this.sm = sm;
		this.spielzug = sp;
		this.message = GuiTexts.WUERFELN(sp.getSpielerAmZug().getName());
	}

	@Override
	public void service(int req) {
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
		if (req != 1000) {
			this.message = GuiTexts.WUERFELN_ERROR;
			return;
		}

		spielzug.wuerfeln();

		int[] w = this.getWuerfel();
		int sum = w[0] + w[1];

		if (sum == 7 && spielzug.getSpielerAmZug().getNextFreeWissensStreiter() != null
				&& this.spielzug.spielerHatFreiesStartFeld(spielzug.getSpielerAmZug().getId())) {


			sm.setState(StateEnum.von_Heim_zum_Start);
			this.message = GuiTexts.STARTFELDAUSWAEHLEN;
			return;
		}
		if (spielzug.getSpielerAmZug().hatWissensStreiterAufSpielbrett()) {
			sm.setState(StateEnum.WissensStreiterAuswaehlen);
			this.message = GuiTexts.BEWEGUNGENUEBRIG(this.spielzug.getBewegungen());
		}

	}

	private void serviceVonHeimZumStart(int req) {

		if (this.spielzug.vomHeimZumStartfeld(req)) {

			this.message = GuiTexts.BEWEGUNGENUEBRIG(this.spielzug.getBewegungen());
			this.sm.setState(StateEnum.WissensStreiterAuswaehlen);
		} else {
			this.message = GuiTexts.ZIELAUSWAEHLEN_ERROR;
		}
	}

	private void serviceWissensStreiterAuswaehlen(int req) {
		if (this.spielzug.waehleStart(req)) {
			this.sm.setState(StateEnum.ZielAusfaehlen);
			this.message = GuiTexts.ZIELAUSWAEHLEN;
		} else {
			this.message = GuiTexts.WSAUSWAEHLEN_ERROR;
		}
	}

	private void serviceZielAuswaehlen(int req) {
		if (this.spielzug.zielAuswaehlen(req)) {

			// TODO: Check ob noch bewegungen uebrig
			if (this.spielzug.getBewegungen() == 0) {
				this.sm.setState(StateEnum.am_Wuerfeln);
				this.spielzug.spielerWechseln();
				this.message = GuiTexts.WUERFELN(spielzug.getSpielerAmZug().getName());
				return;
			}

			// TODO: Check ob Duell

			this.message = GuiTexts.BEWEGUNGENUEBRIG(this.spielzug.getBewegungen());
			this.sm.setState(StateEnum.WissensStreiterAuswaehlen);
		}
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
		return spielzug.getSpielerAmZug().getName() + ": " + this.message;
	}

	public Feld getFeld(int id) {
		return this.spielzug.getFeld(id);
	}

	public String getState() {
		return sm.getState().toString();
	}

}
