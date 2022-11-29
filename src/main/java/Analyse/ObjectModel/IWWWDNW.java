
package Analyse.ObjectModel;

public class IWWWDNW {


	/**
	 * @clientCardinality 1
	 * @link composition
	 * @supplierCardinality 1 
	 */
	private Analyse.ObjectModel.SpielBrett lnkSpielBrett;
	/**
	* @clientCardinality 1
	* @link composition
	* @supplierCardinality 4..*
	*/
	private Analyse.ObjectModel.Wissenskategorie lnkWissenskategorie;
	/**
	* @clientCardinality 1
	* @link composition
	* @supplierCardinality 2..6
	*/
	private Analyse.ObjectModel.Spieler lnkSpieler;

}
