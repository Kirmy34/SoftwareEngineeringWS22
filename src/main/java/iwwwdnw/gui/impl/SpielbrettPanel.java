package iwwwdnw.gui.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import iwwwdnw.spielzug.port.Spieler;
import iwwwdnw.gui.*;

public class SpielbrettPanel extends CustomPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[][] buttons;
	private Spieler[] spieler;
	private static final int SIZE = 17;
	private ControllerImpl controller;

	public SpielbrettPanel(Spieler[] spieler) {
		super();
		this.spieler = spieler;
		buttons = new JButton[SIZE][SIZE];
		controller = new ControllerImpl();
		createGUI();
	}

	private void createGUI() {
		c.insets = new Insets(1, 1, 1, 1);

		// Startfelder
		createButton(0, 0, 280, spieler[0].getFarbe());
		createButton(16, 0, 281, spieler[1].getFarbe());
		createButton(16, 16, 282, spieler[2].getFarbe());
		createButton(0, 16, 283, spieler[3].getFarbe());

		createButton(3, 3, 284, spieler[0].getFarbe());
		createButton(13, 3, 285, spieler[1].getFarbe());
		createButton(13, 13, 286, spieler[2].getFarbe());
		createButton(3, 13, 287, spieler[3].getFarbe());

		int c = 0;

		// Aeusserer Kreis oben
		for (int i = 1; i < 16; i++) {
			if (i != 7 && i != 9) {
				createButton(i, 0, c++);
			}
		}

		// Auserer Kreis rechts
		for (int i = 1; i < 16; i++) {
			if (i != 7 && i != 9) {
				createButton(16, i, c++);
			}
		}

		// Auserer Kreis unten
		for (int i = 15; i > 0; i--) {
			if (i != 7 && i != 9) {
				createButton(i, 16, c++);
			}
		}

		// Auserer Kreis links
		for (int i = 15; i > 0; i--) {
			if (i != 7 && i != 9) {
				createButton(0, i, c++);
			}
		}

		// Innerer Kreis oben
		for (int i = 4; i < 13; i++) {
			createButton(i, 3, c++);
		}

		// Innerer Kreis rechts
		for (int i = 4; i < 13; i++) {
			createButton(13, i, c++);
		}

		// Innerer Kreis unten
		for (int i = 12; i > 3; i--) {
			createButton(i, 13, c++);
		}

		// Innerer Kreis links
		for (int i = 12; i > 3; i--) {
			createButton(3, i, c++);
		}

		// Zwischenfelder Diagonal
		createButton(1, 1, c++);
		createButton(2, 2, c++);
		createButton(15, 1, c++);
		createButton(14, 2, c++);
		createButton(15, 15, c++);
		createButton(14, 14, c++);
		createButton(1, 15, c++);
		createButton(2, 14, c++);

		// Zwischenfelder Gerade
		createButton(8, 1, c++);
		createButton(8, 2, c++);
		createButton(15, 8, c++);
		createButton(14, 8, c++);
		createButton(8, 15, c++);
		createButton(8, 14, c++);
		createButton(1, 8, c++);
		createButton(2, 8, c++);
	}

	private void createButton(int spalte, int zeile, int id, Color color) {
		this.buttons[spalte][zeile] = new RoundButton(color, id);
		this.addElement(buttons[spalte][zeile], spalte, zeile);

		// Add action Listener
		this.buttons[spalte][zeile].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.buttonPressed(id);
			}
		});
	}

	private void createButton(int spalte, int zeile, int id) {
		createButton(spalte, zeile, id, Color.BLACK);
	}

}
