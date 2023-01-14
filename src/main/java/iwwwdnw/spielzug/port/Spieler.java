package iwwwdnw.spielzug.port;

import java.util.List;

public interface Spieler {
	
	public int getId();

	public int getAlter();

	public Farben getFarbe();

	public String getName();

	public int[] getWissensstandsanzeige();

	public boolean givePoint(int index);
	
	public boolean takePoint(int index);
	
	public WissensStreiter[] getWissensstreiter();
	
	public void setWissensstreiter(WissensStreiter[] wissensstreiter);
	
	public void setStartfelder(List<StartFeld> startfelder);
	
	public void setStartfeld(StartFeld startfeld);
	
	public List<StartFeld> getStartfelder();

}