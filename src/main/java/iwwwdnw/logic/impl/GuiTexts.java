package iwwwdnw.logic.impl;

public class GuiTexts {

	public static String WUERFELN(String name) {
		String s = "Spieler " + name + " ist an der Reihe. Bitte W�rfeln.";
		return s;
	}
	
	public static final String WUERFELN_ERROR = "Bitte auf W�rfeln klicken.";
	
	public static final String WSAUSWAEHLEN = "Bitte einen Wissensstreiter ausw�hlen.";
	
	public static final String WSAUSWAEHLEN_ERROR = "Bitte einen eigenen Wissensstreiter ausw�hlen.";
	
	public static final String ZIELAUSWAEHLEN = "Bitte Zielfeld ausw�hlen.";
	
	public static final String ZIELAUSWAEHLEN_ERROR = "Bitte ein benachbartes Zielfeld ausw�hlen.";
	
	public static final String STARTFELDAUSWAEHLEN = "Du hast eine 7, bringe eine Figur auf ein Startfeld.";
	
	public static final String STARTFELDAUSWAEHLEN_ERROR = "Bitte ein anderes Startfeld ausw�hlen.";
	
	public static String BEWEGUNGENUEBRIG(int Anzahl) {
		String s = "Du hast noch " + Anzahl + " Bewegungen �brig";
		return s;
	}
	
	
	
	
}
