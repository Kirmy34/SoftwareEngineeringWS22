
package iwwwdnw.logic.impl;

public class Feld {

	
	private WissensStreiter wissensstreiter;

	public boolean vonGegnerBesetzt(WissensStreiter wissensstreiter) {
		// TODO Auto-generated method stub
		return false;
	}

	public WissensStreiter getWissensstreiter() {
		return wissensstreiter;
	}

	public void setWissensstreiter(WissensStreiter wissensstreiter) {
		this.wissensstreiter = wissensstreiter;
	}
	
	public boolean istFrei()
	{
		return this.wissensstreiter == null;
	}
	
	
	
}
