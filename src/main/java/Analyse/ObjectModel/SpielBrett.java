
package Analyse.ObjectModel;

import java.util.HashMap;
import java.util.LinkedList;

public class SpielBrett {


	/**
	 * @clientCardinality 1 
	 * @link composition
	 * @supplierCardinality *
	 */
	private Analyse.ObjectModel.Feld lnkFeld;
	final HashMap<Feld, LinkedList> spielfeld;


	public SpielBrett(int anzahlSpieler) {
	}




	public boolean isNeighbor(Feld feld, Feld neighbor) {
			//Commented automatically
			//return;
			return false;
		}



	public Feld getFeld(int id) {
			//Commented automatically
			//return;
			return null;
		}

}
