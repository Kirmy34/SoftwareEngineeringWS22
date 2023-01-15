package iwwwdnw.spielzug.port;

import java.awt.Color;
import java.util.List;

public interface Spieler {
	
	public static final Color colors[] = {Color.BLACK, Color.RED, Color.BLUE, Color.GREEN.darker(), Color.YELLOW, Color.MAGENTA};
	
	public int getId();

	public int getAlter();

	public Color getFarbe();

	public String getName();

	public int[] getWissensstandsanzeige();
	
	public int[] getPoints();

	public boolean givePoint(int index);
	
	public boolean takePoint(int index);
	
	public WissensStreiter[] getWissensstreiter();
	
	public void setWissensstreiter(WissensStreiter[] wissensstreiter);
	
	public void setStartfelder(List<StartFeld> startfelder);
	
	public void setStartfeld(StartFeld startfeld);
	
	public List<StartFeld> getStartfelder();

}