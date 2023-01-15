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
	private static final int SIZE = 15;
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
		buttons[0][0] = new RoundButton(spieler[0].getFarbe(), 280);
		this.addElement(buttons[0][0], 0, 0);
		buttons[2][2] = new RoundButton(spieler[0].getFarbe(), 284);
		this.addElement(buttons[2][2], 2, 2);
		buttons[14][0] = new RoundButton(spieler[1].getFarbe(), 281);
		this.addElement(buttons[14][0], 14, 0);
		buttons[12][2] = new RoundButton(spieler[1].getFarbe(), 285);
		this.addElement(buttons[12][2], 12, 2);
		buttons[14][14] = new RoundButton(spieler[2].getFarbe(), 282);
		this.addElement(buttons[14][14], 14, 14);
		buttons[12][12] = new RoundButton(spieler[2].getFarbe(), 286);
		this.addElement(buttons[12][12], 12, 12);
		buttons[0][14] = new RoundButton(spieler[3].getFarbe(), 283);
		this.addElement(buttons[0][14], 0, 14);
		buttons[2][12] = new RoundButton(spieler[3].getFarbe(), 287);
		this.addElement(buttons[2][12], 2, 12);

		// �u�erer Kreis
		
		
		// aeusserer Kreis oben
		
		this.createButton(1, 0, 0);
		this.createButton(2, 0, 1);
		this.createButton(3, 0, 2);
		this.createButton(4, 0, 3);
		this.createButton(5, 0, 4);
		this.createButton(6, 0, 5);
		this.createButton(7, 0, 6);
		this.createButton(8, 0, 7);
		this.createButton(9, 0, 8);
		this.createButton(10, 0, 9);
		this.createButton(11, 0, 10);
		this.createButton(12, 0, 11);
		this.createButton(13, 0, 12);
		
		this.createButton(14, 1, 13);
		this.createButton(14, 2, 14);
		this.createButton(14, 3, 15);
		this.createButton(14, 4, 16);
		this.createButton(14, 5, 17);
		this.createButton(14, 6, 18);
		this.createButton(14, 7, 19);
		this.createButton(14, 8, 20);
		this.createButton(14, 9, 21);
		this.createButton(14, 10, 22);
		this.createButton(14, 11, 23);
		this.createButton(14, 12, 24);
		this.createButton(14, 13, 25);
		
		this.createButton(13, 14, 26);
		this.createButton(12, 14, 27);
		this.createButton(11, 14, 28);
		this.createButton(10, 14, 29);
		this.createButton(9, 14, 30);
		this.createButton(8, 14, 31);
		this.createButton(7, 14, 32);
		this.createButton(6, 14, 33);
		this.createButton(5, 14, 34);
		this.createButton(4, 14, 35);
		this.createButton(3, 14, 36);
		this.createButton(2, 14, 37);
		this.createButton(1, 14, 38);
		
		this.createButton(0, 13, 39);
		this.createButton(0, 12, 40);
		this.createButton(0, 11, 41);
		this.createButton(0, 10, 42);
		this.createButton(0, 9, 43);
		this.createButton(0, 8, 44);
		this.createButton(0, 7, 45);
		this.createButton(0, 6, 46);
		this.createButton(0, 5, 47);
		this.createButton(0, 4, 48);
		this.createButton(0, 3, 49);
		this.createButton(0, 2, 50);
		this.createButton(0, 1, 51);
		
		
		
		
		
		
		
		
		
		
		
		
		// Innerer Kreis
		drawALineOfButtons(2, 2, SIZE - 3, 2, true, temp);
		drawALineOfButtons(SIZE - 3, 2, SIZE - 3, SIZE - 3, false, temp);
		drawALineOfButtons(2, SIZE - 3, SIZE - 3, SIZE - 3, true, temp);
		drawALineOfButtons(2, 2, 2, SIZE - 3, false, temp);

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
		
		
		
		
		// ...
		
		this.buttons[0][0].addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) { 
				    controller.buttonPressed(0);
				  } 


		});

	}
	
	
	private void createButton(int spalte, int zeile, int id)
	{
		this.buttons[spalte][zeile] = new RoundButton(Color.BLACK, id);
		this.addElement(buttons[spalte][zeile], spalte, zeile);
		
	}
	


	
	
	
	
	

}
