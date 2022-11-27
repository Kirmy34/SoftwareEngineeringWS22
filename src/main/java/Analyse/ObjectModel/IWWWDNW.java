package Analyse.ObjectModel;

import java.util.LinkedList;

public class IWWWDNW {






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
	private LinkedList<Wissenskategorie> wissensKategorien;
	private LinkedList<Spieler> spieler;
	
	/**
	 * @clientCardinality 1
	 * @link composition
	 * @supplierCardinality 1 
	 */
	
	private SpielBrett spielFeld;




	public void spielEnde() {
		return;
	}


	public void spielStart() {
		return;
	}


	public void spielzug() {
		return;
	}
}
