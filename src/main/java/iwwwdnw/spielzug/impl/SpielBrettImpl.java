package iwwwdnw.spielzug.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import iwwwdnw.spielzug.port.Feld;
import iwwwdnw.spielzug.port.SpielBrett;
import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.spielzug.port.StartFeld;
import iwwwdnw.spielzug.port.WissensStreiter;

public class SpielBrettImpl implements SpielBrett {

	private FeldImpl[] felder;
	private StartFeldImpl[] startfelder;
	private List spielbrett[] = new List[300];
	private int anzahlSpieler;

	public SpielBrettImpl(int anzahlSpieler, Spieler[] spieler) {
		startfelder = new StartFeldImpl[20];
		felder = new FeldImpl[300];
		this.anzahlSpieler = anzahlSpieler;

		switch (anzahlSpieler) {
		case 2:
			this.erstelleSpielBrett(2, 17);
			break;
		case 3:
			this.erstelleSpielBrett(3, 15);
			break;
		case 4:
			this.erstelleSpielBrett(4, 13);
			break;
		case 5:
			this.erstelleSpielBrett(5, 11);
			break;
		default:
			this.erstelleSpielBrett(6, 9);
		}
		for (int i = 0; i < spieler.length; i++) {
			setStartfeldOwner(spieler[i]);
		}

	}

