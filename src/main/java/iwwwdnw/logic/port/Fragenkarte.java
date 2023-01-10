package iwwwdnw.logic.port;

public interface Fragenkarte 
{
	public Frage[] getFragen();
	public void setFragen(Frage[] fragen);
	public boolean wasUsed();
	public void setUsed(boolean used);
	
	
}
