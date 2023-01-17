package iwwwdnw.gui.panels;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import iwwwdnw.gui.impl.RoundLabel;
import iwwwdnw.spielzug.port.Spieler;

public class WissensstreiterPanel extends CustomPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel[][] wissensstreiter;
	private Spieler[] spieler;
	private static final int STANDARD_ANZAHL_WISSENSTREITER = 5;

	public WissensstreiterPanel(Spieler[] spieler) {
		
		super();
		this.spieler = spieler;
		wissensstreiter = new JLabel[STANDARD_ANZAHL_WISSENSTREITER][spieler.length];
		createGUI();

	}

	private void createGUI() {
		c.insets = new Insets(2, 2, 2, 2);
		for (int i = 0; i < wissensstreiter.length; i++) {
			for (int y = 0; y < wissensstreiter[i].length; y++) {
				JLabel label = new RoundLabel(spieler[y].getFarbe());
				wissensstreiter[i][y] = label;
				this.addElement(wissensstreiter[i][y], i, y);

			}
		}
		// initialize
		update();
	}

	public void update() {
		for(int y= 0; y < spieler.length; y++) {
			int sum = 0;
			for(int w = 0; w<spieler[y].getWissensstreiter().length; w++) {
				if(spieler[y].getWissensstreiter()[w].istAufHeimatFeld()) {
					sum++;
				}
			}
			for(int i = STANDARD_ANZAHL_WISSENSTREITER-1; i>=0; i--) {
				if(sum>0) {
					wissensstreiter[i][y].setBackground(spieler[y].getFarbe());
				} else {
					wissensstreiter[i][y].setBackground(Color.WHITE);
				}
				sum--;
			}
		}
		
	}
}
