package iwwwdnw.gui.impl;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RoundLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Dimension DIM = new Dimension(30, 30);
	private Color borderColor;
	private static final Color STANDARD_BACKGROUND = Color.WHITE;

	public RoundLabel(Color borderColor) {
		this.setBackground(STANDARD_BACKGROUND);
		this.borderColor = borderColor;
		Dimension size = DIM;
		size.width = size.height = Math.max(size.width, size.height);
		setPreferredSize(DIM);

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(getBackground());
		g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);

	}

	protected void paintBorder(Graphics g) {
		g.setColor(borderColor);
		g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
	}

	Shape shape;

	public boolean contains(int x, int y) {
		if (shape == null || !shape.getBounds().equals(getBounds())) {
			shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}
		return shape.contains(x, y);
	}

}
