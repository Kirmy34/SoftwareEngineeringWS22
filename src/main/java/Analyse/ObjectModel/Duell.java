
package Analyse.ObjectModel;

public class Duell {



	/**
	 * @clientCardinality 0..*
	 * @link aggregation
	 * @supplierCardinality 1
	 */
	private Analyse.ObjectModel.Wissenskategorie lnkWissenskategorie;
	/**
	 * @clientCardinality 1 
	 * @link aggregation
	 * @supplierCardinality 2
	 */
	private Analyse.ObjectModel.Spieler lnkSpieler;

}
