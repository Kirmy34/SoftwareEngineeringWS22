package iwwwdnw.spielzug.port;

public interface Spieler {
	
	public int getId();

	public int getAlter();

	public Farben getFarbe();

	public String getName();

	public int[] getWissensstandsanzeige();

	public boolean givePoint(int index);
	
	public boolean takePoint(int index);

}