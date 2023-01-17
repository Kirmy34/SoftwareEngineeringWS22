package iwwwdnw.gui.impl;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import iwwwdnw.logic.port.Model;
import iwwwdnw.logic.port.Subject;

public class MessageLabel extends JLabel {
	
	private Subject subject;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Dimension DIM = new Dimension(400, 50);

	public MessageLabel(Subject subject) {
		super();
		this.subject = subject;
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
		this.setText(subject.getMessage());
	}

}
