package iwwwdnw.logic.impl;

import iwwwdnw.logic.impl.Frage.Level;

public class Fragenkarte {
	
	private Frage[] fragen; // 0: leicht, 1: mittel, 2: schwer
	private boolean used;

	public Fragenkarte()
	{
		fragen = new Frage[3];
		this.used = false;
	}
	
	
	public Frage[] getFragen() {
		return fragen;
	}

	public void setFragen(Frage[] fragen) {
		this.fragen = fragen;
	}

	public boolean wasUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}
	
	
	
}
