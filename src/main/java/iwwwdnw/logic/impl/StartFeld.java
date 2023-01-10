package iwwwdnw.logic.impl;

public class StartFeld extends Feld implements iwwwdnw.logic.port.StartFeld {

	private Spieler owner;

	public Spieler getOwner() {
		return owner;
	}

	public void setOwner(Spieler owner) {
		this.owner = owner;
	}
	
	
}
