package iwwwdnw.gui.panels;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

import iwwwdnw.spielzug.port.Spieler;

public class WissensstandsanzeigerPanel extends CustomPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel[][] wissensstand;
	private static final int STANDARD_ANZAHL_WISSENSKATEGORIEN = 4;
	private Spieler[] spieler;

	public WissensstandsanzeigerPanel(Spieler[] spieler) {

		super();
		this.spieler = spieler;
		wissensstand = new JLabel[STANDARD_ANZAHL_WISSENSKATEGORIEN + 1][spieler.length + 1];
		createGUI();

	}

	private void createGUI() {
		
		for (int i = 0; i < wissensstand.length; i++) {
			for (int y = 0; y < wissensstand[i].length; y++) {
				JLabel label = new JLabel();
				label.setPreferredSize(new Dimension(31, 31));
				label.setHorizontalAlignment(JLabel.CENTER);
				label.setOpaque(true);
				label.setBackground(Color.WHITE);

				wissensstand[i][y] = label;
				this.addElement(wissensstand[i][y], i, y);

			}
		}
		wissensstand[0][0].setText("I");
		wissensstand[1][0].setText("II");
		wissensstand[2][0].setText("III");
		wissensstand[3][0].setText("IV");
		wissensstand[4][0].setText("\u03A3");

		for (int y = 1; y <= spieler.length; y++) {
			for (int i = 0; i <= STANDARD_ANZAHL_WISSENSKATEGORIEN; i++) {
				if (i != STANDARD_ANZAHL_WISSENSKATEGORIEN) {
					wissensstand[i][y].setBackground(spieler[y - 1].getFarbe());
					wissensstand[i][y].setForeground(Color.WHITE);
					wissensstand[i][y].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				}
			}
		}
		// initialize
		update();

	}

	public void update() {
		for(int y = 1; y <= spieler.length; y++) {
			int sum = 0;
			for(int i = 0; i < STANDARD_ANZAHL_WISSENSKATEGORIEN; i++) {
				
				int point = spieler[y-1].getWissensstandsanzeige()[i];
				sum = sum + point;
				wissensstand[i][y].setText(String.valueOf(point));
			}
			wissensstand[STANDARD_ANZAHL_WISSENSKATEGORIEN][y].setText(String.valueOf(sum));
		}
	}

}
