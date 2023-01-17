package iwwwdnw.logic.impl;

public class GuiTexts {

	public static String WUERFELN(String name) {
		String s = "Spieler " + name + " ist an der Reihe. Bitte Würfeln.";
		return s;
	}
	
	public static final String WUERFELN_ERROR = "Bitte auf Würfeln klicken.";
	
	public static final String WSAUSWAEHLEN = "Bitte einen Wissensstreiter auswählen.";
	
	public static final String WSAUSWAEHLEN_ERROR = "Bitte einen eigenen Wissensstreiter auswählen.";
	
	public static final String ZIELAUSWAEHLEN = "Bitte Zielfeld auswählen.";
	
	public static final String ZIELAUSWAEHLEN_ERROR = "Bitte ein benachbartes Zielfeld auswählen.";
	
	public static final String STARTFELDAUSWAEHLEN = "Du hast eine 7, bringe eine Figur auf ein Startfeld.";
	
	public static final String STARTFELDAUSWAEHLEN_ERROR = "Bitte ein anderes Startfeld auswählen.";
	
	public static String BEWEGUNGENUEBRIG(int Anzahl) {
		String s = "Du hast noch " + Anzahl + " Bewegungen übrig";
		return s;
	}
	
	
	
	
}
