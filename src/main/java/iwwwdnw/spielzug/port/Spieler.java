package iwwwdnw.spielzug.port;

import java.awt.Color;
import java.util.List;

public interface Spieler {

	static final Color colors[] = { Color.BLACK, Color.RED, Color.BLUE, Color.GREEN.darker(), Color.YELLOW,
			Color.MAGENTA };

	int getId();

	int getAlter();

	Color getFarbe();

	String getName();

	int[] getWissensstandsanzeige();

	int[] getPoints();

	boolean givePoint(int index);

	boolean takePoint(int index);

	WissensStreiter[] getWissensstreiter();

	void setStartfeld(StartFeld startfeld);

	List<StartFeld> getStartfelder();

	WissensStreiter getNextFreeWissensStreiter();

}