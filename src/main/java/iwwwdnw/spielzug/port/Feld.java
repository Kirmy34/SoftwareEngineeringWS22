package iwwwdnw.spielzug.port;

import iwwwdnw.spielzug.impl.WissensStreiter;

public interface Feld {
	public WissensStreiter getWissensstreiter();

	public void setWissensstreiter(WissensStreiter wissensstreiter);

	public boolean vonGegnerBesetzt(WissensStreiter wissensstreiter);

	public boolean istFrei();

	public int getId();

	public void setId(int id);
}