package iwwwdnw.logic.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Frage {
	
	public enum Level{LEICHT, MITTEL, SCHWER}
	private Level level;
	private String fragentext;
	private LinkedHashMap<String, Boolean> antworten = new LinkedHashMap<String, Boolean>();
	
	
	
	
	public String getFragentext() {
		return fragentext;
	}

	public void setFragentext(String fragentext) {
		this.fragentext = fragentext;
	}

	
	
	public void setLevel(Level level)
	{
		this.level = level;
	}
	
	public Level getLevel()
	{
		return this.level;
	}

	public LinkedHashMap<String, Boolean> getAntworten() {
		return antworten;
	}

	public void setAntworten(LinkedHashMap<String, Boolean> antworten) {
		this.antworten = antworten;
	}


	
	
	
	
}
