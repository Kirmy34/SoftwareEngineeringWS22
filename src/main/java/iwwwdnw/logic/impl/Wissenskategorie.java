package iwwwdnw.logic.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wissenskategorie 
{
	private List<Fragenkarte> fragenkarten = new ArrayList<Fragenkarte>();

	public List<Fragenkarte> getFragenkarten() {
		return fragenkarten;
	}

	public void setFragenkarten(List<Fragenkarte> fragenkarten) {
		
		Collections.shuffle(fragenkarten);
		this.fragenkarten = fragenkarten;
	}
	
	
	public Fragenkarte getFragenkarte()
	{
		for(int i = 0; i < fragenkarten.size(); i++)
		{
			if(!fragenkarten.get(i).wasUsed())
			{
				fragenkarten.get(i).setUsed(true);
				return fragenkarten.get(i);
			}
			else if (i == fragenkarten.size() -1)
			{
				this.setAllUnused();
				Collections.shuffle(this.fragenkarten);
				i = -1;
			}
		}
		
		return null;
		
	}
	
	
	
	public void setAllUnused()
	{
		for(Fragenkarte frage : fragenkarten)
		{
			frage.setUsed(false);
		}
	}


	
	
}