	private void erstelleSpielBrett(int anzahlSpieler, int felderAussen) {
		int anzahlSpielerInit = anzahlSpieler;
		// Feldinstanzen erstellen

		for (int i = 0; i < BEGINSTARTFELD; i++) {
			this.felder[i] = new FeldImpl();
			this.felder[i].setId(i);
		}

		for (int i = BEGINSTARTFELD; i < MAXAMOUNTFELDER; i++) {
			this.startfelder[i - 280] = new StartFeldImpl();
			this.startfelder[i - 280].setId(i);
		}

		for (int i = BEGINSTARTFELD; i < BEGINSTARTFELD + (anzahlSpielerInit * 2); i++) {
			this.spielbrett[i] = new ArrayList<Integer>();
		}

		int sid = BEGINSTARTFELD; // sid: Startfeld-ID
		int fid = 0; // fid : Feld-ID

		// Äußerer Kreis:
		for (; anzahlSpieler > 1; anzahlSpieler--) // müsste stimmen!
		{

			// erstes Startfeld in Liste speichern und initialisieren:
			this.spielbrett[sid].add(fid);
			sid++;

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;

			for (int i = 1; i < felderAussen - 1; i++) {
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(sid);
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[sid].add(fid);
			fid++;

		}

		if (anzahlSpieler == 1) {

			this.spielbrett[sid].add(fid);
			sid++;

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;

			for (int i = 1; i < felderAussen - 1; i++) {
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(BEGINSTARTFELD);
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[BEGINSTARTFELD].add(fid);
			fid++;

		}

		// Innerer Kreis:
		int felderAussenInit = felderAussen;
		felderAussen -= 4;
		anzahlSpieler = anzahlSpielerInit;
		int beginInnerCircle = sid;
		int startInnerCircle = fid;

		for (; anzahlSpieler > 1; anzahlSpieler--) // müsste stimmen!
		{

			// erstes Startfeld in Liste speichern und initialisieren:

			this.spielbrett[sid].add(fid);
			sid++;

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;

			for (int i = 1; i < felderAussen - 1; i++) {
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(sid);
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[sid].add(fid);
			fid++;

		}

		if (anzahlSpieler == 1) {

			this.spielbrett[sid].add(fid);
			sid++;

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(sid - 1);
			fid++;

			for (int i = 1; i < felderAussen - 1; i++) {
				this.spielbrett[fid] = new ArrayList<Integer>();
				this.spielbrett[fid].add(fid + 1);
				this.spielbrett[fid].add(fid - 1);
				fid++;
			}

			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(beginInnerCircle);
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[BEGINSTARTFELD + anzahlSpielerInit].add(fid);
			fid++;

		}

		anzahlSpieler = anzahlSpielerInit;
		// Verbindungsfelder

		// Startfelder verbinden
		for (int i = 0, s = BEGINSTARTFELD; i < anzahlSpieler; i++, s++) {
			this.spielbrett[s].add(fid);
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(s);
			this.spielbrett[fid].add(fid + 1);
			fid++;
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[fid].add(s + anzahlSpielerInit);
			this.spielbrett[s + anzahlSpieler].add(fid);
			fid++;

		}

		int mitteAussen[] = new int[anzahlSpielerInit];
		int mitteInnen[] = new int[anzahlSpielerInit];

		// finde Mittelfelder Außen und Innen

		mitteAussen[0] = felderAussenInit / 2;
		mitteInnen[0] = startInnerCircle + ((felderAussenInit - 4) / 2);

		for (int i = 1; i < anzahlSpielerInit; i++) {
			mitteAussen[i] = mitteAussen[i - 1] + felderAussenInit;
			mitteInnen[i] = mitteInnen[i - 1] + felderAussenInit - 4;
		}

		// Mittelfelder verbinden
		for (int i = 0; i < anzahlSpieler; i++) {
			this.spielbrett[mitteAussen[i]].add(fid);
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid + 1);
			this.spielbrett[fid].add(mitteAussen[i]);
			fid++;
			this.spielbrett[fid] = new ArrayList<Integer>();
			this.spielbrett[fid].add(fid - 1);
			this.spielbrett[fid].add(mitteInnen[i]);
			this.spielbrett[mitteInnen[i]].add(fid);
			fid++;

		}

	}

	@Override
	public void setStartfeldOwner(Spieler spieler) {
		// TODO Auto-generated method stub

		for (int i = 0; i < startfelder.length; i++) {
			if (startfelder[i].getOwner() == null) {
				startfelder[i].setOwner(spieler);
				spieler.setStartfeld(startfelder[i]);
				startfelder[i + this.anzahlSpieler].setOwner(spieler);
				spieler.setStartfeld(startfelder[i + this.anzahlSpieler]);
				return;
			}
		}

	}

	@Override
	public boolean wissensstreiterBewegen(Feld startfeld, Feld zielfeld) {

		if (startfeld.getWissensstreiter().getPreviousFeld().getId() == zielfeld.getId()
				|| startfeld.getId() == zielfeld.getId()) {
			return false;
		}

		if (zielfeld.istFrei()) {

			List<Integer> wege = this.getPossibleWays(startfeld.getWissensstreiter());

			for (int i = 0; i < wege.size(); i++) {
				if (wege.get(i) == zielfeld.getId()) {
					zielfeld.setWissensstreiter(startfeld.getWissensstreiter());
					startfeld.setWissensstreiter(null);
					zielfeld.getWissensstreiter().setPreviousFeld(startfeld);
					zielfeld.getWissensstreiter().setFeld(zielfeld);
					return true;
				}
			}

			return false;



		}

		if (zielfeld.vonGegnerBesetzt(startfeld.getWissensstreiter())) {
			// starte Duell

			WissensStreiter w1 = startfeld.getWissensstreiter();
			WissensStreiter w2 = zielfeld.getWissensstreiter();
			w1.getSpieler().givePoint(0);
			w2.getSpieler().takePoint(0);

			zielfeld.setWissensstreiter(w1);
			startfeld.setWissensstreiter(null);

			w1.setFeld(zielfeld);
			w2.setFeld(null);
			this.spielzugVorbei(w1);
			this.duellVerloren(w2);
			w1.setPreviousFeld(w1.getFeld());
			w2.setPreviousFeld(w2.getFeld());
			
			
			
			return true;
		}

		return false;
	}

	public boolean duellVerloren(WissensStreiter wissensstreiter) {

		List<StartFeld> vStartfelder = wissensstreiter.getSpieler().getStartfelder();

		for (int i = 0; i < vStartfelder.size(); i++) {
			if (vStartfelder.get(i).getWissensstreiter() == null) {
				vStartfelder.get(i).setWissensstreiter(wissensstreiter);
				wissensstreiter.setFeld(vStartfelder.get(i));
				this.spielzugVorbei(wissensstreiter);
				return true;
			}
		}

		return false;
	}

	@Override
	public List<Integer> getPossibleWays(WissensStreiter wissensstreiter) {

		return this.spielbrett[wissensstreiter.getFeld().getId()];


	}

	public boolean vomHeimZumStartfeld(WissensStreiter wissensstreiter, int id) {
		StartFeld startfeld = this.startfelder[id - 280];

		if (startfeld.istFrei()) {
			startfeld.setWissensstreiter(wissensstreiter);
			wissensstreiter.setFeld(startfeld);
			wissensstreiter.setPreviousFeld(startfeld);
			return true;

		} else if (startfeld.vonGegnerBesetzt(wissensstreiter)) {
			WissensStreiter w1 = wissensstreiter;
			WissensStreiter w2 = startfeld.getWissensstreiter();
			w1.getSpieler().givePoint(0);
			w2.getSpieler().takePoint(3);

			startfeld.setWissensstreiter(w1);

			w1.setFeld(startfeld);
			w2.setFeld(null);
			this.spielzugVorbei(w1);
			this.duellVerloren(w2);
			w1.setPreviousFeld(startfeld);
			w2.setPreviousFeld(startfeld);
			return true;
		} else {
			return false;
		}
	}

	public void spielzugVorbei(WissensStreiter wissensstreiter) {
		wissensstreiter.setPreviousFeld(null);
	}

	@Override
	public StartFeld[] getStartfelder() {
		// TODO Auto-generated method stub
		return this.startfelder;
	}

	public boolean istStartFeldvonSpieler(Spieler sp, int feldId) {

		return sp.getId() == this.startfelder[feldId - 280].getOwner().getId();
	}

	public Feld getFeld(int id) {
		if (id < 280) {
			return this.felder[id];
		} else {
			return this.startfelder[id - 280];
		}

	}

	@Override
	public boolean spielerHatFreiesStartFeld(int spielerID) {
		for (StartFeld startfeld : startfelder) {
			if (startfeld.getOwner().getId() == spielerID) {
				if (startfeld.istFrei()) {
					return true;
				}
			}
		}

		return false;
	}

}
