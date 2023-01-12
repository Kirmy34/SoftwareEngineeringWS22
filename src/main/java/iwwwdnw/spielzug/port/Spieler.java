package iwwwdnw.spielzug.port;

public interface Spieler {
	public enum Farben {
		DUNKELROT, ROT, HELLROT, RUBINROT, PASTELLROT, ERDBEERROT, TOMATENROT, LIPPENSTIFTROT, BLUTROT, ROSENROT, FERRARIROT
	}

	public int getAlter();

	public void setAlter(int alter);

	public Farben getFarbe();

	public void setFarbe(Farben farbe);

	public int[] getWissensstandsanzeige();

	public void setWissensstandsanzeige(int[] wissensstandsanzeige);

	public String getName();

	public void setName(String name);

	public WissensStreiter[] getWissensstreiter();

	public void setWissensstreiter(WissensStreiter[] wissensstreiter);

	public int getId();

	public void setId(int id);

}