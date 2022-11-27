
package Analyse.ObjectModel;

public class Duell {

	private boolean attackerWon;
	private int timer;
	
	/**
	 * @clientCardinality 0..*
	 * @link aggregation
	 * @supplierCardinality 1
	 */
	
	private Wissenskategorie kategorie;
	
	/**
	 * @clientCardinality 1 
	 * @link aggregation
	 * @supplierCardinality 1
	 */
	
	private Spieler defender;
	
	/**
	 * @clientCardinality 1 
	 * @link aggregation
	 * @supplierCardinality 1
	 */
	
	private Spieler attacker;


	public Duell(Spieler attacker, Spieler defender) {
	}

	private void updateWissensStand(Spieler gewinner, Spieler verlierer, Wissenskategorie kategorie) {
		return;
	}
}
