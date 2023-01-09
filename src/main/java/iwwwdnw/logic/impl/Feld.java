
package iwwwdnw.logic.impl;

public class Feld {

	
	protected WissensStreiter wissensstreiter;

	public boolean vonGegnerBesetzt(WissensStreiter wissensstreiter) {
	
		if(this.wissensstreiter.getSpieler().equals(wissensstreiter.getSpieler()))
		{
			return false;
		}
		else
		{
			return true;
		}
		
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
