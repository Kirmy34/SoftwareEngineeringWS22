package iwwwdnw.gui.impl;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import iwwwdnw.logic.port.Model;

public class MessageLabel extends JLabel {
	
	private Model model;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Dimension DIM = new Dimension(400, 50);

	public MessageLabel(Model model) {
		super();
		this.model = model;
		createGUI();
	}
	
	private void createGUI() {
		this.setOpaque(true);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(DIM);
		LineBorder line = new LineBorder(Color.BLACK, 1, true);
		this.setBorder(line);
	}
	
	public void update() {
		this.setText(model.getMessage());
	}

}
