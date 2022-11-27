package Analyse.ObjectModel;
public class Wissenskategorie {




	/**
	 * @link composition
	 * @supplierCardinality 1..*
	 */
	private Analyse.ObjectModel.Fragenkarte lnkFragenkarte;
	private List<Fragenkarte> Fragen;
	private String name;

	public Fragenkarte getRandomFragenkarte() {
				//Commented automatically
				//return;
				return null;
			}
}
