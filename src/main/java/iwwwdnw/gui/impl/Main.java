package iwwwdnw.gui.impl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import iwwwdnw.spielzug.impl.SpielerImpl;
import iwwwdnw.spielzug.port.Spieler;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//Beispiel Spieler-Array
		Spieler[] spieler = {new SpielerImpl(0, 11, Color.RED.darker().darker(), "Simon"),
				 new SpielerImpl(1, 12, Color.RED, "Franz"),
				 new SpielerImpl(2, 13, Color.RED.brighter().brighter(), "Dietrich"),
				 new SpielerImpl(3, 14, Color.RED.darker(), "Daniel")};
		GamePanel panel = new GamePanel(spieler);
		frame.add(panel);
		
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("IWWWDNW");
		frame.setVisible(true);
	}

}
