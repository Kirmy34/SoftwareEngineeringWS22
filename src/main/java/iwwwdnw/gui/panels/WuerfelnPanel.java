package iwwwdnw.gui.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import iwwwdnw.gui.port.Controller;
import iwwwdnw.logic.port.Model;
import iwwwdnw.logic.port.Subject;

public class WuerfelnPanel extends CustomPanel {
	
	Controller controller;
	Subject subject;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel ergebnis;
	private JButton button;

	public WuerfelnPanel(Controller controller, Subject subject) {
		super();
		this.controller = controller;
		this.subject = subject;
		ergebnis = new JLabel("Gewuerfelt:");
		button = new JButton("Wuerfeln!");
		createGUI();
	}

	private void createGUI() {
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.WEST;
		ergebnis.setPreferredSize(new Dimension(175, 15));
		this.addElement(ergebnis, 0, 0);
		this.addElement(button, 0, 1);
		this.button.setBackground(Color.WHITE);
		this.button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.buttonPressed(1000);
			}

		});
	}

	public void update() {
		int[] arr = subject.getWuerfel();
		int sum = arr[0] + arr[1];
		this.ergebnis.setText("Gewuerfelt: " + arr[0] + "," + arr[1] + ". Summe: " + sum);
	}

	public JLabel getErgebnis() {
		return ergebnis;
	}

	public JButton getButton() {
		return button;
	}

}
