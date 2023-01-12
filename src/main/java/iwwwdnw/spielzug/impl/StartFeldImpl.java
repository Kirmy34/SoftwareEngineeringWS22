package iwwwdnw.spielzug.impl;

import iwwwdnw.spielzug.port.StartFeld;
import iwwwdnw.spielzug.port.Spieler;

public class StartFeldImpl extends FeldImpl implements StartFeld {

	private Spieler owner;

	@Override
	public Spieler getOwner() {
		return this.owner;
	}

	@Override
	public void setOwner(Spieler owner) {
		this.owner = owner;
	}

}
