package iwwwdnw.gui.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;

import iwwwdnw.spielzug.port.Spieler;

public class SpielbrettPanel extends CustomPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[][] buttons;
	private Spieler[] spieler;
	private static final int SIZE = 15;

	public SpielbrettPanel(Spieler[] spieler) {
		super();
		this.spieler = spieler;
		buttons = new JButton[SIZE][SIZE];
		createGUI();
	}

	private void createGUI() {
		c.insets = new Insets(1, 1, 1, 1);

		// Startfelder
		buttons[0][0] = new RoundButton(spieler[0].getFarbe());
		this.addElement(buttons[0][0], 0, 0);
		buttons[2][2] = new RoundButton(spieler[0].getFarbe());
		this.addElement(buttons[2][2], 2, 2);
		buttons[14][0] = new RoundButton(spieler[1].getFarbe());
		this.addElement(buttons[14][0], 14, 0);
		buttons[12][2] = new RoundButton(spieler[1].getFarbe());
		this.addElement(buttons[12][2], 12, 2);
		buttons[14][14] = new RoundButton(spieler[2].getFarbe());
		this.addElement(buttons[14][14], 14, 14);
		buttons[12][12] = new RoundButton(spieler[2].getFarbe());
		this.addElement(buttons[12][12], 12, 12);
		buttons[0][14] = new RoundButton(spieler[3].getFarbe());
		this.addElement(buttons[0][14], 0, 14);
		buttons[2][12] = new RoundButton(spieler[3].getFarbe());
		this.addElement(buttons[2][12], 2, 12);

		// Äußerer Kreis
		drawALineOfButtons(0, 0, SIZE - 1, 0, true);
		drawALineOfButtons(SIZE - 1, 0, SIZE - 1, SIZE - 1, false);
		drawALineOfButtons(0, SIZE - 1, SIZE - 1, SIZE - 1, true);
		drawALineOfButtons(0, 0, 0, SIZE - 1, false);

		// Innerer Kreis
		drawALineOfButtons(2, 2, SIZE - 3, 2, true);
		drawALineOfButtons(SIZE - 3, 2, SIZE - 3, SIZE - 3, false);
		drawALineOfButtons(2, SIZE - 3, SIZE - 3, SIZE - 3, true);
		drawALineOfButtons(2, 2, 2, SIZE - 3, false);

		// Zwischenfelder
		buttons[7][1] = new RoundButton(Color.BLACK);
		this.addElement(buttons[7][1], 7, 1);
		buttons[13][7] = new RoundButton(Color.BLACK);
		this.addElement(buttons[13][7], 13, 7);
		buttons[7][13] = new RoundButton(Color.BLACK);
		this.addElement(buttons[7][13], 7, 13);
		buttons[1][7] = new RoundButton(Color.BLACK);
		this.addElement(buttons[1][7], 1, 7);
		buttons[1][1] = new RoundButton(Color.BLACK);
		this.addElement(buttons[1][1], 1, 1);
		buttons[13][1] = new RoundButton(Color.BLACK);
		this.addElement(buttons[13][1], 13, 1);
		buttons[13][13] = new RoundButton(Color.BLACK);
		this.addElement(buttons[13][13], 13, 13);
		buttons[1][13] = new RoundButton(Color.BLACK);
		this.addElement(buttons[1][13], 1, 13);

	}

	private void drawALineOfButtons(int x1, int y1, int x2, int y2, boolean horizontal) {

		if (horizontal) {
			for (int i = x1 + 1; i < x2; i++) {
				buttons[i][y1] = new RoundButton(Color.BLACK);
				this.addElement(buttons[i][y1], i, y1);
			}
		} else {
			for (int y = y1 + 1; y < y2; y++) {
				buttons[x1][y] = new RoundButton(Color.BLACK);
				this.addElement(buttons[x1][y], x1, y);
			}
		}

	}

}
