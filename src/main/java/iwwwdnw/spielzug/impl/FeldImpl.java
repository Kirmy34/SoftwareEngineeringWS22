
package iwwwdnw.spielzug.impl;

import iwwwdnw.spielzug.port.*;

public class FeldImpl implements Feld {

	protected WissensStreiter wissensstreiter;
	protected int id;

	@Override
	public boolean vonGegnerBesetzt(WissensStreiter wissensstreiter) {

		if (this.wissensstreiter.getSpieler().equals(wissensstreiter.getSpieler())) {
			return false;
		} else {
			return true;
		}

	}

	public WissensStreiter getWissensstreiter() {
		return wissensstreiter;
	}

	public void setWissensstreiter(WissensStreiter wissensstreiter) {
		this.wissensstreiter = wissensstreiter;
	}

	public boolean istFrei() {
		return this.wissensstreiter == null;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

}
