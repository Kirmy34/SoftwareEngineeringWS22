package iwwwdnw.logic.port;

import java.util.LinkedHashMap;

public interface Frage 
{
	public enum Level{LEICHT, MITTEL, SCHWER}
	public String getFragentext();
	public void setFragentext(String fragentext);
	public void setLevel(Level level);
	public Level getLevel();
	public LinkedHashMap<String, Boolean> getAntworten();
	public void setAntworten(LinkedHashMap<String, Boolean> antworten);
}
